package paquete.tandilcar;

import java.awt.im.InputContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Login {

    private Map<String, String> registro = new HashMap<String, String>();

    public void cargarUsuarios (){
        registro.put("admin", "1234");
    }

    public Boolean logueo(){
        String usuario, contrasenia;
        Boolean admin = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Para acceder al sistema ingrese su nombre de usuario: ");
        usuario = teclado.nextLine();
        if (registro.containsKey(usuario)){
            System.out.println("Usuario encontrado, ingrese su contraseña: ");
            contrasenia = teclado.nextLine();
            if (Objects.equals(contrasenia, registro.get(usuario))){
                System.out.println("Usted ha ingresado correctamente!");
                admin = true;
            }
        }else{
            System.out.println("Usuario no encontrado.");
        };
        return admin;
    }
}
