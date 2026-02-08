public class Principal {

    public static final int MAX_VEHICULOS = 50;
    static Vehiculo[] vehiculos = new Vehiculo[MAX_VEHICULOS];
    public static int numVehiculos = 0;

    public static void main(String[] args) {
        CocheGasolina cg = new CocheGasolina("Toyota", "Corolla", TipoCombustible.Gasolina, 5, false, 4.8);
        CocheElectrico ce = new CocheElectrico("Tesla", "Model 3", TipoCombustible.Electrico, 5, true, 14.5);
        Camion c = new Camion("Volvo", "FH16", TipoCombustible.Diesel, 3, false);
        Motocicleta m = new Motocicleta("Honda", "CBR 500R", TipoCombustible.Gasolina, 2, true, 3.5);
        Autobus a = new Autobus("Mercedes-Benz", "Citaro", TipoCombustible.Diesel, 50, false);

        addVehiculo(cg);
        addVehiculo(ce);
        addVehiculo(c);
        addVehiculo(m);
        addVehiculo(a);

        System.out.println();
        System.out.println("=== REVISAR Y ARRANCAR VEHÍCULOS ===");
        revisarArrancar();
        System.out.println();
        System.out.println("=== PRUEBA DE EFICIENCIA ECONÓMICA ===");
        pruebaEficiencia();
        System.out.println();
        System.out.println("=== PRUEBA DE RECARGA ===");
        conectarCargador();

    }



    public static void revisarArrancar() {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
                vehiculo.nesecitaSerRevisado();
                vehiculo.arrancar();
            }
        }
    }

    public static void pruebaEficiencia() {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
               if (vehiculo instanceof Economico) {
                   System.out.println(vehiculo.toString());
               }else if (vehiculo instanceof Recargables) {
                   
               }else {
                   System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo() + " no es un vehiculo economico");
               }
            }
        }
    }

    public static void conectarCargador(){
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
                if (vehiculo instanceof Recargables) {
                    ((Recargables) vehiculo).conectarCargador();
                    ((Recargables) vehiculo).ajustarVelocidadCarga(50);
                }
            }
        }
    }

    public static void addVehiculo(Vehiculo vehiculo) {
        if (numVehiculos < MAX_VEHICULOS) {
            vehiculos[numVehiculos] = vehiculo;
            numVehiculos++;
            System.out.println("Vehiculo anadido correctamente");
        }
    }

    public static void mostrarVehiculos(){
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
                System.out.println(vehiculo.toString());
            }
        }
    }
}
