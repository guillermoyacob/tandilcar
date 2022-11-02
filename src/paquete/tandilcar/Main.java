package paquete.tandilcar;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Login login = new Login();
        login.cargarUsuarios();
        String usuario = login.logueo();

        if (Objects.equals(usuario, "admin")){
            MenuAdmin menuAdmin = new MenuAdmin();
            menuAdmin.start();
        }
    }
}