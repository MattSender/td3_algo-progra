import java.util.Scanner;

class chat {

    private static void boucle(int n, char chat)
    {

        for(int i=0;i<n;i++)
        {
            System.out.print(chat);
        }
    }

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ecrire un nombre definissant la hauteur (minimum 5): ");
        int h = scanner.nextInt();


        System.out.println("Ecrire un nombre definissant la largueur (minimum 9): ");
        int l = scanner.nextInt();


        if (h >= 5 && l >= 9 && h <= 30 && l <= 20) {

            System.out.print("|\\");
            boucle(l - 4, '-');
            System.out.println("/|");

            for (int i = 1; i < h - 1; i++) {
                System.out.print("|");
                if (i == h / 2) {
                    System.out.print(" ");
                    System.out.print("0");
                    boucle(l - 6, '-');
                    System.out.print("0");
                    System.out.print(" ");
                } else {
                    boucle(l - 2, ' ');
                }
                System.out.println("|");
            }

            System.out.print(" \\_");
            boucle(l - 6, '^');
            System.out.println("_/ ");

        } else {
            System.out.println("Tes valeurs sont trop petites ou trop grandes");
            System.exit(0);
        }

    }
}