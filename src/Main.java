import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 5;
        int y = 5;
        System.out.println(x * y);
        int molti = x*y;
        System.out.println(molti);

        String stringa1 = "ciao";
        String stringa2 ="mondo";
        String stringa3 = stringa1 + " " + stringa2;
        System.out.println(stringa3);

        String[] names = {"Carlo","Gicomo","Filippo","Alessia","Anna"};

//         names[3] = "Katia";

        System.out.println(names[0] + names[1] + names[2]+names[3]+names[4]);


       Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci la prima parola");
       String parola1 = scanner.nextLine();

        System.out.println("inserisci la seconda parola");
        String parola2 = scanner.nextLine();

        System.out.println("inserisci la terza parola");
        String parola3 = scanner.nextLine();

        System.out.println(parola1 + " " + parola2 +" " + parola3);
        String fraseInversa = parola1 + " " + parola2 +" " + parola3;
        System.out.println(fraseInversa);
    }
}