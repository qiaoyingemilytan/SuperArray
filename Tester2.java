public class Tester2{

  public static void main(String[] args){
    SuperArray test = new SuperArray();
    System.out.println(test.size());
    System.out.println(test.isEmpty());
    test.add("one");
    test.add("two");
    test.add("three");
    test.add("four");
    System.out.println(test.isEmpty());
    System.out.println(test.toString());
    System.out.println(test.size());
    System.out.println(test.set(2,"test"));
    System.out.println(test.toString());
    System.out.println(test.contains("one"));
    System.out.println(test.contains("no"));
    test.add(1, "added");
    System.out.println(test.toString());
    System.out.println(test.remove(1));
    System.out.println(test.toString());
    System.out.println(test.indexOf("test"));
    System.out.println(test.indexOf("no"));
    System.out.println(test.toArray());
  }
}
