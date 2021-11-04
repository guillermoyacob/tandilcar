package paquete.tandilcar;

public class Sucursal {

    private String zona;
    private String direccion;
    private String horarios;
    private TodosLosVehiculos VehiculosSucursal = new TodosLosVehiculos();

    public Sucursal(String zona, String direccion, String horarios) {
        this.zona = zona;
        this.direccion = direccion;
        this.horarios = horarios;
    }

    public void agregarVehiculo(Vehiculo vehiculo)
    {
        VehiculosSucursal.agregarVehiculo(vehiculo);
    }

    public void mostrarVehiculos()
    {
        VehiculosSucursal.mostrarVehiculos();
    }

    public void mostrarVehiculos(String categoria)
    {
        VehiculosSucursal.mostrarVehiculos(categoria);
    }

    public void mostrarVehiculos(Integer nivelDeDesgaste)
    {
        VehiculosSucursal.mostrarVehiculos(nivelDeDesgaste);
    }

    public void mostrarVehiculos(String categoria, Integer nivelDeDesgaste)
    {
        VehiculosSucursal.mostrarVehiculos(categoria, nivelDeDesgaste);
    }

    public void descripcion()
    {
        System.out.println("La sucursal "+this.getZona()+" está ubicada en "+this.getDireccion()+" y sus horarios son "+this.getHorarios());
    }

    public String getZona() {
        return zona;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getHorarios() {
        return horarios;
    }
}
