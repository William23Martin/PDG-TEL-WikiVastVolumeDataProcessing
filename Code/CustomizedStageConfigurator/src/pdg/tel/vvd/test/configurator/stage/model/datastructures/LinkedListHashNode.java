package pdg.tel.vvd.test.configurator.stage.model.datastructures;

public class LinkedListHashNode<K, T> {

	private HashTableNode<K, T> primero, ultimo;

	public LinkedListHashNode() {
		primero = null;
		ultimo = null;
	}

	public HashTableNode<K, T> getPrimero() {
		return primero;
	}

	public void setPrimero(HashTableNode<K, T> primero) {
		this.primero = primero;
	}

	public HashTableNode<K, T> getUltimo() {
		return ultimo;
	}

	public void setUltimo(HashTableNode<K, T> ultimo) {
		this.ultimo = ultimo;
	}

	public boolean estaVacia() {
		return primero == null && ultimo == null;
	}

	public void agregarElemento(K llave, T valor) {
		HashTableNode<K, T> nodoNuevo = new HashTableNode<K, T>(llave, valor);
		if (estaVacia()) {
			primero = nodoNuevo;
			ultimo = nodoNuevo;
		} else {
			ultimo.setSiguiente(nodoNuevo);
			ultimo = nodoNuevo;
		}
	}

	public boolean contieneElemento(K llave, T valor) {
		HashTableNode<K, T> nodoEncontrar = new HashTableNode<K, T>(llave,
				valor);
		boolean encontrado = false;
		if (estaVacia()) {
			return false;
		} else {
			HashTableNode<K, T> actual = primero;
			while (actual != null && !encontrado) {
				if (actual.semejantes(nodoEncontrar)) {
					encontrado = true;
				} else {
					actual = actual.getSiguiente();
				}
			}
		}
		return encontrado;
	}

	public void eliminarElemento(K llave, T valor)
			throws LinkedListHashNodeException {
		HashTableNode<K, T> nodoEliminar = new HashTableNode<K, T>(llave, valor);
		if (estaVacia()) {
			throw new LinkedListHashNodeException(
					"La lista no contiene elementos");
		} else if (primero.iguales(nodoEliminar)) {
			primero = primero.getSiguiente();
		} else {
			HashTableNode<K, T> actual = primero.getSiguiente();
			HashTableNode<K, T> anterior = primero;
			boolean encontrado = false;
			while (!encontrado && actual != null) {
				if (actual.iguales(nodoEliminar)) {
					encontrado = true;
					anterior.setSiguiente(actual.getSiguiente());
				} else {
					anterior = actual;
					actual = actual.getSiguiente();
				}
			}
			if (encontrado == false) {
				throw new LinkedListHashNodeException(
						"El elemento no se encuentra en la lista.");
			}
		}
	}

	public int numeroElementos() {
		int numeroElementos = 0;
		if (estaVacia()) {
			return 0;
		} else {
			HashTableNode<K, T> actual = primero;
			while (actual != null) {
				numeroElementos++;
				actual = actual.getSiguiente();
			}
		}
		return numeroElementos;
	}

	public HashTableNode<K, T> buscarElemento(K llave, T valor)
			throws LinkedListHashNodeException {
		HashTableNode<K, T> nodoEncontrar = new HashTableNode<K, T>(llave,
				valor);
		boolean encontrado = false;
		if (estaVacia()) {
			throw new LinkedListHashNodeException(
					"No hay elementos en la lista");
		} else {
			HashTableNode<K, T> actual = primero;
			while (actual != null && !encontrado) {
				if (actual.equals(nodoEncontrar)) {
					return actual;
				} else {
					actual = actual.getSiguiente();
				}
			}
		}
		throw new LinkedListHashNodeException("El elemento no se encuentra");
	}

}
