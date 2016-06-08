
public class Pangrams{
    public static boolean isPangram(String s){

        if(s == null || s.isEmpty()){
          return false;
        }

        for(char c = 'A'; c <= 'Z'; c++){
            if(s.indexOf(c) < 0 && s.indexOf((char)(c + 32)) < 0 ){
                return false;
            }
        }

        return true;

    }
}
