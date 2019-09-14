package sumowanie;

public class sum_tab1 {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7};

        int sum =0;

        int i =0;
        while (i < array.length){

            sum = sum+ array[i];
            // sum +=array[i];
            i++;
        }
        // for (int j=0; i < array[j]; j++){} // idea pętli for
        //for(int i : tab){sum +=i;}
        System.out.println(sum);
    }
}
