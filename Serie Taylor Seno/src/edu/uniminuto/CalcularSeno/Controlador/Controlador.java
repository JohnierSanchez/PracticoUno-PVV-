package co.edu.uniminuto.CalcularSeno.Controlador;

import co.edu.uniminuto.CalcularSeno.Vista.Vista;
import co.edu.uniminuto.CalcularSeno.Modelo.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener {

	    private Vista objVista;
	    private Modelo objModelo;

	    public Controlador(Vista objVista, Modelo objModelo) {
	        this.objVista = objVista;
	        this.objModelo = objModelo;

	        this.objVista.jb_calcular.addActionListener(this);
	    }
	    
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == this.objVista.jb_calcular) {
	        	Respuesta();
	            
	        }
	    }

	    public void IniciarVista() {
	        objVista.setTitle("Ecuacion Cuadratica");
	        objVista.setLocationRelativeTo(null);
	        objVista.jtf_x.setText("" + objModelo.getGrados());
	    }
	    
	    public void Respuesta() {
	    	objModelo.setGrados(Double.parseDouble(objVista.jtf_x.getText()));
	    	objVista.jtf_respuesta.setText("" + objModelo.Resp());

	    }

}
