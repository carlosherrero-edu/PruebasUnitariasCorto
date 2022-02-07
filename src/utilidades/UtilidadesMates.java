package utilidades;

public class UtilidadesMates {

	/**
	 * @param numero
	 * @return
	 */
	public static String dimeParidad(int numero) {
		// Complejidad ciclom�tica: 2

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
	 * ejercicio 8 de la colecci�n 3
	 * 
	 * @param temperatura valor de la temperatura de entrada, a convertir
	 * @param escala      car�cter que indica la escala de la temperatura de
	 *                    entrada: 'C' /'F'
	 * @return valor de la temperatura en la otra escala
	 */
	public static double conversorTemperaturas(double temperatura, char escala) {
		// complejidad ciclom�tica:2
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
	 * M�todo para calcular el salario bonificado que se percibe seg�n el importe de
	 * un salario inicial corresponde a ejercicio 10 de la colecci�n 3
	 * 
	 * @param salarioInicial importe del salario antes de aplicar la bonificaci�n
	 * @return importe del salario una vez aplicada la bonificaci�n
	 */
	/**
	 * @param salarioInicial
	 * @return
	 */
	public static double calcularSalarioBonificado(double salarioInicial) {
		// complejidad ciclom�tica:3
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
	 * M�todo para devolver el importe literal de un billete de euros corresponde a
	 * ejercicio 12 de la colecci�n 3 corresponde a ejercicio 12 de la colecci�n 3
	 * 
	 * @param importeBillete entero con el valor del billete
	 * @return cadena con el valor del billete en letra
	 */
	/**
	 * Funci�n que cuenta el n�mero de cifras de un n�mero entero
	 * 
	 * @param n valor del entero, suponemos que inferior en valor absoluto a 10^9
	 * @return n�mero de cifras del n�mero Corresponde a Ejercicio 4 de la Colecci�n
	 *         5
	 */
	public static int contarCifras(int n) {
		// complejidad ciclom�tica:3

		int num_cifras = 0;
		// si el n�mero es negativo, lo pasamos a valor positivo
		if (n < 0) {
			n = (-1) * n;
		}

		while (n > 0) {
			num_cifras++;
			n = n / 10; // hacemos la divisi�n entera entre 10 en cada paso
		}

		return num_cifras;

	}

	public static long calcularFactorial(int n) {
		// complejidad ciclom�tica: 3
		long factorial = 1L;
		if (n >= 2) {
			for (int i = n; i >= 2; i--) {
				factorial = factorial * i;
			}
		}
		return factorial;
	}

	public static String devolverImporteLiteral(int importeBillete) {
		// complejidad ciclom�tica:7

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
