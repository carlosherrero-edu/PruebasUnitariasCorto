package utilidades;

public class EjemploLista {
	
	public static void main(String[] args) {
		
		int [] lista= { 30, 45, 100, 333, 21, 5, 2, 5, 7, 4};
		
		int menor=lista[0];
		int mayor= lista[0];
		
		for (int i=0; i<lista.length;i++) {
			if (lista[i]<menor) {
				menor = lista[i];
			}
			
			if (lista[i] >mayor) {
				mayor= lista[i];
			}
		} //fin del for
		
		System.out.println("El elemento menor es..." +menor);
		System.out.println("El elemento mayor es..." +mayor);
		
		
	}

}
