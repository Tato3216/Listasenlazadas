package listas_enlazadas;

public class Nodo_double {
    

	public Nodo_double next;
	public Nodo_double former;
	public Integer dato;

	public Nodo_double(Integer d) {
		this.dato = d;
		this.next = null;
		this.former = null;
	}

	public Nodo_double getNext() {
		return next;
	}

	public void setNext(Nodo_double next) {
		this.next = next;
	}

	public Nodo_double getFormer() {
		return former;
	}

	public void setFormer(Nodo_double former) {
		this.former = former;
	}

	public Integer getDato() {
		return dato;
	}

	public void setDato(Integer dato) {
		this.dato = dato;
	}

}

