package paquete.tandilcar;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Login login = new Login();
        login.cargarUsuarios();
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
    }
}