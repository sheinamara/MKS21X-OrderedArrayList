import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  // CONSTRUCTORS
  public NoNullArrayList(){
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  // SET METHOD
  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot take null values!");
    }
    else{
      return super.set(index, element);
    }
  }

  // ADD METHODS
  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot take null values!");
    }
    else{
      return super.add(element);
    }
  }
  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot take null values!");
    }
    else{
      super.add(index, element);
    }
  }
}
