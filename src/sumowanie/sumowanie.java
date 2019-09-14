package sumowanie;

import java.util.Scanner;
// program sumuje liczby podane z klawiatury aż do wystąpienia 0
public class sumowanie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean koniec = true;
        //int [] tab;
       // int liczba = sc.nextInt();
        int sum = 0;
        /*while (koniec){
            int liczba = sc.nextInt();
            sum = sum + liczba;
            if (liczba == 0){
                koniec = false;
            }

         */
       // bez dodatkowej zmiennej boolean
        int liczba =0;
        do {
            liczba = sc.nextInt();
            sum = sum + liczba;
            // sum+=liczba;
        } while (liczba!=0);
        System.out.println(sum);
    }
}
