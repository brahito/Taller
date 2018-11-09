package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public abstract class Arana extends Thread {
	protected PApplet app;
	protected int nivel;
	protected PVector pos, vel, ace;
	protected PImage arana;
	protected int fresas;
	protected float max;
	protected boolean vivo, congelado, encafeinado, dientes;
	protected int tam, contadorHielo, contadorCafe, ran, contadorDientes;
	protected Mundo mundo;

	public Arana(PApplet app, Mundo mundo) {
		this.app = app;
		this.mundo = mundo;
		contadorHielo = 0;
		dientes = false;
		vivo = true;
	}

	public abstract void pintar();

	public void run() {
		try {
			while (vivo) {
				if (congelado == false) {
					mover(mundo.getRecurso());
				}
				if (congelado == true) {
					contadorHielo++;
				}
				if (contadorHielo == 40) {
					contadorHielo = 0;
					congelado = false;
				}
				if (encafeinado == true) {
					max *= 1.5f;
					tam = 50;
					contadorCafe++;
				} else {
					tam = 40;
					max = ran;
				}
				if (contadorCafe == 100) {
					contadorCafe = 0;
					encafeinado = false;
				}
				if (dientes == true) {
					contadorDientes++;
				}
				if (contadorDientes == 50) {
					contadorDientes = 0;
					dientes = false;
				}
				if (validar(mundo.getRecurso()) == true) {
					mundo.getRecurso().ponerFresa();
					fresas++;
					ace.x = 0;
					ace.y = 0;
				}
				for (int i = 0; i < mundo.getBonificadores().size(); i++) {
					if (validarBonificador(mundo.getBonificadores().get(i)) == true) {
						if (mundo.getBonificadores().get(i) instanceof Hongo) {
							fresas /= 2;
						}
						if (mundo.getBonificadores().get(i) instanceof Hielo) {
							congelado = true;
						}
						if (mundo.getBonificadores().get(i) instanceof Cafe) {
							encafeinado = true;
						}
						if (mundo.getBonificadores().get(i) instanceof Dientes) {
							dientes = true;
						}
						mundo.getBonificadores().remove(i);
					}

				}
			
				sleep(50);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void quitarFresa() {
		fresas--;
	}

	public void quitarTodo() {
		fresas -= fresas;
	}

	public boolean validar(Recurso fresa) {
		if (PApplet.dist(pos.x, pos.y, fresa.getX(), fresa.getY()) < fresa.getTam()) {
			return true;
		} else {
			return false;

		}
	}

	public boolean validarBonificador(Bonificador boni) {
		if (PApplet.dist(pos.x, pos.y, boni.getX(), boni.getY()) < boni.getTam()) {
			return true;
		} else {
			return false;
		}
	}

	// public boolean validarSerpiente(Serpiente s) {
	//
	// if (PApplet.dist(pos.x, pos.y, s.getX().size() - 1, s.getY().size() - 1) <
	// s.getTam()) {
	// return true;
	// } else {
	// return false;
	//
	// }
	//
	// }

	public PVector getPos() {
		return pos;
	}

	public int getFresas() {
		return fresas;
	}

	public abstract void mover(Recurso r);

	public void eliminarAraña() {

	}
}
