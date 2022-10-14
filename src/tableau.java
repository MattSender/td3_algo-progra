import java.util.Scanner;

class tableau {
    public static void main(String[] args){
        int x = 2;
        int y = 3;
        int z = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ecrire un nombre: ");
        int k = scanner.nextInt();


        int[] myArray = new int[]{x,y,z};

        if (x+y+z == k){
            System.out.println("Le tableau est egal a K soit = " + k );
        }else{
            System.out.println("Le tableau n'est pas egal a K soit " + x +"+" + y + "+" + z + " different de "+ k );
        }
    }

}
