package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PImage;

public class Hielo extends Bonificador implements Runnable {
	private PImage hielo;

	public Hielo(PApplet app) {
		super(app);
		hielo = app.loadImage("hielo.png");
	}

	@Override
	public void pintar() {

		app.imageMode(app.CENTER);
		app.image(hielo, x, y, tam, tam);
		app.imageMode(app.CORNER);
	}

	public void mover() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
