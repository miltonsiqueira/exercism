import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> phrase(String str){
        Map<String, Integer> result = new HashMap<>();

        if(str != null && !str.isEmpty()) {

          String word = "";
          str = str.trim();
          int len = str.length();

          for(int i = 0; i < len; i++){

              char c = str.charAt(i);
              boolean isValidChar = (c >= 'A' && c <= 'Z')
                  || (c >= 'a' && c <= 'z')
                  || (c >= '0' && c <= '9');
              boolean isLastChar = (i == len - 1);

              if(isValidChar){
                  word = word + c;
              }

              if(!isValidChar || isLastChar){
                  if(!word.isEmpty()){
                      word = word.toLowerCase();
                      Integer total = result.get(word);
                      if(total == null){
                        total = 0;
                      }
                      total++;
                      result.put(word, total);
                      word = "";
                  }
              }
          }
        }
        
        return result;

    }
}
