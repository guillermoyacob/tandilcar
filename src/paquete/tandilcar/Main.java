package paquete.tandilcar;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Login login = new Login();
        login.cargarUsuarios();
        Boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        String opcion;

        while(salir == false){
            Boolean admin = login.logueo();

            if (admin){
                System.out.println("Usted se ha logueado como administrador.");
                MenuAdmin menuAdmin = new MenuAdmin();
                menuAdmin.start();
            }else{
                System.out.println("Usted se ha logueado como un usuario común");
                MenuComun menuComun = new MenuComun();
                menuComun.start();
            }

            System.out.println("Si desea salir del programa escriba 'salir' o presione enter para continuar.");
            opcion = teclado.nextLine();
            if (Objects.equals(opcion.toLowerCase(), "salir")){
                salir = true;
            }
        }
        System.out.println("Gracias por usar nuestro servicio, ¡Hasta pronto!.");
    }
}