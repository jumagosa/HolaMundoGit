package cuentas;

/**
 * Clase CCuenta incluida en el paquete cuentas, encargada de la declaraci�n de
 * las variables de clase.
 * 
 * @author juanma
 * @version 1.0
 * 
 */
public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInter�s;

	/**
	 * Declaraci�n del m�todo CCuenta que inicializar� las variables a valores por
	 * defecto.
	 * 
	 */
	public CCuenta() {
	}

	/**
	 * Declaraci�n del m�todo CCuenta encargado de establecer los valores para
	 * nombre, cuenta y saldo.
	 * 
	 * @param Recibe como par�metros las variables nombre, cuenta, saldo y tipo de
	 *               inter�s.
	 * 
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Declaraci�n del m�todo estado encargado de mostrar el saldo actual.
	 * 
	 * @return Devuelve el saldo de la cuenta.
	 * 
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Declaraci�n del m�todo ingresar encargado de a�adir cantidad a la cuenta.
	 * 
	 * @param Recibe como par�metro la cantidad a ingresar.
	 * @throws Lanza una excepci�n en caso de intentar ingresar una cantidad
	 *               negativa.
	 * 
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Declaraci�n del m�todo retirar encargado de hacer la retirada de una cantidad
	 * del saldo actual de la cuenta.
	 * 
	 * @param Recibe como par�metro la cantidad a retirar.
	 * @throws Lanza excepciones tanto si se intenta retirar una cantidad negativa,
	 *               como si se intenta retirar una cantidad mayor al saldo actual.
	 * 
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Declaraci�n de m�todos Get y Set encargados de consultar o modificar los
	 * datos contenidos en las variables de clase. Son iguales para las 4 variables,
	 * nombre, cuenta, saldo y tipo de inter�s.
	 * 
	 * Para los m�todos get
	 * 
	 * @return Devuelven nombre, cuenta, saldo y tipo de inter�s, respect�vamente.
	 * 
	 *         Para los m�todos set
	 * @param Reciben como par�metro nombre, cuenta, saldo y tipo de inter�s,
	 *                respect�vamente.
	 * 
	 */
	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String getCuenta() {
		return cuenta;
	}

	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	double getSaldo() {
		return saldo;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	double getTipoInter�s() {
		return tipoInter�s;
	}

	void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}

}
