import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int solution = (int)(Math.random()*100 + 1);
            System.out.println("Guess the number!");
            int number =0;
            while (number !=solution){
                number = scan.nextInt();
                if (number > solution){
                    System.out.println("Too High!");
                } else if (number < solution){
                    System.out.println("Too Low!");

                } else {
                    System.out.println("CONGRATULATIONS YOU GET NOTHING!");
                    break;
                }


        }
    }
}
