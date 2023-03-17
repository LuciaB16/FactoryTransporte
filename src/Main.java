public class Main {

    static ITransportable tipoTransp;

    public static void main(String[] args) {

        tipoTransp = FactoriaTransporte.getProducto(FactoriaTransporte.CAMION);
        System.out.println("El coste total del envío es: " + tipoTransp.costeTotal(10500) + " euros");
        System.out.println(tipoTransp.tipoEmbalaje(70F, 70F, 70F, 45F));


        tipoTransp = FactoriaTransporte.getProducto(FactoriaTransporte.BICICLETA);
        System.out.println("El coste total es: " + tipoTransp.costeTotal(16500) + " euros");
        System.out.println(tipoTransp.tipoEmbalaje(20F, 20F, 20F, 3.5F));

        tipoTransp = FactoriaTransporte.getProducto(FactoriaTransporte.BARCO);
        System.out.println("El coste total es: " + tipoTransp.costeTotal(13000) + " euros");
        System.out.println(tipoTransp.tipoEmbalaje(40F, 30F, 40F, 250F));


    }
}