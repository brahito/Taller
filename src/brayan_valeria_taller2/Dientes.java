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
		app.image(dientes, x, y);
	}

	@Override
	public void accion() {
		// TODO Auto-generated method stub
	}

}
