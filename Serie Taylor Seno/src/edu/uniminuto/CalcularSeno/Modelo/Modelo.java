package co.edu.uniminuto.CalcularSeno.Modelo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Modelo {
	
	private double grados;
	private double radianes;
	private double num=4;
	private double signo=1;
	private double termino;
	private double sumatoria;
	

	private NumberFormat df = new DecimalFormat("#0.00");

	
	public double getGrados() {
		return grados;
	}

	public void setGrados(double grados) {
		this.grados = grados;
	}
	
	public double getSumatoria() {
		return sumatoria;
	}

	public void setSumatoria(double sumatoria) {
		this.sumatoria = sumatoria;
	}

	public String Resp() {
		
		CalcularFactorial c= new CalcularFactorial();
		
		sumatoria=c.Factorizacion(grados);
		/*
		radianes=Math.toRadians(grados);
		termino=signo/c.Factorizacion(2*num+1)*Math.pow(radianes, 2*num+1);
		sumatoria+=termino;
		signo*=-1;
		*/
		return df.format(sumatoria);
	}

}
