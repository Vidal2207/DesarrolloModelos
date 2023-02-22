import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int opcion = 0;
        House home = new House();
        ToogleDoorCommand ButtonDoor = new ToogleDoorCommand(home); 
        ToogleLightsCommand ButtonLight = new ToogleLightsCommand(home);
        do {
            System.out.println("** House Remote **");
            System.out.println("Menú de opciones");
            System.out.println("  1 - Encender o apagar las luces");
            System.out.println("  2 - Abrir o cerrar puerta");
            System.out.println("  3 - Salir");
            System.out.print("Introduce una opción: ");
            try {
                opcion = reader.nextInt();
                switch(opcion){
                    case 1:
                        ButtonLight.execute();
                        break;
                    case 2:
                        ButtonDoor.execute();
                        break;
                    case 3:
                        System.out.println("Adiós");
                        break;
                    default:
                        System.out.println("No existe esta opción");
                }

            } catch (InputMismatchException im){
                System.out.println("Ingresa un número");
                reader.next();
            }

            try {
                Thread.sleep(5*500);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                /*No hacer nada*/
            }
        } while (opcion!=3);
        reader.close();
    }
}
