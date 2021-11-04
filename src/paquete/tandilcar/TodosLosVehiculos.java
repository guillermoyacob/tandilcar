package paquete.tandilcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TodosLosVehiculos {

    private List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

    public void agregarVehiculo(Vehiculo vehiculo)
    {
        listaVehiculos.add(vehiculo);
    }

    public void mostrarVehiculos()
    {
        System.out.println("-------------------- Todos los vehiculos ----------------------");

        for(Vehiculo vehiculo : listaVehiculos)
        {
            describirVehiculo(vehiculo);
        }

        System.out.println("----------------------------------------------------------------");
    }

    public void mostrarVehiculos(String categoria)
    {
        System.out.println("------Vehiculos por categoría "+ categoria+" ---------------------");

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(categoria, vehiculo.getClass().getSimpleName()))
            {
                describirVehiculo(vehiculo);
            }

        }

        System.out.println("------------------------------------------------------------------");
    }

    public void mostrarVehiculos(Integer nivelDeDesgaste)
    {
        System.out.println("------ Vehiculos por nivel de desgaste hasta "+ nivelDeDesgaste + " ---------");

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (vehiculo.nivelDeDesgaste() <= nivelDeDesgaste)
            {
                describirVehiculo(vehiculo);
            }
        }

        System.out.println("----------------------------------------------------------------------------");
    }

    public void mostrarVehiculos(String categoria, Integer nivelDeDesgaste)
    {
        System.out.println("---- Vehiculos por categoria " + categoria + " y nivel de desgaste hasta "+ nivelDeDesgaste + " ---");

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(categoria, vehiculo.getClass().getSimpleName()) && vehiculo.nivelDeDesgaste() <= nivelDeDesgaste)
            {
                describirVehiculo(vehiculo);
            }
        }

        System.out.println("------------------------------------------------------------------------------------");
    }

    private void describirVehiculo(Vehiculo vehiculo)
    {
        System.out.println(
                "El vehiculo numero " + vehiculo.getId() + " es del tipo "+ vehiculo.getClass().getSimpleName() + " marca "+ vehiculo.getMARCA() + " modelo " + vehiculo.getMODELO()
                        + " tiene " + vehiculo.getKm() + " kilometros, funciona a " + vehiculo.getCombustible() + " y un precio de $" + vehiculo.getPrecio() + " pesos argentinos. Su nivel de desgaste es "
                        + vehiculo.nivelDeDesgaste());
    }
}
