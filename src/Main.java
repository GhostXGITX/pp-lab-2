import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //tablica
        int[] oceny = new int[10];
        int iloscOcen = 0;

        //oceny
        System.out.println("Podaj oceny");
        int ocena = scanner.nextInt();
        while (iloscOcen < oceny.length) {
            oceny[iloscOcen] = ocena;
            iloscOcen++;
            if (iloscOcen < oceny.length) {
                System.out.println("Podaj kolejną ocenę:");
                ocena = scanner.nextInt();
            }
        }

        //wyświetlenie ocen
        System.out.println("Oceny:");
        for (int i = 0; i < iloscOcen; i++) {
            System.out.print(oceny[i] + " ");
        }
        System.out.println();

        //suma ocen
        int sumao = 0;
        for (int i = 0; i < iloscOcen; i++) {
            sumao += oceny[i];
        }
        System.out.println("Suma ocen: " + sumao);
        

        //średnia i wynik
        double suma = 0;
        for (int i = 0; i < iloscOcen; i++) {
            suma += oceny[i];
        }
        double srednia = suma / iloscOcen;
        System.out.println("Średnia ocen: " + srednia);

    

        scanner.close();

        

    }
}

