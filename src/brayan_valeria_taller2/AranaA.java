package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PVector;

public class AranaA extends Arana {
	public AranaA(PApplet app) {
		super(app);
		arana = app.loadImage("aranaA.png");
		pos = new PVector(app.random(app.width), app.random(app.height));
	}

	@Override
	public void pintar() {
		app.image(arana, pos.x, pos.y, tam, tam);
	}

	@Override
	public void mover() {

	}

}
