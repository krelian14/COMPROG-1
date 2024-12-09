public class overall {
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Poll poll = new Poll();
        poll.run();
    }
}

class Poll {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        int choice;

        do {
            System.out.println("\n--- Finals System ---");
            System.out.println("[1] Mathematical");
            System.out.println("[2] Selection");
            System.out.println("[3] Repetition");
            System.out.println("[4] Game");
            System.out.println("[5] Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    mathematicalMenu();
                    break;
                case 2:
                    selectionMenu();
                    break;
                case 3:
                    repetitionMenu();
                    break;
                case 4:
                    gameMenu();
                    break;
                case 5:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private void mathematicalMenu() {
        int mathChoice;

        do {
            System.out.println("\n--- Mathematical ---");
            System.out.println("1. Convert Inches to MM");
            System.out.println("2. Find the Area of a Circle");
            System.out.println("3. Find Angle (Sum of Angles in Triangle)");
            System.out.println("4. Return to Main Menu");
            System.out.print("Choose an option: ");
            mathChoice = scanner.nextInt();

            switch (mathChoice) {
                case 1:
                    System.out.print("Enter inches: ");
                    double inches = scanner.nextDouble();
                    System.out.println("Millimeters: " + (inches * 25.4));
                    break;
                case 2:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of Circle: " + (Math.PI * radius * radius));
                    break;
                case 3:
                    System.out.print("Enter first angle: ");
                    double angle1 = scanner.nextDouble();
                    System.out.print("Enter second angle: ");
                    double angle2 = scanner.nextDouble();
                    System.out.println("Third angle: " + (180 - angle1 - angle2));
                    break;
                case 4:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (mathChoice != 4);
    }

    private void selectionMenu() {
        int selectionChoice;

        do {
            System.out.println("\n--- Selection ---");
            System.out.println("1. Determine if a Number is Odd or Even");
            System.out.println("2. Return to Main Menu");
            System.out.print("Choose an option: ");
            selectionChoice = scanner.nextInt();

            switch (selectionChoice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " is even.");
                    } else {
                        System.out.println(number + " is odd.");
                    }
                    break;
                case 2:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (selectionChoice != 2);
    }

    private void repetitionMenu() {
        int repetitionChoice;

        do {
            System.out.println("\n--- Repetition ---");
            System.out.println("1. Count Up");
            System.out.println("2. Print Christmas Tree");
            System.out.println("3. Return to Main Menu");
            System.out.print("Choose an option: ");
            repetitionChoice = scanner.nextInt();

            switch (repetitionChoice) {
                case 1:
                    System.out.print("Enter a number for the loop count: ");
                    int count = scanner.nextInt();
                    System.out.println("Counting up to " + count + ":");
                    for (int i = 1; i <= count; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    printChristmasTree();
                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (repetitionChoice != 3);
    }

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

    private void gameMenu() {
        int gameChoice;

        do {
            System.out.println("\n--- Game ---");
            System.out.println("1. Play trivia game");
            System.out.println("2. Return to Main Menu");
            System.out.print("Choose an option: ");
            gameChoice = scanner.nextInt();

            switch (gameChoice) {
                case 1:
                    playTriviaGame();
                    break;
                case 2:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (gameChoice != 2);
    }

    private void playTriviaGame() {
        Scanner input = new Scanner(System.in);
        int lives = 3;
        String answer;

        while (lives > 0) {
            System.out.println("Who is the handsome teacher of BSIS 111?");
            System.out.print("Answer: ");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("Ojay Lanopa")) {
                System.out.println("===== YOU WON =====");
                break;
            } else {
                lives--;
                System.out.println("Wrong answer. Lives remaining: " + lives);
            }
        }

        if (lives == 0) {
            System.out.println("===== YOU LOSE =====");
        }

        input.close();
    }
}
}
