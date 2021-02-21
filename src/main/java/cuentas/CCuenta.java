
package cuentas;

/**
 * Clase que contiene una cuenta bancaria y métodos para gestionarla 
 * @author Andi
 */
public class CCuenta {

    /**
     * Método para obtener el nombre del propietario de la cuenta
     * 
     * @return nombre del propietario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del propietario de la cuenta
     * 
     * @param nombre nombre del propietario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el código identificador de la cuenta
     * 
     * @return cuenta código de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para establecer el código identificador de la cuenta
     * 
     * @param cuenta código de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obtener el saldo de la cuenta
     * 
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para establecer el saldo de la cuenta
     * 
     * @param saldo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para obeterl el tipo de interés de la cuenta
     * 
     * @return tipoInterés tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método para establecer el tipo de interés de la cuenta
     * 
     * @param tipoInterés tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * nombre del propietario de la cuenta
     */
    private String nombre;
    /**
     * código identificador de la cuenta
     */
    private String cuenta;
    /**
     * saldo de la cuenta
     */
    private double saldo;
    /**
     * tipo de interés de la cuenta
     */
    private double tipoInterés;

    /**
     * Constructor sin parámetros
     * 
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con cuatro parámetros
     *
     * @param nom nombre del propietario de la cuenta
     * @param cue código de la cuenta
     * @param sal saldo en la cuenta
     * @param tipo tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método para mostrar el saldo de la cuenta
     * @return getSaldo() método que devuelve el saldo de la cuenta (double)
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para ingresar una cantidad en la cuenta
     * 
     * @param cantidad cantidad a ingresar
     * @throws Exception si la cantidad dada es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar una cantidad de la cuenta
     * 
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad dada es negativa
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
