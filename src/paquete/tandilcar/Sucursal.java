package paquete.tandilcar;

import java.util.List;

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
