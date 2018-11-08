package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PImage;

public class Recurso {
	private PApplet app;
	private float x, y, tam;
	private PImage fresa;

	public Recurso(PApplet app) {
		this.app = app;
		fresa = app.loadImage("data/fresa.png");
		tam = 25;
		ponerFresa();
	}

	public void pintar() {
		app.fill(255, 0, 0);
		app.imageMode(app.CENTER);
		app.image(fresa, x, y, tam, tam);
		app.imageMode(app.CORNER);
	}

	public void ponerFresa() {
		x = (int) app.random((app.width - tam) - 1100, (app.width - tam) - 100);
		y = (int) app.random((app.height - tam) - 600, (app.height - tam) - 100);
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
