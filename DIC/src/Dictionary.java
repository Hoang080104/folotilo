import java.util.HashMap;

public class Dictionary {
    public HashMap<String, String> map = new HashMap<>();

    public Dictionary(){

    }


    public void insertWord(String word_target, String word_explain) {
        map.put(word_target, word_explain);
    }

    public void removeWord(String word_target) {
        map.remove(word_target);
    }


    public boolean containsKey(String word_target){
        return map.containsKey(word_target);
    }

    public String get (String word_target){
        return map.get(word_target);
    }
}
