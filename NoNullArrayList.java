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
      throw new IllegalArgumentException("We can't have null values dummy!");
    }
    if (index > this.size() - 1){
      throw new IndexOutOfBoundsException("Are you SURE we can have that index?");
    }
    else{
      return super.set(index, element);
    }
  }

  // ADD METHODS
  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("We can't have null values dummy!");
    }
    else{
      return super.add(element);
    }
  }
  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("We can't have null values dummy!");
    }
    if (index > this.size() - 1){
      throw new IndexOutOfBoundsException("Are you SURE we can have that index?");
    }
    else{
      super.add(index, element);
    }
  }
}
