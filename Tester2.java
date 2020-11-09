public class Tester2{

  public static void main(String[] args){
    SuperArray test = new SuperArray();
    System.out.println(test.size());
    System.out.println(test.isEmpty());
    test.add("one");
    test.add("two");
    test.add("three");
    test.add("four");
    test.add("test");
    SuperArray other = new SuperArray();
    other.add("one");
    other.add("two");
    other.add("three");
    other.add("four");
    other.add("test");
    System.out.println(test.equals(other));
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
    System.out.println(test.lastIndexOf("test"));
  }
}
