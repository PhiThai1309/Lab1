import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

public class choose {
    public choose() {}

    public static String newString = "";

    public void choose(int i) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        switch (i) {
            case 1:
                loadFile file = new loadFile();
                file.loadFile();
                System.out.println("Load file successfully!");
                System.out.println("\n----------------------------");
                break;
            case 2:
                int j;
                System.out.println("All of the contacts: ");
                int count = loadFile.i - 1;
                for (j = 0; j <= count; j++) {
                    System.out.println(loadFile.s[j]);
                }
                loadFile.i = 0;
                System.out.println("\n-------------------------");
                break;
            case 3:
                System.out.println("Enter full name: ");
                String newName = input.nextLine();
                newString  = newString.concat(newName + "; ");
                System.out.println("Enter phone number: ");
                String newNumber = input.nextLine();
                newString = newString.concat(newNumber + "; ");
                System.out.println("Enter email address: ");
                String newEmail = input.nextLine();
                newString = newString.concat(newEmail + "; ");
                System.out.println("Enter the address: ");
                String newAddress = input.nextLine();
                newString = newString.concat(newAddress);

                //Write the new contact to the file
                try (
                        FileWriter output = new FileWriter("C:\\Users\\phima\\IdeaProjects\\Lab1\\src\\file\\contacts.txt", true)
                ) {
                    output.write(newString + "\n");
                    output.close();

                    //Confirm the new contact:
                    System.out.println("Added to the contacts list: ");
                    System.out.println(newString);

                    //Reopen file
                    loadFile file2 = new loadFile();
                    file2.loadFile();
                    System.out.println("\n-------------------------");
                } catch (IOException e) {
                    e.printStackTrace();
                }

                //return the value back to null
                newString = "";
                newAddress = "";
                newEmail = "";
                newName = "";
                newNumber = "";

                break;
            case 4:

            case 5:

            case 6:

            case 7:

            case 8:

            case 9:
                System.out.println("Program exit\nAll files are saved successfully!");
                exit(1);
            default:
                System.out.println("error");
        }

    }
}
