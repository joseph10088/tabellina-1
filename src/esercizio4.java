public class esercizio4 {
    public static void main(String[] args) {
        int [] a = {1, 2, 5, 9, 3}; 

        int array = a[0];

        for (int i = 0; i < a.length; i++) {
            if(a[i] > array){
                array = a[i];
            }
        }

        System.out.println(array);

    }
}
