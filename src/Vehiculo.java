public abstract class Vehiculo implements Revisable {
    private String marca;
    private String modelo;
    private TipoCombustible tipoCombustible;
    private int numPlazas;
    private boolean revisado;

    public Vehiculo(String marca, String modelo, TipoCombustible tipoCombustible, int numPlazas, boolean revisado) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.numPlazas = numPlazas;
        this.revisado = revisado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public boolean isRevisado() {
        return revisado;
    }

    public void setRevisado(boolean revisado) {
        this.revisado = revisado;
    }

    public void arrancar() {
        System.out.println("Arrancando el vehiculo " + getMarca() + " " + getModelo());
    }

    public void nesecitaSerRevisado() {
        if (!revisado) {
            System.out.println("Revisando el vehiculo " + getMarca() + " " + getModelo());
            revisado = true;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustible=" + tipoCombustible +
                ", numPlazas=" + numPlazas +
                ", revisado=" + revisado +
                '}';
    }
}
