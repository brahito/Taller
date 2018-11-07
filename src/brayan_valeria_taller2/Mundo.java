package brayan_valeria_taller2;

import java.util.ArrayList;
import java.util.LinkedList;

import processing.core.PApplet;

public class Mundo {
	private PApplet app;

	private ArrayList<Arana> aranas;
	private LinkedList<Bonificador> bonificadores;
	private int contador, contadorFresas, contadorBonificador, generarBonificador;
	private Serpiente serpiente;
	private Recurso fresa;

	public Mundo(PApplet app) {
		this.app = app;
		fresa = new Recurso(app);
		aranas = new ArrayList<Arana>();
		bonificadores = new LinkedList<Bonificador>();
		for (int i = 0; i < 3; i++) {
			aranas.add(new AranaA(app));
		}

		serpiente = new Serpiente(app, this);
		serpiente.start();

	}

	public void pintar() {
		fresa.pintar();
		serpiente.pintar();
		for (int i = 0; i < aranas.size(); i++) {
			aranas.get(i).pintar();
		}

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
