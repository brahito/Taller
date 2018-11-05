package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PImage;

public class Recurso {
	private PApplet app;
	private float x, y, tam;

	public Recurso(PApplet app) {
		this.app = app;

		tam = 20;
		ponerFresa();
	}

	public void pintar() {
		app.fill(255, 0, 0);
		app.ellipse(x, y, tam, tam);
	}

	public void ponerFresa() {
		x = (int) app.random(app.width - tam);
		y = (int) app.random(app.height - tam);
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getTam() {
		return tam;
	}

}
