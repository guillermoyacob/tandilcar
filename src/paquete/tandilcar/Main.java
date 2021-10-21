package paquete.tandilcar;

public class Main {

    public static void main(String[] args) {

        Vehiculo Peugeot504 = new Auto(25000.00, "GNC", 1995, "Peugeot", 100000.00, true);
        Vehiculo Renault12 = new Auto(35000.00, "Nafta", 1991, "Renault", 150000.00, true);
        Vehiculo FordF100 = new Camioneta(30000.00, "GNC", 1990, "Ford", 170000.00, true);
        Vehiculo Fiat600 = new Auto(60000.00, "Diesel", 1982, "Fiat", 150000.00, true);
        Vehiculo YamahaRX = new Motocicleta(10000.00, "Nafta", 2005, "Yamaha", 100000.00, true);
        Vehiculo ZanellaXM = new Motocicleta(100000.00, "Nafta", 1987, "Zanella", 50000.00, true);
        Vehiculo MazdaMMZ = new Auto(50000.00, "Diesel", 2010, "Mazda", 250000.00, true);
        Vehiculo MotomelGZ = new Motocicleta(50000.00, "Nafta", 2015, "Motomel", 150000.00, true);
        Vehiculo FordRanger = new Camioneta(40000.00, "Diesel", 2017, "Ford", 150000.00, true);



        TodosLosVehiculos.mostrarVehiculos("Camioneta");
        TodosLosVehiculos.mostrarVehiculos("Auto");
        TodosLosVehiculos.mostrarVehiculos("Motocicleta");

        TodosLosVehiculos.mostrarVehiculos(20);
        TodosLosVehiculos.mostrarVehiculos(60);

        TodosLosVehiculos.mostrarVehiculos("Camioneta", 30);
        TodosLosVehiculos.mostrarVehiculos("Auto", 50);
        TodosLosVehiculos.mostrarVehiculos("Motocicleta", 10);

        TodosLosVehiculos.mostrarVehiculos();

    }
}
