package co.edu.uniminuto.CalcularSeno.Modelo;

/**
 * Clase Modelo,la cual contiene toda la parte logia del programa.
 * 
 * @autor Sánchez Johnier.
 * @version 16/02/20 Copyright 2020 por Sánchez Johnier. Programa realizado con
 *          estructura MVC para el cálculo de la Función Seno, por medio de la
 *          Serie Taylor.
 */

public class Modelo {
	// Se declara las variables y la constante que van hacer utilizadas.
	public double solucion;
	public double radianes;
	public double termino;
	public int SIGNO = 1;

	/**
	 * En este método realizamos el cálculo de la Serie Taylor para el calculo de
	 * Seno. El cual necesita de dos variables (Los grados y la exactitud deseada).
	 */
	public double calcularSeno(double num, double exa) {
		Modelo m = new Modelo();
		// Se calcula las veces requeridas para mayor exactitud.
		for (int i = 0; i < exa; i++) {
			// Se convierte los grados en radianes por medio de la función Math.toRadians.
			radianes = Math.toRadians(num);
			// Se realiza la Serie Taylor.
			termino = (SIGNO / m.factorial((2 * i) + 1)) * (Math.pow(radianes, (2 * i) + 1));
			// Se crea contador para llevar la exactitud del resultado.
			solucion += termino;
			// Cada ciclo se va cambiando el signo de la potencia dado a la potencia.
			SIGNO *= -1;
		}
		// Se retorna el resultado final.
		return solucion;
	}

	/**
	 * En este método realizamos el cálculo de la factorial que nos pide la Serie
	 * Taylor.
	 */
	public double factorial(double factor) {
		int fact = 1;
		// Se valida que el grado ingresado no sea igual a 0 o a 1, dado a que el
		// resultado de ambos valores siempre es 1.
		if (factor == 0 || factor == 1) {
			return 1;
		} else {
			// Se multiplican todos los valores previos del valor de la factorial.
			for (int i = 2; i <= factor; i++) {
				fact *= i;
			}
		}
		// Se retorna el resultado final.
		return fact;

	}
}
