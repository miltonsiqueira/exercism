import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {

      Map<String, Integer> transformed = new HashMap<String, Integer>();

      for(Entry<Integer, List<String>> entry : old.entrySet()) {
        Integer points = entry.getKey();
        List<String> values = entry.getValue();

        for(String str: values){
          transformed.put(str.toLowerCase(), points);
        }

      }

      return transformed;
   }
}
