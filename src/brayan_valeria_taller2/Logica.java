package brayan_valeria_taller2;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {
	private PApplet app;
	private Mundo mundo;
	private PImage fondo;

	public Logica(PApplet app) {
		this.app = app;
		mundo = new Mundo(app);
		fondo = app.loadImage("data/fondo.png");
	}

	public void pintar() {

		app.image(fondo, 0, 0);
		mundo.pintar();
		

	}

//	public void mover() {
//
//	}

	public void tecla() {
		mundo.serpienteTecla();
	}

}
