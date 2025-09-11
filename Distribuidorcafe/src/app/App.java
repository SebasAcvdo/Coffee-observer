import subject.DistribuidorCafe;
import subject.TipoCafe;
import observer.Barista;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DistribuidorCafe distribuidor = new DistribuidorCafe();
        Map<Integer, Barista> baristas = new HashMap<>();

        int opcion;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar barista (solo guardarlo)");
            System.out.println("2. Suscribir barista a la cooperativa");
            System.out.println("3. Desuscribir barista de la cooperativa");
            System.out.println("4. Añadir nuevo café");
            System.out.println("5. Menu notificaciones baristas");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.next();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    Barista nuevo = new Barista(nombre, id);
                    baristas.put(id, nuevo);
                    System.out.println("Barista registrado");
                }
                case 2 -> {
                    System.out.print("ID del barista: ");
                    int id = sc.nextInt();
                    Barista b = baristas.get(id);
                    if (b != null) distribuidor.registerObserver(b);
                    else System.out.println("Barista no encontrado.");
                }
                case 3 -> {
                    System.out.print("ID del barista: ");
                    int id = sc.nextInt();
                    Barista b = baristas.get(id);
                    if (b != null) distribuidor.removeObserver(b);
                    else System.out.println("Barista no encontrado.");
                }
                case 4 -> {
                    sc.nextLine(); 
                    System.out.print("Varietal: ");
                    String varietal = sc.nextLine();
                    System.out.print("Notas de cata: ");
                    String notas = sc.nextLine();
                    System.out.print("Altura cultivo (msnm): ");
                    float altura = sc.nextFloat();
                    sc.nextLine(); 
                    System.out.print("Origen (Depto): ");
                    String depto = sc.nextLine();
                    System.out.print("Origen (Municipio): ");
                    String municipio = sc.nextLine();
                    System.out.print("Cantidad disponible: ");
                    float cantidad = sc.nextFloat();

                    TipoCafe cafe = new TipoCafe(varietal, notas, altura, depto, municipio, cantidad);
                    distribuidor.añadirVarietalCafe(cafe);
                }
                case 5 ->{
                    System.out.println("estado notificaciones:");
                    for (Barista b : baristas.values()) {
                        b.mostrarNotificacion();
                    }

                }
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("⚠ Opción no válida.");
            }
        } while (opcion != 6);
    }
}
