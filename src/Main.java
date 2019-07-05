import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Koliko želite unijeti brojeva?");
        int brojevi = s.nextInt();
        int [] arr = new int[brojevi];
        System.out.println("Unesite brojeve: ");
        for(int i = 0; i < brojevi; i++){
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);
        for(int x : arr) System.out.println(x+" ");
    }
}
