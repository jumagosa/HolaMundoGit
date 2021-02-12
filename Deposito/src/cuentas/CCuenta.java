package cuentas;

/**
 * Clase CCuenta incluida en el paquete cuentas, encargada de la declaración de
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
	private double tipoInterés;

	/**
	 * Declaración del método CCuenta que inicializará las variables a valores por
	 * defecto.
	 * 
	 */
	public CCuenta() {
	}

	/**
	 * Declaración del método CCuenta encargado de establecer los valores para
	 * nombre, cuenta y saldo.
	 * 
	 * @param Recibe como parámetros las variables nombre, cuenta, saldo y tipo de
	 *               interés.
	 * 
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**
	 * Declaración del método estado encargado de mostrar el saldo actual.
	 * 
	 * @return Devuelve el saldo de la cuenta.
	 * 
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Declaración del método ingresar encargado de añadir cantidad a la cuenta.
	 * 
	 * @param Recibe como parámetro la cantidad a ingresar.
	 * @throws Lanza una excepción en caso de intentar ingresar una cantidad
	 *               negativa.
	 * 
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Declaración del método retirar encargado de hacer la retirada de una cantidad
	 * del saldo actual de la cuenta.
	 * 
	 * @param Recibe como parámetro la cantidad a retirar.
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
	 * Declaración de métodos Get y Set encargados de consultar o modificar los
	 * datos contenidos en las variables de clase. Son iguales para las 4 variables,
	 * nombre, cuenta, saldo y tipo de interés.
	 * 
	 * Para los métodos get
	 * 
	 * @return Devuelven nombre, cuenta, saldo y tipo de interés, respectívamente.
	 * 
	 *         Para los métodos set
	 * @param Reciben como parámetro nombre, cuenta, saldo y tipo de interés,
	 *                respectívamente.
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

	double getTipoInterés() {
		return tipoInterés;
	}

	void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

}
