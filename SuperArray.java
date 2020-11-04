public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[0];
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
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
    data = new String[size()+1];
    for(int i = 0; i < size ; i++){
      data[i] = temp[i];
    }
  }

  public boolean isEmpty(){
    return size() == 0;
  }

  public void clear(){
    for(int i = 0; i < size(); i++){
      data[i] = null;
    }
  }

  public String toString(){
    String newString = "[";
    for(int i = 0; i < size()-1; i++){
      if(data[i] != null){
        newString += data[i];
        newString += ", ";
      }
    }
    if(data[size-1] != null){
      newString += data[size-1];
    }
    newString += "]";
    return newString;
  }

  public boolean contains(String s){
    for(int i = 0; i < size(); i++){
      if(data[i].equals(s)){
        return true;
      }
    }
    return false;
  }


}
