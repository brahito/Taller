package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PImage;

public class Hongo extends Bonificador implements Runnable {
	private PImage hongo;

	public Hongo(PApplet app) {
		super(app);
		hongo = app.loadImage("hongo.png");
	}

	@Override
	public void pintar() {

		app.imageMode(app.CENTER);
		app.image(hongo, x, y, tam, tam);
		app.imageMode(app.CORNER);
	}

	public void mover() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
