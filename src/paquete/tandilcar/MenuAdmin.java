package paquete.tandilcar;

import java.util.Objects;
import java.util.Scanner;

public class MenuAdmin {

    Scanner teclado = new Scanner(System.in);
    Sucursal TandilCarCentro = new Sucursal("Centro","Rodriguez 715", "de 9:00 a 12:30 y de 17:00 a 20:30");
    Sucursal TandilCarTerminal = new Sucursal("Terminal","Av. Balbín 600", "de 9:00 a 12:30 y de 17:00 a 20:30");
    Sucursal TandilCarDelValle = new Sucursal("Del Valle","Av. Del Valle 230", "de 9:00 a 12:30 y de 17:00 a 20:30");

    public void start(){
        cargarDatos();
        int opcion = opciones();
        switch (opcion){
            case 1: mostrarVehiculos();
            break;
            case 2: modificarSucursal();
            break;
            default:
                System.out.println("La opción ingresada no es válida, intente nuevamente");
                opciones();
        }
    }

    private int opciones(){
        int opcion = 0;
        System.out.println("1 - Listar los vehiculos");
        System.out.println("2 - Modificar los datos de una sucursal");
        System.out.println("3 - Modificar un vehiculo");
        try {
            opcion = teclado.nextInt();
        }catch (Error e){
            System.out.println("El valor introducido es incorrecto, intente nuevamente.");
            opciones();
        }
        return opcion;
    }

    private void cargarDatos(){
        //Instanciando los objetos vehículos
        Vehiculo Peugeot504 = new Auto(450000.00, "GNC", 1995, "Peugeot504", 190000.00, true);
        Vehiculo Renault12 = new Auto(290000.00, "Nafta", 1991, "Renault12", 180000.00, true);
        Vehiculo FordF100 = new Camioneta(390000.00, "GNC", 1990, "FordF100", 350000.00, true);
        Vehiculo Fiat600 = new Auto(200000.00, "Diesel", 1982, "Fiat600", 140000.00, true);
        Vehiculo YamahaRX = new Motocicleta(10000.00, "Nafta", 2005, "YamahaRX", 220000.00, true);
        Vehiculo ZanellaZB = new Motocicleta(80000.00, "Nafta", 1987, "ZanellaZB", 160000.00, true);
        Vehiculo MazdaCX3 = new Auto(50000.00, "Diesel", 2010, "MazdaCX3", 690000.00, true);
        Vehiculo MotomelATV = new Motocicleta(50000.00, "Nafta", 2015, "MotomelATV", 160000.00, true);
        Vehiculo FordRanger = new Camioneta(40000.00, "Diesel", 2017, "FordRanger", 620000.00, true);
        Vehiculo Peugeot208 = new Auto(65000.00, "Nafta", 2019, "Peugeot208", 890000.00, true);
        Vehiculo ToyotaHilux = new Camioneta(190000.00, "GNC", 2018, "ToyotaHilux", 890000.00, true);
        Vehiculo ChevroletSilverado = new Camioneta(140000.00, "GNC", 2021, "ChevroletSilverado", 990000.00, true);
        Vehiculo VolkswagenPolo = new Auto(250000.00, "Nafta", 2010, "VolkswagenPolo", 790000.00, true);
        Vehiculo ChevroletCorsa = new Auto(180000.00, "Nafta", 2010, "ChevroletCorsa", 690000.00, true);
        Vehiculo FiatSiena = new Auto(180000.00, "Nafta", 2010, "FiatSiena", 690000.00, true);
        Vehiculo VolkswagenGolf = new Auto(190000.00, "Nafta", 2015, "VolkswagenGolf", 490000.00, true);
        Vehiculo CitroenC3 = new Auto(220000.00, "Nafta", 2018, "VolkswagenC3", 690000.00, true);

        //Agregando los vehiculos a las sucursales
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
    }

    private void mostrarVehiculos(){
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

    private void modificarSucursal(){

        try {

            System.out.println("Elija la sucursal: 1 - Centro, 2 - Terminal, 3- DelValle");
            Sucursal sucursal = null;
            int opcionSucursal = teclado.nextInt();
            switch (opcionSucursal){
                case 1: sucursal = TandilCarCentro;
                    break;
                case 2: sucursal = TandilCarTerminal;
                    break;
                case 3: sucursal = TandilCarDelValle;
                    break;
                default:
                    System.out.println("La opción ingresada no es válida, intente nuevamente");
                    opciones();
            }
            System.out.println("Elija según lo que desea modificar: 1 - Nombre, 2 - Dirección, 3 - Horarios");
            int opcionAtributos = teclado.nextInt();
            switch (opcionAtributos){
                case 1:
                    System.out.println("Ingrese el nuevo nombre de la sucursal: ");
                    String nombre = teclado.nextLine();
                    sucursal.setNombre(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese la nueva dirección de la sucursal: ");
                    String direccion = teclado.nextLine();
                    sucursal.setDireccion(direccion);
                    break;
                case 3:
                    System.out.println("Ingrese los nuevos horarios de la sucursal: ");
                    String horarios = teclado.nextLine();
                    sucursal.setHorarios(horarios);
                    break;
                default:
                    System.out.println("La opción ingresada no es válida, intente nuevamente");
            }
        }catch (Error e){
            System.out.println("Ha ocurrido un error durante el procedimiento, por favor vuelva a intentarlo.");
        }finally {
            opciones();
        }
    }
}
