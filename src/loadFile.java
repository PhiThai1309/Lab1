import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class loadFile {
    public loadFile() {}

    public static String[] s;
    public static int i = 0;

    public void loadFile() {
        File file = new File("C:\\Users\\phima\\IdeaProjects\\Lab1\\src\\file\\contacts.txt");
        //check existence
        try{
            Scanner input = new Scanner(file);
            s = new String[100];

            //use ; as delimiter
            input.useDelimiter("; ");

            //loop to the end of file
            while (input.hasNextLine()) {
                s[i] = input.nextLine();
                i++;
            }

        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}
