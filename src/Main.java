import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dato;

        System.out.println("Hola, buenas tardes, ingrese su informacion: ");
        dato = sc.nextLine();

        if (dato == null || dato.equals("")) {
            System.out.print("No admiten caracteres especiales");
        } else {
            System.out.print("Dato ingresado correctamente");
        }
        }


    }
