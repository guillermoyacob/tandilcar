package paquete.tandilcar;

import java.util.Calendar;

public abstract class Vehiculo {

    private Double km;
    private String combustible;
    private final Integer MODELO;
    private Integer antiguedad;
    private final String MARCA;
    private Double precio;
    private Boolean serviceAlDia;
    private static Integer ID = 0;
    private final Integer id;

    private Calendar calendario = Calendar.getInstance();

    public Vehiculo(Double km, String combustible, Integer modelo, String marca, Double precio, Boolean serviceAlDia){

        this.km = km;
        this.combustible = combustible;
        this.MODELO = modelo;
        this.MARCA = marca.toLowerCase();
        this.precio = precio;
        this.serviceAlDia = serviceAlDia;

        this.antiguedad = calendario.get(Calendar.YEAR) - modelo;

        Vehiculo.ID++;
        this.id=Vehiculo.ID;

        TodosLosVehiculos.listaVehiculos.add(this);

    }

    public abstract Integer nivelDeDesgaste();

    public Double getKm() {
        return this.km;
    }

    public String getCombustible() {
        return this.combustible;
    }

    public Integer getMODELO() {
        return this.MODELO;
    }

    public Integer getAntiguedad()
    {
        return antiguedad;
    }

    public String getMARCA() {
        return this.MARCA;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public Boolean getServiceAlDia() {
        return serviceAlDia;
    }

    public Integer getId() {
        return this.id;
    }
}
