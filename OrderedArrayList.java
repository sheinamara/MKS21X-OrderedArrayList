public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  // CONSTRUCTORS
  public OrderedArrayList(){
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  // SET METHOD
  public T set(int index, T element){
    remove(index);
    add(index, element);
    return element;
  }

  // ADD METHODS
  public boolean add(T element){
    for (int i = 0; i < this.size(); i++){
      if ((this.get(i)).compareTo(element) > 0){
        super.add(i, element);
        return true;
      }
    }
    return false;
  }
}
