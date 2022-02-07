package utilidades;

public class UtilidadesFechas {
	
	/**
	 * Función que determina si un año es o no bisiesto
	 * corresponde a ejercicio 20 de la colección 3
	 * @param  año valor del año que comprobamos
	 * @return true si el año es bisiesto, false en caso contrario
	 */
	public static boolean esAñoBisiesto (int año) {
		
		boolean resultado = false;
		
		if (año%400 ==0) {
			resultado = true;
		
		} else {
			if (año%4 ==0 && año%100 !=0) {
				resultado = true;
			} 
		} 
		// en cualquier otro caso, no es bisiesto
		return resultado;
	}
	
	
	/**
	 * Función para validar una fecha con arreglo al calendario gregoriano
	 * @param año valor del año, debe ser posterior a 1582
	 * @param mes valor del mes, entre 1 y 12
	 * @param dia valor del día, entre 1 y el último día del mes 
	 * @return true si la fecha existe en el calendario gregoriano, false en otro caso
	 * @see #esAñoBisiesto(int)
	 */
	public static boolean validarFecha (int año, int mes, int dia) {
		
		final int GREGORIANO=1582;   //AÑO EN QUE COMENZÓ EL CALENDARIO GREGORIANO
		final int[] DIAS_MES= {31,28,31,30,31,30,31,31,30,31,30,31};  //dias de cada mes
		 int finalMes;
		
		boolean fechaValida=false;
		
		if (año > GREGORIANO) {
			 if ( mes>=1 && mes <=12) {
				
				 //tratamiento teniendo en cuenta los años bisiestos
				 if (mes ==2 && esAñoBisiesto(año)) {
					 finalMes=29;
				 } else {
					 finalMes= DIAS_MES[mes-1];
				 }
				 
				 if (dia>=1 && dia <=finalMes) {
					 //la fecha cumple todas las condiciones para ser válida
					 fechaValida=true;
				 }
				 
			 }
		}
		
		
		return fechaValida;
	}

}
