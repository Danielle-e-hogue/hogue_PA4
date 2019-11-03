import java.io.*;
import java.util.Scanner;
import java.util.HashSet;
import java.io.IOException;

public class DuplicateRemover {
    private HashSet<String> uniqueWords = new HashSet<>();

    public void remove(File dataFile) throws IOException {
        FileInputStream fileByteStream = new FileInputStream(dataFile);
        Scanner inFS = new Scanner(fileByteStream);

        //String data = inFS.next();
        while (inFS.hasNext()){
            uniqueWords.add(inFS.next());
        }
        inFS.close();
    }

    public void write(File outputFile) throws IOException {
        FileOutputStream otherWord = new FileOutputStream(outputFile);
        PrintWriter aWord = new PrintWriter(otherWord);
        aWord .println(uniqueWords);
        aWord .flush();
        otherWord.close();
    }
}
