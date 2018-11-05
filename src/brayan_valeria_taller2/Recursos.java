package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PImage;

public class Recursos {
	private PApplet app;
	private int x, y, nivel;
	private PImage fresa;

	public Recursos(PApplet app) {
		this.app = app;
		fresa= app.loadImage("data/fresa.png");
	}

	public void pintar() {
       app.image(fresa, x, y);
	}
}
