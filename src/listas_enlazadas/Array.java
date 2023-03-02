package listas_enlazadas;

public class Array {
    public Nodo_double inicio;

	public void insertstart(Integer d) {
		Nodo_double nuevo = new Nodo_double(d);
		if (inicio == null) {
			inicio = nuevo;

		} else {
			nuevo.setNext(inicio);
			inicio.setFormer(nuevo);
			inicio = inicio.getFormer();

		}

	}

	public void insertend(Integer d) {
		Nodo_double nuevo = new Nodo_double(d);
		if (inicio == null) {
			inicio = nuevo;
		} else {
			Nodo_double aux = inicio;
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(nuevo);
			nuevo.setFormer(aux);

		}
	}

	public void runnner() {
		Nodo_double aux = inicio;
		while (aux != null) {
			System.out.println(aux.getDato());
			aux = aux.getNext();
		}
	}

	public void runnerback() {
		Nodo_double aux = inicio;
		while (aux.getNext() != null) {
			aux = aux.getNext();
		}

		while (aux != null) {
			System.out.println(aux.getDato());
			aux = aux.getFormer();
		}

	}

}

