import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        String filename = "sample_input.txt";
        if (args.length >= 1) filename = args[0];

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
            String first = br.readLine();
            System.out.println("First line: " + first);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + filename + " not found.");
        } catch (IOException e) {
            System.out.println("IOException caught while reading file: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException ignored) {}
        }
    }
}
