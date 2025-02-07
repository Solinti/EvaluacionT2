package pregunta_01;

import javax.swing.JOptionPane;

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
		
		for(int i=0; i<tamano(); i++) {
			suma += precio[i];
		}
		return suma / tamano();
	}
	
	public double precioMenor() {
		double menor = precio[0];
		
		for(int i=0; i<tamano(); i++) {
			if(precio[i] < menor) {
				menor = precio[i];
			}
		}
		return menor;
	}
	
	public double precioMayor() {
		double mayor = precio[0];
		
		for(int i=0; i<tamano(); i++) {
			if(precio[i] > mayor) {
				mayor = precio[i];
			}
		}
		return mayor;
	}
	
	public int posPrimeraMenor50() {
		for(int i=0; i<tamano(); i++) {
			if(precio[i] < 50) {
				return i;
			}
		}
		return -1;
	}
	
	public int posUltimaMenor50() {
		for(int i= tamano() -1; i>=0; i--) {
			if(precio[i] < 50) {
				return i;
			}
		}
		return -1;
	}
	
	public double sumaPreciosMayores80() {
		double suma = 0.0;
		
		for(int i=0; i<tamano(); i++) {
			if(precio[i] > 80) {
				suma += precio[i];
			}
		}
		return suma;
	}
	
	private void msj (String s) {
		JOptionPane.showMessageDialog(null, s);
	}
	
	public void reemplazarUltimoPrecioMenor50() {
		
		int ult = posUltimaMenor50(); 
        double mayor = precio[0];
        if(ult != 0) {
        	for (int i = 1; i < tamano(); i++) {
        		if (precio[i] > mayor) {
        			mayor = precio[i];
        		}
        	}
        }
        else {
        	msj("El reemplazo no es posible.");
        }
        precio[ult] = mayor;
	}
	
	public void reemplazarPrimeraPrecioMenor50() {
		int pos = -1;
		double pro = promedioPrecio();
		
		for(int i=0; i<tamano();i++) {
			if(precio[i] < 50) {
				pos = i;
				break;
			}
		}
		
		if(pos != 1) {
			precio[pos] = pro;
		}
		else {
			msj("El reemplazo no es posible.");
		}
	}
	
	public void reemplazarPrecioMenor() {
		double mayor = sumaPreciosMayores80(); 
		int menor = 0;
		 
		for(int i=0; i< tamano(); i++) {
			 if(precio[i] < precio[menor]) {
				 menor = i;
			 }
		 }
		 
		 if(mayor == 0.0) {
			 msj("El reemplazo no es posible.");
		 }
		 else {
			 precio[menor] = mayor;
		 }
	}
	
	public void eliminarUltimoPrecioMenor50() {
		int ult = -1;
		
		for(int i=tamano() -1; i>=0;i--) {
			if(precio[i] < 50) {
				ult = i;
				break;
			}
		}
		if(ult != -1) {
			for(int i=ult; i<tamano() -1; i++) {
				precio[i] = precio[i+1];
			}
			indice --;
		}
		else {
			msj("El precio no se puede eliminar");
		}
	}
	
	public boolean  ordenarPrecioDescendente() {
		boolean orden = false;
		
		for(int i=0; i<tamano(); i++) {
			for(int j=0; j<tamano() -1 -i; j++) {
				if(precio[j] < precio[j+1]) {
					double temp = precio[j];
					precio[j] = precio[j+1];
					precio[j+1] = temp;
					orden = true;
				}
			}
			if(!orden) break;
		}
		return orden;
	}
	
}
