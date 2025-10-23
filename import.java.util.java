import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Cargar datos");
            System.out.println("3. Ver candidatos");
            System.out.println("4. Ver empresas");
            System.out.println("5. Ver estadísticas");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0; 
            }

            
            switch (opcion) {
                case 1:
                    System.out.println("\n🔐 Iniciando sesión...");
                    
                    break;

                case 2:
                    System.out.println("\n📂 Cargando datos desde CSV...");
                    
                    break;

                case 3:
                    System.out.println("\n👤 Mostrando lista de candidatos...");
                    
                    break;

                case 4:
                    System.out.println("\n🏢 Mostrando lista de empresas...");
                    
                    break;

                case 5:
                    System.out.println("\n📊 Mostrando estadísticas...");
                    
                    break;

                case 6:
                    System.out.println("\n👋 Saliendo del programa...");
                    break;

                default:
                    System.out.println("\n❌ Opción no válida, intenta de nuevo.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}
