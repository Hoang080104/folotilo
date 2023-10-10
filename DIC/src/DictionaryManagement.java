import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DictionaryManagement {

    Dictionary dictionary2 = new Dictionary();

    public void insertFromCommandline(String target, String explain) {
        dictionary2.insertWord(target, explain);
    }
    public String getWordExplain(String word_target) {
        if (dictionary2.containsKey(word_target)) {
            return dictionary2.get(word_target) + "\n";
        } else {
            return "There is no such word.\n";
        }
    }
    public void insertFromFile(String filepath) {
        try {

            File file = new File(filepath);
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t", 2);
                if (parts.length >= 2) {
                    String word_target = parts[0];
                    String word_explain = parts[1];
                    dictionary2.insertWord(word_target, word_explain);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
