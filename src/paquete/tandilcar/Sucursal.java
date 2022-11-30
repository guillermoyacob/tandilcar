package paquete.tandilcar;

import java.util.List;
import java.util.Objects;

public class Sucursal {

    private String nombre;
    private String direccion;
    private String horarios;
    private TodosLosVehiculos VehiculosSucursal = new TodosLosVehiculos();

    public Sucursal(String nombre, String direccion, String horarios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.horarios = horarios;
    }

    public void agregarVehiculo(Vehiculo vehiculo)
    {
        VehiculosSucursal.agregarVehiculo(vehiculo);
    }

    public void mostrarVehiculos()
    {
        List<Vehiculo> listaDeVehiculos = VehiculosSucursal.devolverVehiculos();

        System.out.println("------------------------- Sucursal " + this.nombre + ": Todos los vehículos --------------------------");

        recorreEImprime(listaDeVehiculos);

        System.out.println("------------------------------------------------------------------------------------------");
    }

    public void mostrarVehiculos(String categoria)
    {
        List<Vehiculo> listaDeVehiculosFiltrados = VehiculosSucursal.devolverVehiculos(categoria);

        System.out.println("------------------------ Sucursal " + this.nombre + ": Todos los vehículos  de categoría " +  categoria + " ----------------------------");

        recorreEImprime(listaDeVehiculosFiltrados);

        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }

    public void mostrarVehiculos(Integer nivelDeDesgaste)
    {
        List<Vehiculo> listaDeVehiculosFiltrados = VehiculosSucursal.devolverVehiculos(nivelDeDesgaste);

        System.out.println("------ Sucursal " + this.nombre + ": Todos los vehículos con un nivel de desgaste de hasta " + nivelDeDesgaste + " ---------");

        recorreEImprime(listaDeVehiculosFiltrados);

        System.out.println("---------------------------------------------------------------------------------------------");
    }

    public void mostrarVehiculos(String categoria, Integer nivelDeDesgaste)
    {
        List<Vehiculo> listaDeVehiculosFiltrados = VehiculosSucursal.devolverVehiculos(categoria, nivelDeDesgaste);

        System.out.println("------- Sucursal " + this.nombre + ": Todos los vehículos de categoría " + categoria + " y con un nivel de desgaste de hasta " + nivelDeDesgaste + " --------");

        recorreEImprime(listaDeVehiculosFiltrados);

        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    }

    public void mostrarVehiculos(String km, String combustible, String modelo, String marca, String precio, String service, String categoria, String nivelDeDesgaste){

        Boolean serviceAlDia;

        if (Objects.equals(service, "s")){
            service = "con service al día";
            serviceAlDia = true;
        } else {
            service = "sin service al día";
            serviceAlDia = false;
        }

        if (Objects.equals(km, "") && Objects.equals(precio, "") && Objects.equals(nivelDeDesgaste, "")){

            List<Vehiculo> listaDeVehiculosFiltrados = VehiculosSucursal.devolverVehiculos(combustible, Integer.valueOf(modelo), marca, serviceAlDia, categoria);

            System.out.println("------- Sucursal " + this.nombre + ": Todos los vehículos según el filtrado de categoría " + categoria + " combustible " + combustible + " modelo " + modelo.toString() + " marca " + marca + " y " + service  + " --------");

            recorreEImprime(listaDeVehiculosFiltrados);

            System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        } else if (Objects.equals(km, "") && Objects.equals(precio, "") && !Objects.equals(nivelDeDesgaste, "")) {

            List<Vehiculo> listaDeVehiculosFiltrados = VehiculosSucursal.devolverVehiculos(combustible, Integer.valueOf(modelo), marca, serviceAlDia, categoria, Integer.valueOf(nivelDeDesgaste));

            System.out.println("------- Sucursal " + this.nombre + ": Todos los vehículos según el filtrado de categoría " + categoria + " combustible " + combustible + " modelo " + modelo.toString() + " marca " + marca + " " + service + " y un nivel de desgaste de hasta " + nivelDeDesgaste.toString() + " --------");

            recorreEImprime(listaDeVehiculosFiltrados);

            System.out.println("-------------------------------------------------------------------------------------------------------------------------");


        } else if (Objects.equals(km, "") && !Objects.equals(precio, "") && Objects.equals(nivelDeDesgaste, "")) {

            List<Vehiculo> listaDeVehiculosFiltrados = VehiculosSucursal.devolverVehiculos(combustible, Integer.valueOf(modelo), marca, Double.valueOf(precio), serviceAlDia, categoria);

            System.out.println("------- Sucursal " + this.nombre + ": Todos los vehículos según el filtrado de categoría " + categoria + " combustible " + combustible + " modelo " + modelo + " marca " + marca + " con un precio de hasta " + precio + " y " + service + " --------");

            recorreEImprime(listaDeVehiculosFiltrados);

            System.out.println("-------------------------------------------------------------------------------------------------------------------------");


        } else if (!Objects.equals(km, "") && Objects.equals(precio, "") && Objects.equals(nivelDeDesgaste, "")) {

            List<Vehiculo> listaDeVehiculosFiltrados = VehiculosSucursal.devolverVehiculos(Double.valueOf(km), combustible, Integer.valueOf(modelo), marca, serviceAlDia, categoria);

            System.out.println("------- Sucursal " + this.nombre + ": Todos los vehículos según el filtrado de categoría " + categoria + " con un kilometraje de hasta " + km + " combustible " + combustible + " modelo " + modelo + " marca " + marca + " y " + service + " --------");

            recorreEImprime(listaDeVehiculosFiltrados);

            System.out.println("-------------------------------------------------------------------------------------------------------------------------");


        } else if (!Objects.equals(km, "") && !Objects.equals(precio, "") && Objects.equals(nivelDeDesgaste, "")) {


            List<Vehiculo> listaDeVehiculosFiltrados = VehiculosSucursal.devolverVehiculos(Double.valueOf(km), combustible, Integer.valueOf(modelo), marca, Double.valueOf(precio), serviceAlDia, categoria);

            System.out.println("------- Sucursal " + this.nombre + ": Todos los vehículos según el filtrado de categoría " + categoria + " con un kilometraje de hasta " + km + " combustible " + combustible + " modelo " + modelo + " marca " + marca + " con un precio de hasta " + precio + " y " + service + " --------");

            recorreEImprime(listaDeVehiculosFiltrados);

            System.out.println("-------------------------------------------------------------------------------------------------------------------------");


        } else if (Objects.equals(km, "") && !Objects.equals(precio, "") && !Objects.equals(nivelDeDesgaste, "")) {

            List<Vehiculo> listaDeVehiculosFiltrados = VehiculosSucursal.devolverVehiculos(combustible, Integer.valueOf(modelo), marca, Double.valueOf(precio), serviceAlDia, categoria, Integer.valueOf(nivelDeDesgaste));

            System.out.println("------- Sucursal " + this.nombre + ": Todos los vehículos según el filtrado de categoría " + categoria + " combustible " + combustible + " modelo " + modelo + " marca " + marca + " con un precio de hasta " + precio + " " + service + " y un nivel de desgaste de hasta " + nivelDeDesgaste.toString() + " --------");

            recorreEImprime(listaDeVehiculosFiltrados);

            System.out.println("-------------------------------------------------------------------------------------------------------------------------");


        } else if (!Objects.equals(km, "") && Objects.equals(precio, "") && !Objects.equals(nivelDeDesgaste, "")) {

            List<Vehiculo> listaDeVehiculosFiltrados = VehiculosSucursal.devolverVehiculos(Double.valueOf(km), combustible, Integer.valueOf(modelo), marca, serviceAlDia, categoria, Integer.valueOf(nivelDeDesgaste));

            System.out.println("------- Sucursal " + this.nombre + ": Todos los vehículos según el filtrado de categoría " + categoria + " con un kilometraje de hasta " + km + " combustible " + combustible + " modelo " + modelo + " marca " + marca + " " + service + " y un nivel de desgaste de hasta " + nivelDeDesgaste + " --------");

            recorreEImprime(listaDeVehiculosFiltrados);

            System.out.println("-------------------------------------------------------------------------------------------------------------------------");


        } else if (!Objects.equals(km, "") && !Objects.equals(precio, "") && !Objects.equals(nivelDeDesgaste, "")) {

            List<Vehiculo> listaDeVehiculosFiltrados = VehiculosSucursal.devolverVehiculos(Double.valueOf(km), combustible, Integer.valueOf(modelo), marca, Double.valueOf(precio), serviceAlDia, categoria, Integer.valueOf(nivelDeDesgaste));

            System.out.println("------- Sucursal " + this.nombre + ": Todos los vehículos según el filtrado de categoría " + categoria + " con un kilometraje de hasta " + km + " combustible " + combustible + " modelo " + modelo + " marca " + marca + " con un precio de hasta " + precio + " " + service + " y un nivel de desgaste de hasta " + nivelDeDesgaste.toString() + " --------");

            recorreEImprime(listaDeVehiculosFiltrados);

            System.out.println("-------------------------------------------------------------------------------------------------------------------------");

        }
    }

    public void descripcion()
    {
        System.out.println("La sucursal "+this.getNombre()+" está ubicada en "+this.getDireccion()+" y sus horarios son "+this.getHorarios());
    }

    private void recorreEImprime(List<Vehiculo> listaVehiculos)
    {
        for(Vehiculo vehiculo : listaVehiculos)
        {
            describirVehiculo(vehiculo);
        }
    }

    private Double precioFinalVehiculo(Double precio, Boolean serviceAlDia, Double kilometraje){

        Double precioFinal = precio;

        if(!serviceAlDia){
            precioFinal = precioFinal * 0.95;
        }

        if(kilometraje >= 100000){
            precioFinal = precioFinal * 0.9;
        }

        return precioFinal;
    }

    public void describirVehiculo(Vehiculo vehiculo)
    {
        System.out.println(
                "El vehiculo numero " + vehiculo.getId() + " es del tipo "+ vehiculo.getClass().getSimpleName() + " marca "+ vehiculo.getMarca() + " modelo " + vehiculo.getModelo()
                        + " tiene " + vehiculo.getKm() + " kilometros, funciona a " + vehiculo.getCombustible() + " y un precio de $" + precioFinalVehiculo(vehiculo.getPrecio(), vehiculo.getServiceAlDia(), vehiculo.getKm()).toString() + " pesos argentinos. Su nivel de desgaste es "
                        + vehiculo.nivelDeDesgaste());
    }

    public List<Vehiculo> listaVehiculosSucursal(){
        return VehiculosSucursal.devolverVehiculos();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }
}
