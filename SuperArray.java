public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[0];
  }

  public int size(){
    size = data.length;
    return size;
  }

  public boolean add(String element){
    String[] temp = new String [size()];
    for(int i = 0; i < size; i++){
      temp[i]=data[i];
    }
    data = new String[size()+1];
    for(int i = 0; i < size ; i++){
      data[i] = temp[i];
    }
    data[size] = element;
    return true;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String temp = data[index];
    data[index] = element;
    return temp;
  }

  private void resize(){
    String[] temp = data;
    data = new String[size+1];
    for(int i = 0; i < size ; i++){
      data[i] = temp[i];
    }
  }

}
