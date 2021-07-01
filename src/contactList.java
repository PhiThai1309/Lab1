import java.io.IOException;

public class contactList {

    public contactList() { }


    public static void main(String[] args) throws IOException {
        display d = new display();
//        checkInput choice = new checkInput();
        choose c = new choose();
        int i = 1;

        while (i > 0) {
            //Display option
            d.display();

            //check valid input
            checkInput.input(true);

            //Prompt user with function accordingly
            c.choose(checkInput.i);

            //
        }




//        System.out.println(i);

    }
}