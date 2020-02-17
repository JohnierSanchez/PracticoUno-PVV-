package co.edu.uniminuto.CalcularSeno.Controlador;

import co.edu.uniminuto.CalcularSeno.Modelo.Modelo;

/**
 * Clase Controlador,La cual conecta los datos que va a necesitar la Clase
 * Modelo con los registrados en la Clase Vista, del mismo modo para mostrar el
 * resultado.
 * 
 * @autor Sánchez Johnier
 * @version 16/02/20 Copyright 2020 por Sánchez Johnier 
 * Programa realizado con estructura MVC para el cálculo de la Función Seno, 
 * por medio de la Serie Taylor.
 */

public class Controlador {
	/**
	 * Se realiza el método calcular para llevar los datos y sustraer el resultado.
	 */
	public double calcular(double num, double exa) {
		Modelo m = new Modelo();
		return m.calcularSeno(num, exa);

	}

}
