package paquete.tandilcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TodosLosVehiculos {

    private List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
    private List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

    public void agregarVehiculo(Vehiculo vehiculo)
    {
        listaVehiculos.add(vehiculo);
    }

    public List<Vehiculo> devolverVehiculos()
    {
        return listaVehiculos;
    }

    public List<Vehiculo> devolverVehiculos(String categoria)
    {

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(categoria, vehiculo.getClass().getSimpleName()))
            {
                listaVehiculosFiltrados.add(vehiculo);
            }

        }

        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculos(Integer nivelDeDesgaste)
    {

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (vehiculo.nivelDeDesgaste() <= nivelDeDesgaste)
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }

        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculos(String categoria, Integer nivelDeDesgaste)
    {

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(categoria, vehiculo.getClass().getSimpleName()) && vehiculo.nivelDeDesgaste() <= nivelDeDesgaste)
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }

        return listaVehiculosFiltrados;
    }
}
