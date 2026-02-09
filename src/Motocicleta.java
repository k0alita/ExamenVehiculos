public class Motocicleta extends Vehiculo implements Economico{
    private double consumoPromedio;

    public Motocicleta(String marca, String modelo, TipoCombustible tipoCombustible, int numPlazas, boolean revisado, double consumoPromedio) throws VehiculoException{
        super(marca, modelo, TipoCombustible.Gasolina, numPlazas, revisado);
        setConsumoPromedio(consumoPromedio);
    }

    public double getConsumoPromedio() {
        return consumoPromedio;
    }

    public void setConsumoPromedio(double consumoPromedio) throws VehiculoException{
        if (consumoPromedio <= 0) {
            throw new VehiculoException("El consumo de " + getMarca() + " " + getModelo() + " promedio no puede ser igual o menor a 0");
        } else this.consumoPromedio = consumoPromedio;
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
