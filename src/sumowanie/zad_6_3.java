package sumowanie;

import java.util.Random;

public class zad_6_3 {
    public static void main(String[] args) {

      int[] tab = new int[10];

      Random random = new Random(90);
      int size = 5_000_000;
      int src[] = new int[size];

      for(int i = 0 ; i< src.length; i++){
        src[i]=random.nextInt(90)+10;
    }
      long timestamp1 = System.nanoTime();
      int dest1[] = new int [src.length];
      for (int i =0 ; i <src.length;i++)
          dest1[i] = src[i];
    }
    long timestamp2 = System.nanoTime();

    int dest2[] = new int[src.lenght];

}
