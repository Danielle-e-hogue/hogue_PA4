import java.io.IOException;
import java.io.File;

public class Application {
    public static void main (String[] args) throws IOException
    {
        DuplicateCounter cVal= new DuplicateCounter();
        File dataFile = new File("problem2.txt");
        File outputFile = new File("unique_words_counts.txt");
        cVal.count(dataFile);
        cVal.write(outputFile);
    }
}
