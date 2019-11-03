import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.io.IOException;

public class DuplicateCounter {

    private HashMap<String, Integer> wordCounter = new HashMap<>();
    public void count(File dataFile) throws IOException {
        FileInputStream cStream = new FileInputStream(dataFile);
        Scanner scnr = new Scanner(cStream);
        try {
            while (scnr.hasNext()) {
                String c = scnr.next();
                if (wordCounter.containsKey(c)) {
                    wordCounter.put(c, wordCounter.get(c) + 1);
                } else {
                    wordCounter.put(c, 1);
                }
            }
            cStream.close();
        } catch (IOException e) {
            System.out.println("Exception" + e.getMessage());
        }
    }
    
    public void write(File outputFile) throws IOException
    {
        FileOutputStream pc= new FileOutputStream(outputFile);
        PrintWriter p;
        p = new PrintWriter(pc);
        p.println(wordCounter);
        p.flush();
        p.close();
    }
}
