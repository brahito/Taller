package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PImage;

public class Dientes extends Bonificador {
	PImage dientes;

	public Dientes(PApplet app) {
		super(app);
		dientes = app.loadImage("dientes.png");
	}

	@Override
	public void pintar() {

		app.imageMode(app.CENTER);
		app.image(dientes, x, y, tam, tam);
		app.imageMode(app.CORNER);
	}

}
