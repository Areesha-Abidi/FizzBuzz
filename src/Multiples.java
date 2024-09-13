public class Multiples {
    public static void main(String[] args) {
        int num_Multiples = 0;
        int i = 1;
        while(i < 100){
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                num_Multiples++ ;
                i++ ;

            } else {
                i++ ;
            }
        }
        System.out.println(num_Multiples);
    }
}
