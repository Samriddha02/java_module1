public class SquaresArray {
    public static void main(String[] args) {
        int[] squares = new int[10];


        for (int i = 0; i <10; i++) {
            int number = i + 1;              
            squares[i] = number * number;   
        }

        
        System.out.println("Squares of numbers 1 to 10:");
        for (int i = 0; i <10; i++) {
            System.out.println((i + 1) + "^2 = " + squares[i]);
        }
    }
}
