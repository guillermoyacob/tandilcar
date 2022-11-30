package paquete.tandilcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MenuAdmin {

    private Scanner teclado = new Scanner(System.in);
    private Sucursal TandilCarCentro = new Sucursal("Centro","Rodriguez 715", "de 9:00 a 12:30 y de 17:00 a 20:30");
    private Sucursal TandilCarTerminal = new Sucursal("Terminal","Av. Balbín 600", "de 9:00 a 12:30 y de 17:00 a 20:30");
    private Sucursal TandilCarDelValle = new Sucursal("Del Valle","Av. Del Valle 230", "de 9:00 a 12:30 y de 17:00 a 20:30");


    public void start(){
        cargarDatos();
        opciones();
    }

    private void opciones(){

        int opcion = 0;
        System.out.println("1 - Listar los vehiculos");
        System.out.println("2 - Describir una sucursal");
        System.out.println("3 - Modificar los datos de una sucursal");
        System.out.println("4 - Modificar un vehiculo");
        System.out.println("5 - Salir.");
        try {
            opcion = teclado.nextInt();
            teclado.nextLine();
        }catch (Error e){
            System.out.println("El valor introducido es incorrecto, intente nuevamente.");
            opciones();
        }
        switch (opcion){
            case 1: imprimeDatos();
                break;
            case 2: describirSucursal();
                break;
            case 3: modificarSucursal();
                break;
            case 4: modificarVehiculo();
                break;
            case 5:
                System.out.println("Cerrando sesión. Saliendo del menú de administrador.");;
                break;
            default:
                System.out.println("La opción ingresada no es válida, intente nuevamente");
                opciones();
        }
    }

    private void cargarDatos(){
        //Instanciando los objetos vehículos
        Vehiculo Peugeot504 = new Auto(450000.00, "GNC", 1995, "Peugeot504", 190000.00, true);
        Vehiculo Renault12 = new Auto(290000.00, "Nafta", 1991, "Renault12", 180000.00, false);
        Vehiculo FordF100 = new Camioneta(390000.00, "GNC", 1990, "FordF100", 350000.00, false);
        Vehiculo Fiat600 = new Auto(200000.00, "Diesel", 1982, "Fiat600", 140000.00, true);
        Vehiculo YamahaRX = new Motocicleta(10000.00, "Nafta", 2005, "YamahaRX", 220000.00, true);
        Vehiculo ZanellaZB = new Motocicleta(80000.00, "Nafta", 1987, "ZanellaZB", 160000.00, true);
        Vehiculo MazdaCX3 = new Auto(50000.00, "Diesel", 2010, "MazdaCX3", 690000.00, true);
        Vehiculo MotomelATV = new Motocicleta(50000.00, "Nafta", 2015, "MotomelATV", 160000.00, true);
        Vehiculo FordRanger = new Camioneta(40000.00, "Diesel", 2017, "FordRanger", 620000.00, false);
        Vehiculo Peugeot208 = new Auto(65000.00, "Nafta", 2019, "Peugeot208", 890000.00, true);
        Vehiculo ToyotaHilux = new Camioneta(190000.00, "GNC", 2018, "ToyotaHilux", 890000.00, false);
        Vehiculo ChevroletSilverado = new Camioneta(140000.00, "GNC", 2021, "ChevroletSilverado", 990000.00, true);
        Vehiculo VolkswagenPolo = new Auto(250000.00, "Nafta", 2010, "VolkswagenPolo", 790000.00, true);
        Vehiculo ChevroletCorsa = new Auto(180000.00, "Nafta", 2010, "ChevroletCorsa", 690000.00, false);
        Vehiculo FiatSiena = new Auto(180000.00, "Nafta", 2010, "FiatSiena", 690000.00, true);
        Vehiculo VolkswagenGolf = new Auto(190000.00, "Nafta", 2015, "VolkswagenGolf", 490000.00, true);
        Vehiculo CitroenC3 = new Auto(220000.00, "Nafta", 2018, "VolkswagenC3", 690000.00, false);

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

    private Sucursal elegirSucursal(){

        System.out.println("Elija la sucursal: 1 - " + TandilCarCentro.getNombre() + ", 2 - " + TandilCarTerminal.getNombre() + ", 3- " + TandilCarDelValle.getNombre());

        Sucursal sucursal = null;

        try {
            int opcionSucursal = teclado.nextInt();
            teclado.nextLine();
            switch (opcionSucursal){
                case 1: sucursal = TandilCarCentro;
                    break;
                case 2: sucursal = TandilCarTerminal;
                    break;
                case 3: sucursal = TandilCarDelValle;
                    break;
                default:
                    sucursal = null;
            }
        } catch (Error e){
            System.out.println("La opción ingresada no es válida, intente nuevamente.");
            opciones();
            }

        return sucursal;
}
    private void imprimeDatos(){

        Sucursal sucursal = elegirSucursal();

        if (sucursal != null){

            try {
                System.out.println("Elija el tipo de filtrado de vehículos: 1 - Todos los vehículos, 2 - Categoría, 3 - Nivel de desgaste, 4 - Categoría y nivel de desgaste, \n5 - Realice una búsqueda más específica por categoría, kilometraje, combustible, modelo, marca, precio, service al día y nivel de desgaste: ");
                int opcionFiltrado = teclado.nextInt();
                teclado.nextLine();

                switch (opcionFiltrado){
                    case 1: sucursal.mostrarVehiculos();
                        break;
                    case 2:
                        System.out.println("Ingrese la categoría 'Auto', 'Camioneta' o 'Motocicleta': ");
                        String categoria = teclado.nextLine();
                        sucursal.mostrarVehiculos(categoria);
                        break;
                    case 3:
                        System.out.println("Ingrese el nivel de desgaste: ");
                        Integer nivelDesgaste = teclado.nextInt();
                        teclado.nextLine();
                        sucursal.mostrarVehiculos(nivelDesgaste);
                        break;
                    case 4:
                        System.out.println("Ingrese primero la categoría 'Auto', 'Camioneta' o 'Motocicleta': ");
                        String categoria2 = teclado.nextLine();
                        System.out.println("Ingrese el nivel de desgaste: ");
                        Integer nivelDesgaste2 = teclado.nextInt();
                        teclado.nextLine();
                        sucursal.mostrarVehiculos(categoria2, nivelDesgaste2);
                        break;
                    case 5:
                        System.out.println("Ingrese la categoría 'Auto', 'Camioneta' o 'Motocicleta': ");
                        String categoria3 = teclado.nextLine();
                        System.out.println("Ingrese hasta qué kilometraje desea o presione 'Enter' para omitir: ");
                        String km = teclado.nextLine();
                        System.out.println("Ingrese hasta qué combustible desea, si 'GNC', 'Nafta' o 'Diesel': ");
                        String combustible = teclado.nextLine();
                        System.out.println("Ingrese el modelo: ");
                        String modelo = teclado.nextLine();
                        System.out.println("Ingrese la marca: ");
                        String marca = teclado.nextLine();
                        System.out.println("Ingrese hasta qué precio desea o presione 'Enter' para omitir: ");
                        String precio = teclado.nextLine();
                        System.out.println("¿Desea que el vehículo tenga el service al día?, Ingrese 's' para sí o 'n' para no: ");
                        String service = teclado.nextLine();
                        System.out.println("Ingrese hasta qué nivel de desgaste desea o presione 'Enter' para omitir: ");
                        String nivelDeDesgaste3 = teclado.nextLine();
                        sucursal.mostrarVehiculos(km, combustible, modelo, marca, precio, service, categoria3, nivelDeDesgaste3);
                        break;
                    default:
                        System.out.println("No se ha ingresado una opción válida, por favor, inténtelo nuevamente.");
                }

            }catch(Error e){
                System.out.println("Ha ocurrido un error durante la elección, por favor, intentelo nuevamente");
            }finally {
                opciones();
            }

        }else {
            System.out.println("No se ha encontrado la sucursal, intentelo nuevamente.");
            opciones();
        }
    }

    private void describirSucursal(){
        Sucursal sucursal = elegirSucursal();
        if (sucursal != null){
            sucursal.descripcion();
        }else{
            System.out.println("No se ha encontrado la sucursal, inténtelo nuevamente.");
        }
        opciones();
    }

    private void modificarSucursal(){

        Sucursal sucursal = elegirSucursal();

        if (sucursal != null){
            try {
                System.out.println("Elija según lo que desea modificar: 1 - Nombre, 2 - Dirección, 3 - Horarios");
                int opcionAtributos = teclado.nextInt();
                teclado.nextLine();
                switch (opcionAtributos){
                    case 1:
                        System.out.println("Ingrese el nuevo nombre de la sucursal: ");
                        String nombre = teclado.nextLine();
                        sucursal.setNombre(nombre);
                        System.out.println("El nuevo nombre se ha registrado correctamente.");
                        sucursal.descripcion();
                        break;
                    case 2:
                        System.out.println("Ingrese la nueva dirección de la sucursal: ");
                        String direccion = teclado.nextLine();
                        sucursal.setDireccion(direccion);
                        System.out.println("La nueva dirección se ha registrado corrrectamente.");
                        sucursal.descripcion();
                        break;
                    case 3:
                        System.out.println("Ingrese los nuevos horarios de la sucursal: ");
                        String horarios = teclado.nextLine();
                        sucursal.setHorarios(horarios);
                        System.out.println("El nuevo horario se ha registrado correctamente.");
                        sucursal.descripcion();
                        break;
                    default:
                        System.out.println("La opción ingresada no es válida, intente nuevamente");
                }
            }catch (Error e){
                System.out.println("Ha ocurrido un error durante el procedimiento, por favor vuelva a intentarlo.");
            }finally {
                opciones();
            }
        }else {
            System.out.println("No se ha encontrado la sucursal, intentelo nuevamente.");
            opciones();
        }

    }

    private void modificarVehiculo(){

        Boolean encontrado = false;

        System.out.println("Ingrese el nombre del vehículo que desea modificar: ");
        String vehiculoAModificar = teclado.nextLine();

        List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

        listaVehiculos.addAll(TandilCarCentro.listaVehiculosSucursal());
        listaVehiculos.addAll(TandilCarTerminal.listaVehiculosSucursal());
        listaVehiculos.addAll(TandilCarDelValle.listaVehiculosSucursal());

        for (Vehiculo vehiculo : listaVehiculos){
            if (Objects.equals(vehiculoAModificar, vehiculo.getMarca())){
                encontrado = true;
                System.out.println("¿Qué atributo desea modificar: 1 - Kilómetros, 2 - Combustible, 3 - Modelo, 4 - Marca, 5 - Precio, 6 - Service al día: ");
                try {
                    int opcion = teclado.nextInt();
                    teclado.nextLine();
                    switch (opcion){
                        case 1:
                            System.out.println("Ingrese el nuevo kilometraje: ");
                            Double km = teclado.nextDouble();
                            teclado.nextLine();
                            vehiculo.setKm(km);
                            System.out.println("Se ha modificado el kilometraje correctamente.");
                            break;
                        case 2:
                            System.out.println("Ingrese el nuevo tipo de combustible: ");
                            String combustible = teclado.nextLine();
                            vehiculo.setCombustible(combustible);
                            System.out.println("Se ha modificado el tipo de combustible correctamente.");
                            break;
                        case 3:
                            System.out.println("Ingrese el nuevo modelo: ");
                            Integer modelo = teclado.nextInt();
                            teclado.nextLine();
                            vehiculo.setModelo(modelo);
                            System.out.println("Se ha modificado el modelo y la antiguedad del vehículo correctamente.");
                            break;
                        case 4:
                            System.out.println("Ingrese la nueva marca: ");
                            String marca = teclado.nextLine();
                            vehiculo.setMarca(marca);
                            System.out.println("Se ha modificado la marca correctamente.");
                            break;
                        case 5:
                            System.out.println("Ingrese el nuevo precio: ");
                            Double precio = teclado.nextDouble();
                            teclado.nextLine();
                            vehiculo.setPrecio(precio);
                            System.out.println("Se ha modificado el precio correctamente.");
                            break;
                        case 6:
                            System.out.println("Ingrese el estado del service al día: 1 - 'Está al día', 2 - 'No está al día: ");
                            int opcionService = teclado.nextInt();
                            teclado.nextLine();
                            switch (opcionService){
                                case 1:
                                    vehiculo.setServiceAlDia(true);
                                    System.out.println("Se ha modificado el estado del service.");
                                    break;
                                case 2:
                                    vehiculo.setServiceAlDia(false);
                                    System.out.println("Se ha modificado el estado del service.");
                                    break;
                                default:
                                    System.out.println("La opción ingresada es incorrecta, por favor intente nuevamente.");
                                    break;
                            }
                            break;
                        default:
                            break;
                    }
                }catch (Error e){
                    System.out.println("La opción ingresada no es válida, intente nuevamente.");
                }finally {
                    opciones();
                }
            }
        }

        if (Objects.equals(encontrado, false)){
            System.out.println("No se ha encontrado ese vehiculo, intente nuevamente");
                opciones();
        }


    }
}
