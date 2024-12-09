public class Repetition {
    public static void main(String[] args) {
        int height = 10;

        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 3; i <= height / 2; i++) {
            for (int j = 2; j < height; j++) {
                System.out.print(" ");
            }
            System.out.println("| |");
        }
      
        
    }
}    