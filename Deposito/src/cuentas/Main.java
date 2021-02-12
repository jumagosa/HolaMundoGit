package cuentas;

/**
 * Clase principal del paquete cuentas. Simula la creaci�n de una nueva cuenta
 * bancaria, con nombre de titular, n�mero de cuenta, saldo y tipo de inter�s.
 * Los m�todos utilizados se encuentran en el archivo CCuenta.java
 * 
 * @author juanma
 * @version 1.0
 * @see CCuenta.java
 * 
 */
public class Main {

	/**
	 * M�todo main que ejecuta el m�todo operativa_cuenta
	 * 
	 */
	public static void main(String[] args) {
		operativa_cuenta(0);
	}

	/**
	 * M�todo operativa_cuenta encargado de crear una cuenta nueva
	 * 
	 * @param Recibe nombre, cuenta, saldo y tipo de inter�s para la creaci�n de una
	 *               cuenta.
	 * @param Recibe una cantidad en formato float para ingreso o retiro en cuenta.
	 * 
	 * @throws Se ejecutan los m�todos retirar e ingresar los cuales lanzan
	 *            excepciones en caso de intentar ingresar o retirar una cantidad
	 *            negativa o retirar una cantidad superior al saldo disponible.
	 * 
	 */
	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;

		cuenta1 = new CCuenta("Antonio L�pez", "1000-2365-85-1230456789", 2500, 0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}
}
