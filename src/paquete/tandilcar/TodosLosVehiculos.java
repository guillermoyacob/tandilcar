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

    public List<Vehiculo> devolverTodosLosVehiculos()
    {
        return listaVehiculos;
    }

    public List<Vehiculo> devolverVehiculosCategoria(String categoria)
    {
        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(categoria, vehiculo.getClass().getSimpleName()))
            {
                listaVehiculosFiltrados.add(vehiculo);
            }

        }

        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculosNDesgaste(Integer nivelDeDesgaste)
    {
        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (vehiculo.nivelDeDesgaste() <= nivelDeDesgaste)
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }

        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculosKm(Double km){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (vehiculo.getKm() <= km)
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }
        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculosCombustible(String combustible){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(combustible, vehiculo.getCombustible()))
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }
        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculosModelo(Integer modelo){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(vehiculo.getModelo(), modelo))
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }
        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculosMarca(String marca){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(marca, vehiculo.getMarca()))
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }
        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculosPrecio(Double precio){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (vehiculo.getPrecio() <= precio)
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }
        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculosService(Boolean service){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (vehiculo.getServiceAlDia() == service)
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }
        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculos(String categoria, Integer nivelDeDesgaste)
    {
        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(categoria, vehiculo.getClass().getSimpleName()) && vehiculo.nivelDeDesgaste() <= nivelDeDesgaste)
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }

        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculos(Double km, String combustible, Integer modelo, String marca, Boolean serviceAlDia, String categoria){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (vehiculo.getKm() <= km && Objects.equals(vehiculo.getCombustible(), combustible) && Objects.equals(vehiculo.getModelo(), modelo) && Objects.equals(vehiculo.getMarca().toLowerCase(), marca.toLowerCase()) && vehiculo.getServiceAlDia() == serviceAlDia && Objects.equals(vehiculo.getClass().getSimpleName(), categoria))
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }

        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculos(String combustible, Integer modelo, String marca, Double precio, Boolean serviceAlDia, String categoria){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(vehiculo.getCombustible(), combustible) && Objects.equals(vehiculo.getModelo(), modelo) && Objects.equals(vehiculo.getMarca().toLowerCase(), marca.toLowerCase()) && vehiculo.getPrecio() <= precio && vehiculo.getServiceAlDia() == serviceAlDia && Objects.equals(vehiculo.getClass().getSimpleName(), categoria))
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }

        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculos(Double km, String combustible, Integer modelo, String marca, Double precio, Boolean serviceAlDia, String categoria){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (vehiculo.getKm() <= km && Objects.equals(vehiculo.getCombustible(), combustible) && Objects.equals(vehiculo.getModelo(), modelo) && Objects.equals(vehiculo.getMarca().toLowerCase(), marca.toLowerCase()) && vehiculo.getPrecio() <= precio && vehiculo.getServiceAlDia() == serviceAlDia && Objects.equals(vehiculo.getClass().getSimpleName(), categoria))
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }

        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculos(String combustible, Integer modelo, String marca, Boolean serviceAlDia, String categoria){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(vehiculo.getCombustible(), combustible) && Objects.equals(vehiculo.getModelo(), modelo) && Objects.equals(vehiculo.getMarca().toLowerCase(), marca.toLowerCase()) && vehiculo.getServiceAlDia() == serviceAlDia && Objects.equals(vehiculo.getClass().getSimpleName(), categoria))
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }

        return listaVehiculosFiltrados;
    }
    public List<Vehiculo> devolverVehiculos(String combustible, Integer modelo, String marca, Boolean serviceAlDia, String categoria, Integer nivelDeDesgaste){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(vehiculo.getCombustible(), combustible) && Objects.equals(vehiculo.getModelo(), modelo) && Objects.equals(vehiculo.getMarca().toLowerCase(), marca.toLowerCase()) && vehiculo.getServiceAlDia() == serviceAlDia && Objects.equals(vehiculo.getClass().getSimpleName(), categoria) && vehiculo.nivelDeDesgaste() <= nivelDeDesgaste)
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }

        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculos(Double km, String combustible, Integer modelo, String marca, Boolean serviceAlDia, String categoria, Integer nivelDeDesgaste){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (vehiculo.getKm() <= km && Objects.equals(vehiculo.getCombustible(), combustible) && Objects.equals(vehiculo.getModelo(), modelo) && Objects.equals(vehiculo.getMarca().toLowerCase(), marca.toLowerCase()) && vehiculo.getServiceAlDia() == serviceAlDia && Objects.equals(vehiculo.getClass().getSimpleName(), categoria) && vehiculo.nivelDeDesgaste() <= nivelDeDesgaste)
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }

        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculos(String combustible, Integer modelo, String marca, Double precio, Boolean serviceAlDia, String categoria, Integer nivelDeDesgaste){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (Objects.equals(vehiculo.getCombustible(), combustible) && Objects.equals(vehiculo.getModelo(), modelo) && Objects.equals(vehiculo.getMarca().toLowerCase(), marca.toLowerCase()) && vehiculo.getPrecio() <= precio && vehiculo.getServiceAlDia() == serviceAlDia && Objects.equals(vehiculo.getClass().getSimpleName(), categoria) && vehiculo.nivelDeDesgaste() <= nivelDeDesgaste)
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }

        return listaVehiculosFiltrados;
    }

    public List<Vehiculo> devolverVehiculos(Double km, String combustible, Integer modelo, String marca, Double precio, Boolean serviceAlDia, String categoria, Integer nivelDeDesgaste){

        List<Vehiculo> listaVehiculosFiltrados = new ArrayList<Vehiculo>();

        for(Vehiculo vehiculo : listaVehiculos)
        {
            if (vehiculo.getKm() <= km && Objects.equals(vehiculo.getCombustible(), combustible) && Objects.equals(vehiculo.getModelo(), modelo) && Objects.equals(vehiculo.getMarca().toLowerCase(), marca.toLowerCase()) && vehiculo.getPrecio() <= precio && vehiculo.getServiceAlDia() == serviceAlDia && Objects.equals(vehiculo.getClass().getSimpleName(), categoria) && vehiculo.nivelDeDesgaste() <= nivelDeDesgaste)
            {
                listaVehiculosFiltrados.add(vehiculo);
            }
        }

        return listaVehiculosFiltrados;
    }
}
