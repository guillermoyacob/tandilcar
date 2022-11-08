package paquete.tandilcar;

import java.util.Calendar;

public abstract class Vehiculo {

    private Double km;
    private String combustible;
    private Integer modelo;
    private Integer antiguedad;
    private String marca;
    private Double precio;
    private Boolean serviceAlDia;
    private static Integer ID = 0;
    private final Integer id;

    private Calendar calendario = Calendar.getInstance();

    public Vehiculo(Double km, String combustible, Integer modelo, String marca, Double precio, Boolean serviceAlDia){

        this.km = km;
        this.combustible = combustible;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.serviceAlDia = serviceAlDia;

        calcularAntiguedad();

        Vehiculo.ID++;
        this.id=Vehiculo.ID;
    }

    private void calcularAntiguedad(){
        this.antiguedad = calendario.get(Calendar.YEAR) - modelo;
    }

    public String toString(){
        return "El vehiculo " + getMarca() + " modelo " + getModelo().toString() + " tiene una antiguedad de " + getAntiguedad().toString() + " años, tiene " + getKm().toString() + " kilómetros hechos, funciona a" + getCombustible() + ", y tiene un precio de " + getPrecio().toString() + " pesos argentinos.";
    }

    public abstract Integer nivelDeDesgaste();

    public Double getKm() {
        return this.km;
    }

    public String getCombustible() {
        return this.combustible;
    }

    public Integer getModelo() {
        return this.modelo;
    }

    public Integer getAntiguedad()
    {
        return antiguedad;
    }

    public String getMarca() {
        return this.marca;
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

    public void setKm(Double km) {
        this.km = km;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
        calcularAntiguedad();
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setServiceAlDia(Boolean serviceAlDia) {
        this.serviceAlDia = serviceAlDia;
    }

}
