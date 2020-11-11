public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[0];
  }

  public SuperArray(int initialCapacity){
    if(initialCapacity < 0){
      throw new IllegalArgumentException("Initial capacity " + initialCapacity + " cannot be negative");
    }
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
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " out of bounds of 0 - " + size());
    }
    return data[index];
  }

  public String set(int index, String element){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " out of bounds of 0 - " + size());
    }
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
    if(size() != 0){
      for(int i = 0; i < size()-1; i++){
        if(data[i] != null){
          newString += data[i];
          newString += ", ";
        }
      }
      if(data[size-1] != null){
        newString += data[size-1];
      }
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

  public void add(int index, String element){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " out of bounds of 0 - " + size());
    }
    resize();
    String temp = data[index];
    set(index, element);
    for(int i = index+1; i < size(); i++){
      String temp2 = data[i];
      data[i] = temp;
      temp = temp2;
    }
  }

  public String remove(int index){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " out of bounds of 0 - " + size());
    }
    String[] arr = new String [size()-1];
    String removed = data[index];
    for(int i = index; i < size()-1; i++){
      set(i, data[i+1]);
    }
    for(int i = 0; i < size()-1; i++){
      arr[i] = data[i];
    }
    data = arr;
    return removed;
  }

  public int indexOf(String s){
    int index = -1;
    for(int i = 0; i < size(); i++){
      if(data[i] != null && data[i].equals(s)){
        return i;
      }
    }
    return index;
  }

  public String[] toArray(){
    String[] newArray = new String [size()];
    for(int i = 0; i < size(); i++){
      newArray[i] = data[i];
    }
    return newArray;
  }

  public int lastIndexOf(String value){
    for(int i = size()-1; i >= 0; i--){
      if(data[i].equals(value)){
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other){
    boolean same = true;
    for(int i = 0; i < size(); i++){
      if(data[i] != other.get(i)){
        same = false;
      }
    }
    return same;
  }

}
