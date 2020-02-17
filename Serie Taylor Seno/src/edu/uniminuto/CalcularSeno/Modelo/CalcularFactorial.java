package co.edu.uniminuto.CalcularSeno.Modelo;

public class CalcularFactorial {

	public Double Factorizacion(Double num) {
		Double fact = 1.0;

		if (num == 0 || num == 1) {
			return 1.0;
		} else {
			for (int i = 2; i <= num; i++) {
				fact *= i;
			}

		}
		return fact;

	}
}
