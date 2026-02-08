public class Camion extends Vehiculo{
    public Camion(String marca, String modelo, TipoCombustible tipoCombustible, int numPlazas, boolean revisado) {
        super(marca, modelo, TipoCombustible.Diesel, numPlazas, revisado);
    }
}
