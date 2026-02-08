public class CocheGasolina extends Vehiculo implements Economico{
    private double consumoPromedio;

    public CocheGasolina(String marca, String modelo, TipoCombustible tipoCombustible, int numPlazas, boolean revisado, double consumoPromedio) {
        super(marca, modelo, tipoCombustible, numPlazas, revisado);
        this.consumoPromedio = consumoPromedio;
    }

    public double getConsumoPromedio() {
        return consumoPromedio;
    }

    public void setConsumoPromedio(double consumoPromedio) {
        this.consumoPromedio = consumoPromedio;
    }

    @Override
    public boolean esEconomico() {
        return consumoPromedio <= 5;
    }

    @Override
    public String toString() {
        return getMarca() + " " + getModelo() +
                " es económico: " + esEconomico() +
                " (Consumo: " + consumoPromedio + " L/100km)";
    }
}
