package brayan_valeria_taller2;

import java.util.LinkedList;

import processing.core.PApplet;

public class Mundo {
	private PApplet app;
	private LinkedList<Araña> arañas;
	private LinkedList<Serpiente> segmentos;
	private LinkedList<Recursos> fresas;
	private LinkedList<Bonificador> bonificadores;
	private int contador, contadorFresas, contadorBonificador, generarBonificador;
	private Serpiente serpiente;

	public Mundo(PApplet app) {
		this.app = app;
		serpiente = new Serpiente(app);
		serpiente.start();
	}

	public void pintar() {
		serpiente.pintar();
	}
	public void serpienteTecla() {
		serpiente.mover();
	}

	public void agregarSegmento() {

	}

	public void eliminarSegmento() {

	}

	public void eliminarAraña() {

	}

	public void generarRecurso() {

	}

	public void generarBonificacion() {

	}
}
