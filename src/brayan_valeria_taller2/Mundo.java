package brayan_valeria_taller2;

import java.util.LinkedList;

import processing.core.PApplet;

public class Mundo {
	private PApplet app;
<<<<<<< HEAD
	private LinkedList<Arana> arañas;
	private LinkedList<Serpiente> segmentos;
	private LinkedList<Recursos> fresas;
=======
	private LinkedList<Araña> arañas;
//	private LinkedList<Serpiente> segmentos;
>>>>>>> d873e19fad6183b62b82f35ed5363f590c800b2b
	private LinkedList<Bonificador> bonificadores;
	private int contador, contadorFresas, contadorBonificador, generarBonificador;
	private Serpiente serpiente;
	private Recurso fresa;

	public Mundo(PApplet app) {
		this.app = app;
		fresa = new Recurso(app);
		bonificadores = new LinkedList<Bonificador>();
		serpiente = new Serpiente(app, this);
		serpiente.start();
		
	}

	public void pintar() {
		fresa.pintar();
		serpiente.pintar();
		
	}

	public void generarRecurso() {

	}

	public void generarBonificacion() {

	}

	public Serpiente getSer() {
		return serpiente;
	}

	public void serpienteTecla() {
		serpiente.mover();
	}

	public Recurso getRecurso() {
		return fresa;
	}

	public void setRecurso(Recurso fresa) {
		this.fresa = fresa;
	}
}
