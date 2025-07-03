public class esercizio3 {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5}; 

        int sam = 0;
        for(int i = 0; i < a.length; i++){
            int array = a[i];

            sam = array + sam;
        }
        System.err.println(sam);
    }
}
