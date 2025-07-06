public class ex8 {
    public static void main(String[] args) {
        String [] names = {"Anna", "Luca", "Alberto", "Giulia", "Andrea"};

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if(name.toUpperCase().charAt(0) == 'A'){
                System.out.println(name);
            }
        }
    }
}
