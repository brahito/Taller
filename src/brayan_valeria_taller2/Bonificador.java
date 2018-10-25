package brayan_valeria_taller2;

import processing.core.PApplet;

public abstract class Bonificador {
	protected PApplet app;
	protected int x, y;

	public Bonificador(PApplet app) {
		this.app = app;
	}

	public abstract void pintar();

	public abstract void accion();

}
