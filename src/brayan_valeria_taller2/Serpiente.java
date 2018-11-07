package brayan_valeria_taller2;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Serpiente extends Thread {
	private PApplet app;
	private PImage cabeza1, cabeza2, cabeza3, cabeza4, segmento;
	private int up = 1, down = 2, left = 3, right = 4;
	private int direction;
	private boolean vivo;
	private int n = 1;
	private float tam;
	private ArrayList<Float> x, y;
	private Mundo mundo;

	public Serpiente(PApplet app, Mundo mundo) {
		this.app = app;
		this.mundo = mundo;
		x = new ArrayList<Float>();
		y = new ArrayList<Float>();
		cabeza1 = app.loadImage("data/headdown.png");
		cabeza2 = app.loadImage("headup.png");
		cabeza3 = app.loadImage("headright.png");
		cabeza4 = app.loadImage("headleft.png");
		segmento = app.loadImage("body.png");
		tam = 20;
		vivo = true;
		direction = right;
		x.add(50.0f);
		y.add(50.0f);

	}

	public void pintar() {
		// serpiente
		crearSerpiente();
	}

	public void run() {
		try {
			while (vivo) {
				moverSerpiente();
				if (validar(mundo.getRecurso()) == true) {
					agregarCola();
					mundo.getRecurso().ponerFresa();
				}
				for (int i = 0; i < mundo.getBonificadores().size(); i++) {
					if (validarBonificador(mundo.getBonificadores().get(i)) == true) {
						mundo.getBonificadores().remove(i);
					}
				}
				sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void crearSerpiente() {
		for (int i = 0; i < n; i++) {
			float xLocation = x.get(i);
			float yLocation = y.get(i);

			if (xLocation > app.width + tam / 2)
				x.set(i, (float) (0.0 + tam / 2));
			if (xLocation < 0 - tam / 2)
				x.set(i, (float) (app.width - tam / 2));

			if (yLocation >= app.height + tam / 2)
				y.set(i, (float) (0.0 + tam / 2));
			if (yLocation <= 0 - tam / 2)
				y.set(i, (float) (app.height - tam / 2));
			if (i == x.size() - 1) {
				app.imageMode(app.CENTER);
				if (direction == down) {
					app.image(cabeza1, xLocation, yLocation, tam, tam);
				}
				if (direction == up) {
					app.image(cabeza2, xLocation, yLocation, tam, tam);
				}
				if (direction == right) {
					app.image(cabeza3, xLocation, yLocation, tam, tam);
				}
				if (direction == left) {
					app.image(cabeza4, xLocation, yLocation, tam, tam);
				}
				app.imageMode(app.CORNER);
			} else {
				app.imageMode(app.CENTER);
				app.image(segmento, xLocation, yLocation, tam, tam);
				app.imageMode(app.CORNER);
			}
		}
	}

	public boolean validar(Recurso fresa) {
		if (PApplet.dist(x.get(x.size() - 1), y.get(y.size() - 1), fresa.getX(), fresa.getY()) < tam) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validarBonificador(Bonificador boni) {
		if (PApplet.dist(x.get(x.size() - 1), y.get(y.size() - 1), boni.getX(), boni.getY()) < tam) {
			return true;
		} else {
			return false;
		}
	}

	void moverSerpiente() {

		if (direction == right) {
			x.add(x.get(x.size() - 1) + tam);
			y.add(y.get(y.size() - 1));

			x.remove(0);
			y.remove(0);
		} else if (direction == down) {
			x.add(x.get(x.size() - 1));
			y.add(y.get(y.size() - 1) + tam);

			x.remove(0);
			y.remove(0);
		} else if (direction == left) {
			x.add(x.get(x.size() - 1) - tam);
			y.add(y.get(y.size() - 1));

			x.remove(0);
			y.remove(0);
		} else if (direction == up) {
			x.add(x.get(x.size() - 1));
			y.add(y.get(y.size() - 1) - tam);

			x.remove(0);
			y.remove(0);
		}
	}

	void agregarCola() {
		n += 1;

		switch (direction) {
		case 1:
			x.add(x.get(x.size() - 1));
			y.add(y.get(y.size() - 1) - tam);
			n = x.size();
			break;

		case 2:
			x.add(x.get(x.size() - 1));
			y.add(y.get(y.size() - 1) + tam);
			n = x.size();
			break;

		case 3:
			x.add(x.get(x.size() - 1) - tam);
			y.add(y.get(y.size() - 1));
			n = x.size();
			break;

		case 4:
			x.add(x.get(x.size() - 1) + tam);
			y.add(y.get(y.size() - 1));
			n = x.size();
			break;
		}
	}

	public void mover() {
		if (direction == right) {
			if (app.key == 'w')
				direction = up;
			if (app.key == 's')
				direction = down;
			if (app.key == 'd')
				direction = right;
		}
		if (direction == left) {
			if (app.key == 'w')
				direction = up;
			if (app.key == 's')
				direction = down;
			if (app.key == 'a')
				direction = left;
		}
		if (direction == up) {
			if (app.key == 'w')
				direction = up;
			if (app.key == 'a')
				direction = left;
			if (app.key == 'd')
				direction = right;
		}
		if (direction == down) {
			if (app.key == 's')
				direction = down;
			if (app.key == 'a')
				direction = left;
			if (app.key == 'd')
				direction = right;
		}
	}

	// public boolean morder(Arañas a) {
	//
	// }

	public ArrayList<Float> getX() {
		return x;
	}

	public ArrayList<Float> getY() {
		return y;
	}

	public void eliminarSegmento() {

	}

}
