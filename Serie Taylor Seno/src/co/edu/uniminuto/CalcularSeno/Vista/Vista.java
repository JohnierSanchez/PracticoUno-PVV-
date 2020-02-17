package co.edu.uniminuto.CalcularSeno.Vista;

import java.util.Scanner;
import co.edu.uniminuto.CalcularSeno.Controlador.Controlador;

/**
 * Clase Vista, La cual se encarga de la interfaz de nuestro programa, en la
 * toma e impresión de los resultados.
 * 
 * @autor Sánchez Johnier
 * @version 16/02/20 Copyright 2020 por Sánchez Johnier 
 * Programa realizado con estructura MVC para el cálculo de la Función Seno, 
 * por medio de la Serie Taylor.
 */
public class Vista {

	// Método el cual realiza la impresión y la toma de las variables.
	public static void main(String[] args) {

		// Se llama un Scanner para poder tomar los datos.
		Scanner teclado = new Scanner(System.in);
		// Se imprime y se toman los datos.
		System.out.println("Ingrese Valor en Grados = ");
		double num = teclado.nextDouble();
		System.out.println("Ingrese Valor de Exactitud = ");
		double exa = teclado.nextDouble();
		// Se llama a la Clase Controlador para enviar los datos.
		Controlador c = new Controlador();
		// Se imprime el resultado traído por medio de la Clase Controlador.
		System.out.println("Sen(" + num + ") = " + c.calcular(num, exa));

	}
}
