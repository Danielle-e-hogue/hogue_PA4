import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class Application {
    public static void main (String [] args) throws IOException {
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        File dataFile = new File("problem1.txt");
        File outputFile = new File("unique_words.txt");
        duplicateRemover.remove(dataFile);
        duplicateRemover.write(outputFile);
    }
}
