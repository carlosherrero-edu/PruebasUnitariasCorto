package utilidades;

public class UtilidadesMates {

	/**
	 * @param numero
	 * @return
	 */
	public static String dimeParidad(int numero) {
		// Complejidad ciclomática: 2

		String resultado;

		if (numero % 2 == 0) {
			resultado = "PAR";
		} else {
			resultado = "IMPAR";
		}
		return resultado;

	}

	/**
	 * Conversor de temperaturas entre las escalas Celsius y Faretheim corresponde a
	 * ejercicio 8 de la colección 3
	 * 
	 * @param temperatura valor de la temperatura de entrada, a convertir
	 * @param escala      carácter que indica la escala de la temperatura de
	 *                    entrada: 'C' /'F'
	 * @return valor de la temperatura en la otra escala
	 */
	public static double conversorTemperaturas(double temperatura, char escala) {
		// complejidad ciclomática:2
		// complejidad para recorrido por condiciones:4
		double tempFinal = 0;

		if (escala == 'C' || escala == 'c') {
			tempFinal = 32 + 9 * (temperatura / 5);
		} else if (escala == 'F' || escala == 'f') {
			tempFinal = (temperatura - 32) * 5 / 9;
		}

		return tempFinal;
	}

	/**
	 * Método para calcular el salario bonificado que se percibe según el importe de
	 * un salario inicial corresponde a ejercicio 10 de la colección 3
	 * 
	 * @param salarioInicial importe del salario antes de aplicar la bonificación
	 * @return importe del salario una vez aplicada la bonificación
	 */
	/**
	 * @param salarioInicial
	 * @return
	 */
	public static double calcularSalarioBonificado(double salarioInicial) {
		// complejidad ciclomática:3
		double bonificacion;

		if (salarioInicial <= 1000) {
			bonificacion = 1.2;
		} else if (salarioInicial <= 1800) {
			bonificacion = 1.15;
		} else {
			bonificacion = 1.10;
		}

		double salarioFinal = (salarioInicial * bonificacion);
		return (salarioFinal);
	}

	/**
	 * Método para devolver el importe literal de un billete de euros corresponde a
	 * ejercicio 12 de la colección 3 corresponde a ejercicio 12 de la colección 3
	 * 
	 * @param importeBillete entero con el valor del billete
	 * @return cadena con el valor del billete en letra
	 */
	/**
	 * Función que cuenta el número de cifras de un número entero
	 * 
	 * @param n valor del entero, suponemos que inferior en valor absoluto a 10^9
	 * @return número de cifras del número Corresponde a Ejercicio 4 de la Colección
	 *         5
	 */
	public static int contarCifras(int n) {
		// complejidad ciclomática:3

		int num_cifras = 0;
		// si el número es negativo, lo pasamos a valor positivo
		if (n < 0) {
			n = (-1) * n;
		}

		while (n > 0) {
			num_cifras++;
			n = n / 10; // hacemos la división entera entre 10 en cada paso
		}

		return num_cifras;

	}

	public static long calcularFactorial(int n) {
		// complejidad ciclomática: 3
		long factorial = 1L;
		if (n >= 2) {
			for (int i = n; i >= 2; i--) {
				factorial = factorial * i;
			}
		}
		return factorial;
	}

	public static String devolverImporteLiteral(int importeBillete) {
		// complejidad ciclomática:7

		String resultado = switch (importeBillete) {

		case 5 -> {
			yield "Cinco euros";
		}
		case 10 -> {
			yield "Diez euros";
		}
		case 20 -> {
			yield "Veinte euros";
		}
		case 50 -> {
			yield "Cincuenta euros";
		}
		case 100 -> {
			yield "Cien euros";
		}
		case 200 -> {
			yield "Doscientos euros";
		}
		case 500 -> {
			yield "Quinientos euros";
		}
		default -> {
			yield "No existe";
		}
		};

		return resultado;
	}

}
