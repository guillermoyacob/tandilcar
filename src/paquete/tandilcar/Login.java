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
        registro.put("admin2", "root");
        registro.put("admin3", "abcd");
    }

    public Boolean logueo(){
        Boolean usuarioEncontrado = false;
        String usuario, contrasenia;
        Boolean admin = false;
        Scanner teclado = new Scanner(System.in);


        while(usuarioEncontrado == false){

            System.out.println("Para acceder al sistema ingrese su nombre de usuario o escriba 'Usuario comun' y accederá como un usuario común: ");
            usuario = teclado.nextLine();

            if(Objects.equals(usuario.toLowerCase(), "usuario comun")){
                break;
            }else{
                if (registro.containsKey(usuario)){
                    System.out.println("Usuario encontrado, ingrese su contraseña: ");
                    contrasenia = teclado.nextLine();
                    if (Objects.equals(contrasenia, registro.get(usuario))){
                        System.out.println("Usted ha ingresado correctamente!");
                        admin = true;
                        usuarioEncontrado = true;
                    }else{
                        System.out.println("La contraseña ingresada es incorrecta, por favor, intentelo nuevamente.");
                    }
                }else{
                    System.out.println("Usuario no encontrado.");
                }
            }
        }

        return admin;
    }
}
