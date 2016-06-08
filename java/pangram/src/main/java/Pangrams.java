
public class Pangrams{
    public static boolean isPangram(String s){
        if(s == null || s.isEmpty()){
          return false;
        }

        s = s.toLowerCase();
        for(char c = 'a'; c <= 'z'; c++){
            if(s.indexOf(c) < 0){
                return false;
            }
        }

        return true;

    }
}
