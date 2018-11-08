package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PImage;

public class Cafe extends Bonificador {
	private PImage cafe;

	public Cafe(PApplet app) {
		super(app);
		cafe = app.loadImage("cafe.png");
	}

	@Override
	public void pintar() {
		app.image(cafe, x, y);
	}

	@Override
	public void accion() {
		// TODO Auto-generated method stub

	}

}
