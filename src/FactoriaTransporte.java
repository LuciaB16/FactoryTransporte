public class FactoriaTransporte {

    /**
     * Declaro la constante literal que indica que el transporte es camion
     */
    public static final int CAMION = 1;
    /**
     * Declaro la constante literal que indica que el transporte es bicicleta
     */
    public static final int BICICLETA = 2;

    /**
     * Método que devuelve el tipo de transporte
     *
     * @param opcion opción de tipo int del switch para escoger el tipo de transporte
     * @return objeto del tipo de transporte escogido
     */
    public static ITransportable getProducto(int opcion) {

        switch (opcion) {

            case CAMION:
                return new Camion();

            case BICICLETA:
                return new Bicicleta();

            default:
                return null;


        }


    }
}
