package paquete.tandilcar;

public class Main {

    public static void main(String[] args) {

        Vehiculo Peugeot504 = new Auto(450000.00, "GNC", 1995, "Peugeot", 190000.00, true);
        Vehiculo Renault12 = new Auto(290000.00, "Nafta", 1991, "Renault", 180000.00, true);
        Vehiculo FordF100 = new Camioneta(390000.00, "GNC", 1990, "Ford", 350000.00, true);
        Vehiculo Fiat600 = new Auto(200000.00, "Diesel", 1982, "Fiat", 140000.00, true);
        Vehiculo YamahaRX = new Motocicleta(10000.00, "Nafta", 2005, "Yamaha", 220000.00, true);
        Vehiculo ZanellaZB = new Motocicleta(80000.00, "Nafta", 1987, "Zanella", 160000.00, true);
        Vehiculo MazdaCX3 = new Auto(50000.00, "Diesel", 2010, "Mazda", 690000.00, true);
        Vehiculo MotomelATV = new Motocicleta(50000.00, "Nafta", 2015, "Motomel", 160000.00, true);
        Vehiculo FordRanger = new Camioneta(40000.00, "Diesel", 2017, "Ford", 620000.00, true);
        Vehiculo Peugeot208 = new Auto(65000.00, "Nafta", 2019, "Peugeot", 890000.00, true);
        Vehiculo ToyotaHilux = new Camioneta(190000.00, "GNC", 2018, "Toyota", 890000.00, true);
        Vehiculo ChevroletSilverado = new Camioneta(140000.00, "GNC", 2021, "Chevrolet", 990000.00, true);
        Vehiculo VolkswagenPolo = new Auto(250000.00, "Nafta", 2010, "Volkswagen", 790000.00, true);
        Vehiculo ChevroletCorsa = new Auto(180000.00, "Nafta", 2010, "Chevrolet", 690000.00, true);
        Vehiculo FiatSiena = new Auto(180000.00, "Nafta", 2010, "Fiat", 690000.00, true);
        Vehiculo VolkswagenGolf = new Auto(190000.00, "Nafta", 2015, "Volkswagen", 490000.00, true);
        Vehiculo CitroenC3 = new Auto(220000.00, "Nafta", 2018, "Volkswagen", 690000.00, true);

        Sucursal TandilCarCentro = new Sucursal("Centro","Rodriguez 715", "de 9:00 a 12:30 y de 17:00 a 20:30");
        Sucursal TandilCarTerminal = new Sucursal("Terminal","Av. Balbín 600", "de 9:00 a 12:30 y de 17:00 a 20:30");
        Sucursal TandilCarDelValle = new Sucursal("Del Valle","Av. Del Valle 230", "de 9:00 a 12:30 y de 17:00 a 20:30");

        TandilCarCentro.agregarVehiculo(MazdaCX3);
        TandilCarCentro.agregarVehiculo(FordRanger);
        TandilCarCentro.agregarVehiculo(ToyotaHilux);
        TandilCarCentro.agregarVehiculo(ChevroletSilverado);
        TandilCarCentro.agregarVehiculo(Peugeot208);
        TandilCarTerminal.agregarVehiculo(VolkswagenPolo);
        TandilCarTerminal.agregarVehiculo(ChevroletCorsa);
        TandilCarTerminal.agregarVehiculo(FiatSiena);
        TandilCarTerminal.agregarVehiculo(VolkswagenGolf);
        TandilCarTerminal.agregarVehiculo(CitroenC3);
        TandilCarDelValle.agregarVehiculo(Peugeot504);
        TandilCarDelValle.agregarVehiculo(Renault12);
        TandilCarDelValle.agregarVehiculo(FordF100);
        TandilCarDelValle.agregarVehiculo(Fiat600);
        TandilCarDelValle.agregarVehiculo(YamahaRX);
        TandilCarDelValle.agregarVehiculo(ZanellaZB);
        TandilCarDelValle.agregarVehiculo(MotomelATV);

        System.out.println("Sucursal TandilCar Centro");
        TandilCarCentro.descripcion();
        TandilCarCentro.mostrarVehiculos();
        TandilCarCentro.mostrarVehiculos("Camioneta");

        System.out.println("Sucursal TandilCar Terminal");
        TandilCarTerminal.descripcion();
        TandilCarTerminal.mostrarVehiculos();
        TandilCarTerminal.mostrarVehiculos(200);

        System.out.println("Sucursal TandilCar Del Valle");
        TandilCarDelValle.descripcion();
        TandilCarDelValle.mostrarVehiculos();
        TandilCarDelValle.mostrarVehiculos("Motocicleta", 300);
    }
}