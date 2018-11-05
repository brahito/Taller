package brayan_valeria_taller2;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Serpiente extends Thread {
	private PApplet app;
//	private PImage cabeza, segmentos;
	private int up = 1, down = 2, left = 3, right = 4;
	private int direction;
	private boolean vivo;
	private int n = 1;
<<<<<<< HEAD
	private float distance = 20.0f;
	private float fresaX, fresaY;
	private ArrayList<Float> x, y;
	private PImage cabeza, cuerpo;
=======
	private float tam;
	private ArrayList<Float> x, y;
	private Mundo mundo;
>>>>>>> d873e19fad6183b62b82f35ed5363f590c800b2b

	public Serpiente(PApplet app, Mundo mundo) {
		this.app = app;
		this.mundo = mundo;
		x = new ArrayList<Float>();
		y = new ArrayList<Float>();
		tam = 20;
		vivo = true;
		direction = right;
		x.add(50.0f);
		y.add(50.0f);
		for (int i = 1; i < n; i++) {
			x.add(x.get(0) - i * tam);
			y.add(y.get(0));
		}
<<<<<<< HEAD
		ponerFresa();
		cabeza=app.loadImage("data/headright.png");
		cuerpo= app.loadImage("data/body.png");
	}

	public void pintar() {

		// Fresas

		crearFresa();

		// serpientes
		crearSerpiente();
		
	
=======
	}

	public void pintar() {
		// serpientes
		crearSerpiente();
>>>>>>> d873e19fad6183b62b82f35ed5363f590c800b2b
	}

	public void run() {
		try {
			while (vivo) {
				moverSerpiente();
<<<<<<< HEAD
				if (PApplet.dist(x.get(x.size() - 1), y.get(y.size() - 1), fresaX, fresaY) < distance) {
					agregarCola();
					ponerFresa();
=======
				if (validar(mundo.getRecurso()) == true) {
					agregarCola();
					mundo.getRecurso().ponerFresa();
>>>>>>> d873e19fad6183b62b82f35ed5363f590c800b2b
				}
				sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

<<<<<<< HEAD
	void ponerFresa() {
		fresaX = app.random(app.width - distance);
		fresaY = app.random(app.height - distance);
	}


	void crearFresa() {
		app.fill(255, 0, 0);
		app.ellipse(fresaX, fresaY, distance, distance);
	}


=======
>>>>>>> d873e19fad6183b62b82f35ed5363f590c800b2b
	void crearSerpiente() {
//		app.fill(255, 255, 0);
		for (int i = 0; i < n; i++) {
			float xLocation = x.get(i);
			float yLocation = y.get(i);

			if (xLocation > app.width + tam / 2)
				x.set(i, (float) (0.0 + tam / 2));
			if (xLocation < 0 - tam / 2)
				x.set(i, (float) (app.width - tam / 2));

			if (yLocation >= app.height + tam / 2)
				y.set(i, (float) (0.0 + tam / 2));
			if (yLocation <= 0 - tam / 2)
				y.set(i, (float) (app.height - tam / 2));

<<<<<<< HEAD
			//app.ellipse(xLocation, yLocation, distance, distance);
			
			if(n==0) {
				app.image(cabeza, xLocation, yLocation);
			}
			if(n>0) {
				app.image(cuerpo, xLocation, yLocation);
			}
			
=======
			app.ellipse(xLocation, yLocation, tam, tam);
		}
	}

	public boolean validar(Recurso fresa) {
		if (PApplet.dist(x.get(x.size() - 1), y.get(y.size() - 1), fresa.getX(), fresa.getY()) < tam) {
			return true;
		} else {
			return false;
>>>>>>> d873e19fad6183b62b82f35ed5363f590c800b2b
		}
	}

	void moverSerpiente() {

		if (direction == right) {
			x.add(x.get(x.size() - 1) + tam);
			y.add(y.get(y.size() - 1));

			x.remove(0);
			y.remove(0);
		} else if (direction == down) {
			x.add(x.get(x.size() - 1));
			y.add(y.get(y.size() - 1) + tam);

			x.remove(0);
			y.remove(0);
		} else if (direction == left) {
			x.add(x.get(x.size() - 1) - tam);
			y.add(y.get(y.size() - 1));

			x.remove(0);
			y.remove(0);
		} else if (direction == up) {
			x.add(x.get(x.size() - 1));
			y.add(y.get(y.size() - 1) - tam);

			x.remove(0);
			y.remove(0);
		}
	}

	void agregarCola() {
		n += 1;

		switch (direction) {
		case 1:
			x.add(x.get(x.size() - 1));
			y.add(y.get(y.size() - 1) - tam);
			n = x.size();
			break;

		case 2:
			x.add(x.get(x.size() - 1));
			y.add(y.get(y.size() - 1) + tam);
			n = x.size();
			break;

		case 3:
			x.add(x.get(x.size() - 1) - tam);
			y.add(y.get(y.size() - 1));
			n = x.size();
			break;

		case 4:
			x.add(x.get(x.size() - 1) + tam);
			y.add(y.get(y.size() - 1));
			n = x.size();
			break;
		}
	}

	public void mover() {
		if (direction == right) {
			if (app.key == 'w')
				direction = up;
			if (app.key == 's')
				direction = down;
			if (app.key == 'd')
				direction = right;
		}
		if (direction == left) {
			if (app.key == 'w')
				direction = up;
			if (app.key == 's')
				direction = down;
			if (app.key == 'a')
				direction = left;
		}
		if (direction == up) {
			if (app.key == 'w')
				direction = up;
			if (app.key == 'a')
				direction = left;
			if (app.key == 'd')
				direction = right;
		}
		if (direction == down) {
			if (app.key == 's')
				direction = down;
			if (app.key == 'a')
				direction = left;
			if (app.key == 'd')
				direction = right;
		}
	}

//	public boolean validar(Fresas f) {
//		
//	}
//	public boolean morder(Arañas a) {
//		
//	}

	public ArrayList<Float> getX() {
		return x;
	}

	public ArrayList<Float> getY() {
		return y;
	}

	public void eliminarSegmento() {

	}

}
