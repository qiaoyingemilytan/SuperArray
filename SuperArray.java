public class SuperArray{
  private String [] data;
  private int size;

  public SuperArray(){};

  public int size(){
    size = data.length;
    return size;
  }

  public boolean add(String element){
    String [] temp = data;
    data = new String[size+1];
    for(int i = 0; i < size ; i++){
      data[i] = temp[i];
    }
    data[size] = element;
    return true;
  }

}
