import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ocenę z matematyki:");
        double matematyka = scanner.nextDouble();

        System.out.println("Podaj ocenę z fizyki:");
        double fizyka = scanner.nextDouble();

        System.out.println("Podaj ocenę z chemii:");
        double chemia = scanner.nextDouble();

        double srednia = (matematyka + fizyka + chemia) / 3;

        System.out.println("Średnia ocen: " + srednia);

        scanner.close();
    }
}
