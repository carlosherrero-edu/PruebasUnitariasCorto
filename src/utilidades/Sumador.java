package utilidades;

public class Sumador {

	public static void main(String[] args) {
		double suma=0.0;
		
		for (int i=0; i<args.length; i++) {
			suma +=Double.parseDouble(args[i]);
		}
		
		double menor=Double.parseDouble(args[0]);
		
		double mayor=Double.parseDouble(args[0]);
		
		
		
		System.out.println("LA suma es : " + suma);

	}

}
