package py.uca.edu.diplomado.clase03;

import py.edu.uca.diplomado.clase02.Auto;

public class MateriaApp {

	private Materia algoritmia;
	private Materia java1;

	public MateriaApp() {
		algoritmia = new Materia("DW00");
		java1 = new Materia("DW06");
		Materia.transporte.setMarca("Honda");
		Materia.transporte = new Auto();
		algoritmia.transporte.setMarca("Toyota");
		java1.transporte.setMarca("Hyundai");


	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MateriaApp aplicacion = new MateriaApp();
		System.out.println("Transporte Algoritmia: "
				+ aplicacion.getAlgoritmia().transporte.getMarca());
		System.out.println("Codigo: " + aplicacion.getAlgoritmia().getCodigo());
		System.out.println("Transporte Java1: "
				+ aplicacion.getJava1().transporte.getMarca());
		System.out.println("Codigo: " + aplicacion.getJava1().getCodigo());

	}

	public Materia getAlgoritmia() {
		return algoritmia;
	}

	public void setAlgoritmia(Materia algoritmia) {
		this.algoritmia = algoritmia;
	}

	public Materia getJava1() {
		return java1;
	}

	public void setJava1(Materia java1) {
		this.java1 = java1;
	}

}
