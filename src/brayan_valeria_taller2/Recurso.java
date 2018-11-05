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
		x = (int) app.random((app.width - tam)-1150,(app.width - tam)-50);
		y = (int) app.random((app.height - tam)-650,(app.height - tam)-50);
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
