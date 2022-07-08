package nuevoEjercicio;

public class CuentaApp {

	public static void main(String[] args) {
	
		Cuenta cuenta1 = new Cuenta("Jose",400);
		Cuenta cuenta2 = new Cuenta("Ignacio",100);
		
		cuenta1.ingresar(300);
		cuenta2.ingresar(200);
		
		cuenta1.retirar(100);
		cuenta2.retirar(100);
		
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		
		
	}

}
