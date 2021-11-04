package paquete.tandilcar;

import java.util.Objects;

public class Motocicleta extends Vehiculo{

    public Motocicleta(Double km, String combustible, Integer modelo, String marca, Double precio, Boolean serviceAlDia) {
        super(km, combustible, modelo, marca, precio, serviceAlDia);
    }

    @Override
    public Integer nivelDeDesgaste() {

        if (Objects.equals(this.getAntiguedad(), 0)) {
            return 0;
        }
        else {
            if (this.getServiceAlDia() && this.getKm() < 30000) {
                return (int) Math.round(this.getKm() / this.getAntiguedad() / 1000);
            }
            else {
                return (int) Math.round(this.getKm() / this.getAntiguedad() / 10);
            }
        }
    }
}
