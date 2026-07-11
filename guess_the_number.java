import java.util.Scanner;
import java.util.Random;

class game {
    public int guess_number;
    public int inputNumber;
    public int count = 0;

    game() {
        Random rand = new Random();
        this.guess_number = rand.nextInt(100);
    }

    void user_input() {
        System.out.print("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        this.inputNumber = sc.nextInt();
    }

    boolean guess() {
        count++;
        if (inputNumber == guess_number) {
            System.out.println("-----Congratulations-----");
            System.out.println("You guess the number");
            System.out.println("The number is :" + guess_number);
            System.out.println("Your attempt :" + count);
            return true;
        } else if (inputNumber < guess_number) {
            System.out.println("---Small---");
        } else {
            System.out.println("---Big---");
        }
        return false;
    }

}

public class guess_the_number {
    public static void main(String[] args) {
        game g = new game();

        while (true) {
            g.user_input();
            boolean b1 = g.guess();
            if (b1 == true) {
                break;
            }
        }
    }
}
