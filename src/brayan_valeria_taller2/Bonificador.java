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
		x = (int) app.random((app.width - tam) - 1150, (app.width - tam) - 50);
		y = (int) app.random((app.height - tam) - 650, (app.height - tam) - 50);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
