import java.util.Scanner;

public class checkInput {
    public checkInput() {}

    public static int i = 1;

    public static void input(boolean check) {
        //Check valid input
        while (check) {
            try {
                Scanner input = new Scanner(System.in);
                i = input.nextInt();

                //input must be from 1 to 9
                if(i > 0 && i < 10) {
                    check = false;
                } else {
                    System.out.println("Please input again: ");
                    check = true;
                }
            } catch (Exception e) {
                System.out.println("Please input again: ");
                check = true;
            }
        }
    }

}
