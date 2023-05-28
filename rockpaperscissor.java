import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        System.out.println("enter (0) for rock \n enter (1) for scissor \n enter (2) for paper");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        Random choice = new Random();
        int rand_choice = choice.nextInt(3);
        System.out.println("computer choice:" + rand_choice);
        if(input == 0 && rand_choice == 1 || input == 1 && rand_choice == 2||  input == 2&& rand_choice == 0){
            System.out.println("you won");
        }
        else if (input == 0 && rand_choice == 0 || input == 1 && rand_choice == 1||  input == 2&& rand_choice == 2){
            System.out.println("match drawn");
        }
        else {
            System.out.println(" you lost");
        }
    }
}
