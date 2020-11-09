public class Demo{

  public static void removeDuplicates(SuperArray s){
    for(int i = 0; i < s.size(); i++){
      String test = s.get(i);
      for(int j = i+1; j < s.size(); j++){
        if(test.equals(s.get(j))){
          s.remove(j);
          j--;
        }
      }
    }
  }

  public static SuperArray findOverLap(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray();
    removeDuplicates(a);
    removeDuplicates(b);
    for(int i = 0; i < a.size(); i++){
      for(int j = 0; j < b.size(); j++){
        if(a.get(i).equals(b.get(j))){
          result.add(b.get(j));
        }
      }
    }
    return result;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray small = new SuperArray();
    SuperArray large = new SuperArray();
    SuperArray combined = new SuperArray();
    if(a.size() <= b.size()){
      for(int i = 0; i < a.size(); i++){
        combined.add(a.get(i));
        combined.add(b.get(i));
      }
      if(a.size() != b.size()){
        for(int i = a.size(); i < b.size(); i++){
          combined.add(b.get(i));
        }
      }
    }
    else{
      for(int i = 0; i < b.size(); i++){
        combined.add(a.get(i));
        combined.add(b.get(i));
      }
      for(int i = b.size(); i < a.size(); i++){
        combined.add(a.get(i));
      }
    }
    return combined;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray overlaps = new SuperArray();
    overlaps.add("9");  overlaps.add("1");  overlaps.add("2");  overlaps.add("2");
    overlaps.add("3");  overlaps.add("4");
    SuperArray overlaps2 = new SuperArray();
    overlaps2.add("0"); overlaps2.add("4");  overlaps2.add("2");  overlaps2.add("2");
    overlaps2.add("9");
    System.out.println(findOverLap(overlaps,overlaps2));
    System.out.println(zip(overlaps,overlaps2));
  }
}
