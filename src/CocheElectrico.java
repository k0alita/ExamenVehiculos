public class CocheElectrico extends Vehiculo implements Recargables, Economico{
    private double consumoPromedio;

    public CocheElectrico(String marca, String modelo, TipoCombustible tipoCombustible, int numPlazas, boolean revisado, double consumoPromedio) throws VehiculoException {
        super(marca, modelo, TipoCombustible.Electrico, numPlazas, revisado);
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
        return consumoPromedio <= 15;
    }

    @Override
    public void conectarCargador() {
        System.out.println("Conectando el coche eléctrico al cargador");
    }

    @Override
    public void ajustarVelocidadCarga(int velocidadCarga) {
        System.out.println("Ajustando velocidad de carga a " + velocidadCarga + " kW");
    }

    @Override
    public String toString() {
        return getMarca() + " " + getModelo() +
                " es económico: " + esEconomico() +
                " (Consumo: " + consumoPromedio + " kWh/100km)";
    }
}
