package nuevoEjercicio;

import java.security.KeyStore.TrustedCertificateEntry;

public class Cuenta {

	private String titular;
	private double cantidad;
	
	
	public Cuenta (String titular, double cantidad) {
		this.titular = titular;
		
		if (cantidad < 0) {
			this.cantidad = 0;
		} else {
			this.cantidad = cantidad;
		}
	}
	
	public void ingresar(double cantidad){
		if (cantidad > 0) {
			this.cantidad += cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		if (this.cantidad - cantidad < 0 ) {	
			this.cantidad = 0;
		}
		else
		{
			this.cantidad -= cantidad;
		}	
	}
	
	
	public void setTitular(String titular){
		this.titular = titular;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
    public String toString() {
    	return "El titular " + this.titular + " tiene " + this.cantidad + " euros en la cuenta";
    }
	
    
}
