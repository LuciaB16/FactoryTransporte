public interface ITransportable {

    /**
     * Creo un método abstracto llamado costeTotal para que calcule, según el código postal enviado, el precio del envío
     *
     * @param cp (es el código postal que va a recibir)
     * @return costeTotal (precio a pagar por el envío)
     */
    Float costeTotal(Integer cp);

    /**
     * Creo un método abstracto llamado tipoEmbalaje que recibe 4 argumentos y así me indica que tipo de embalaje utilizo
     *
     * @param dX   dimensiónX que me indica la longitud del paquete
     * @param dY   dimensiónY que me indica la altura del paquete
     * @param dZ   dimensiónZ que me indica la anchura del paquete
     * @param peso me indica el peso del paquete
     * @return un Integer que indica el tipo de embalaje
     */
    Integer tipoEmbalaje(Float dX, Float dY, Float dZ, Float peso);

    /**
     * Declaro la variable codigoPostal para así calcular, según el cp enviado, cuanto me costará
     */
    int codigoPostal = 15000;

}
