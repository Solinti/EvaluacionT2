package pregunta_01;

public class ArregloPrecios {
	private double precio[]; 
	private int indice; 
	
	public ArregloPrecios() { 
		precio = new double[10]; 
		indice = 0; 
	}
	
	public int tamano() { 
		return indice; 
	} 
	
	public double obtener(int p) { 
		return precio[p]; 
	}
	
	public void adicionar(double s) { 
		if (indice == tamano()) 
			ampliarArreglo(); 
		precio[indice] = s; 
		indice++; 
	}
	
	private void ampliarArreglo() { 
		double aux[] = precio; 
		precio = new double[indice + 10]; 
		for (int i = 0; i < indice; i++) 
			precio[i] = aux[i]; 
	}
	
	public void eliminarTodo() { 
		indice = 0; 
	}
	
	public void eliminarFinal() { 
		indice--; 
	}
	
	public double promedioPrecio() {
		double suma = 0.0;
		
		for(int i=0; i<indice; i++) {
			suma += precio[i];
		}
		return suma / indice;
	}
	
	public double precioMenor() {
		double menor = precio[0];
		
		for(int i=0; i<indice; i++) {
			if(precio[i] < menor) {
				menor = precio[i];
			}
		}
		return menor;
	}
	
	public double precioMayor() {
		double mayor = precio[0];
		
		for(int i=0; i<indice; i++) {
			if(precio[i] > mayor) {
				mayor = precio[i];
			}
		}
		return mayor;
	}
	
	public double posPrimeraMenor50() {
		for(int i=0; i<indice; i++) {
			if(precio[i] < 50) {
				return i;
			}
		}
		return -1;
	}
	
	public double posUltimaMenor50() {
		for(int i=indice -1; i>=0; i--) {
			if(precio[i]>50) {
				return i;
			}
		}
		return -1;
	}
	
	public double sumaPreciosMayores80() {
		double suma = 0.0;
		
		for(int i=0; i<indice; i++) {
			if(precio[i] > 80) {
				suma += precio[i];
			}
		}
		return suma;
	}
	
	//Un método denominado reemplazarUltimoPrecioMenor50, que reemplace el último precio menor 
	//que 50, por el precio mayor. Si el reemplazo no es posible mostrar un mensaje. 
	
}
