package utilidades;

import java.time.DateTimeException;
import java.time.LocalDate;



public class CalcularEdad {

	/**
	 * Método para calcular la edad de una persona en una fecha determinada
	 * 
	 * @param fechaNac fecha de nacimiento ,en formato "dd-mm-aaaa"
	 * @param fechaRef fecha de referencia en la que se calcula su edad, en formato
	 *                 "dd-mm-aaaa"
	 * @return edad de la persona en años en la fecha de referencia
	 * @throws Exception si alguna de las fechas pasadas no es válida, o bien la
	 *                   fecha de referencia es anterior a la de nacimiento //
	 */

	static int dimeEdad(String fechaNac, String fechaRef)
			throws FechaNacimientoException, NumberFormatException, DateTimeException {

		String anioNac, diaNac, mesNac;
		String anioRef, diaRef, mesRef;
		int edad;

		// Paso 1: Tomar subcadenas de las fechas
		diaNac = fechaNac.substring(0, 2);
		mesNac = fechaNac.substring(3, 5);
		anioNac = fechaNac.substring(6);
		diaRef = fechaRef.substring(0, 2);
		mesRef = fechaRef.substring(3, 5);
		anioRef = fechaRef.substring(6);

		// convertir las cadenas en n�meros
		int diaNacEnt = Integer.parseInt(diaNac);
		int mesNacEnt = Integer.parseInt(mesNac);
		int anioNacEnt = Integer.parseInt(anioNac);

		int diaRefEnt = Integer.parseInt(diaRef);
		int mesRefEnt = Integer.parseInt(mesRef);
		int anioRefEnt = Integer.parseInt(anioRef);

		// Paso 2: Convertirlas a n�meros

		LocalDate fechaNacimiento = LocalDate.of(anioNacEnt, mesNacEnt, diaNacEnt);

		LocalDate fechaReferencia = LocalDate.of(anioRefEnt, mesRefEnt, diaRefEnt);

		if (fechaReferencia.isAfter(fechaNacimiento)) {

			 edad = anioRefEnt - anioNacEnt;

			if (mesRefEnt < mesNacEnt) {
				edad--;
			} else if (mesRefEnt == mesNacEnt && diaRefEnt < diaNacEnt) {
				edad--;
			}

		} else {
			throw new FechaNacimientoException("La fecha de nacimiento no puede ser anterior a la fecha de referencia");
		}

		

		return edad;
	}
	


}
