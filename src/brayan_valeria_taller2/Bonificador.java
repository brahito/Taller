package brayan_valeria_taller2;

import processing.core.PApplet;

public abstract class Bonificador {
	protected PApplet app;
	protected int x, y, tam;
	protected boolean vivo;

	public Bonificador(PApplet app) {
		tam = 30;
		this.app = app;
		ponerBonificador();
	}

	public abstract void pintar();

	public void ponerBonificador() {
		x = (int) app.random((app.width - tam) - 1100, (app.width - tam) - 100);
		y = (int) app.random((app.height - tam) - 600, (app.height - tam) - 100);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getTam() {
		return tam;
	}

}
