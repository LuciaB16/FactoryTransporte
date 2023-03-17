public class Barco implements ITransportable{

    /**
     * Declaro la constante literal que indica que el tipo de embalaje es palet
     */
    public static final int PALET = 0;
    /**
     * Declaro la constante literal que indica que el tipo de embalaje es caja de cartón
     */
    public static final int CAJA_CARTON = 1;
    /**
     * Declaro la constante literal que indica que el tipo de embalaje es caja de madera
     */
    public static final int CAJA_MADERA = 2;


    /**
     * Método que recibe un cp y lo compara con otro, para así devolver el coste total
     *
     * @param cp (codigo postal)
     * @return coste total del envío
     */

    @Override
    public Float costeTotal(Integer cp) {
        Float precio;
        if (cp < codigoPostal) {

            precio = 200.0F;

        } else {
            precio = 400.0F;
        }

        return precio;
    }

    /**
     * Método que recibe las dimensiones del paquete y el peso y me devuelve el tipo de embalaje que utilizo
     *
     * @param dX   indica la longitud del paquete
     * @param dY   indica la altura del paquete
     * @param dZ   indica la anchura del paquete
     * @param peso indica el peso del paquete
     * @return un Integer que indica el tipo de embalaje
     */

   @Override
    public Integer tipoEmbalaje(Float dX, Float dY, Float dZ, Float peso) {

        Float dimensionTotal = (dX * dY * dZ);

        if (dimensionTotal < 1000000 && peso < 500) {
            System.out.println("El tipo de embalaje es: palet");
            return 0;

        } else if (dimensionTotal > 1000000 && dimensionTotal < 3000000 && peso > 1500) {
            System.out.println("El tipo de embalaje es: caja de cartón");
            return 1;

        } else {
            System.out.println("El tipo de embalaje es: caja de madera");
            return 2;
        }

    }
}
