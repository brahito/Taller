package brayan_valeria_taller2;

import processing.core.PApplet;

public class Main extends PApplet {
	private Logica log;

	public static void main(String[] args) {
		PApplet.main("brayan_valeria_taller2.Main");
	}

	public void settings() {
		size(1200, 700);
	}

	public void setup() {
		log = new Logica(this);
	}

	public void draw() {
		background(255);
		log.pintar();
	}

	public void keyPressed() {
		log.tecla();
	}

}
