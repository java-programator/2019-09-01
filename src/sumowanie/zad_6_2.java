package sumowanie;

public class zad_6_2 {
    public static void main(String[] args) {
       String zdanie = "Ala ma kota";


       char znak = zdanie.charAt(0);
       String out ="";
       for (int i=zdanie.length()-1; i>=0; i--){
           char z = zdanie.charAt(i);
           if (Character.isUpperCase(z)){

               z = Character.toLowerCase(z);
           }
               else{
                   z = Character.toUpperCase(z);
               }
       out +=z;

       }
        System.out.println(out);
       }
        /*String str = new String;
        str = {"test", "TEST", "Test"};
        String Elem = "";
         for(int i,str){

         }

    }*/
}
