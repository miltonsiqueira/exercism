import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class DNA {
  private Map<Character,Integer> nucleotides;

  public DNA(String stringDNA){
    buildNucleotides(stringDNA);
  }

  private void buildNucleotides(String stringDNA){
      this.nucleotides = new HashMap<Character,Integer>();
      this.nucleotides.put('A', 0);
      this.nucleotides.put('C', 0);
      this.nucleotides.put('G', 0);
      this.nucleotides.put('T', 0);

      if(stringDNA != null && !stringDNA.isEmpty()){
        for(Character c: stringDNA.toCharArray()){
            Integer count = nucleotides.get(c);
            if(count == null){
              nucleotides.put(c, 1);
            }else{
              nucleotides.put(c, count + 1);
            }
          }
      }

  }

  public Map<Character, Integer> nucleotideCounts(){
    return this.nucleotides;
  }

  public Integer count(Character c){

    Integer count = this.nucleotides.get(c);
    if(count == null){
      throw new IllegalArgumentException();
    }else{
      return count;
    }

  }

}
