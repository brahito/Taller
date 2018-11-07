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
		app.image(hielo, x, y);
	}

	@Override
	public void accion() {
		// TODO Auto-generated method stub
	}

	public void mover() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
