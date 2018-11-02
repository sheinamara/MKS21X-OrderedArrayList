public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  // CONSTRUCTORS
  public OrderedArrayList(){
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  // SET METHOD
  public T set(int index, T element){
    T whatToReturn = this.get(index);
    remove(index);
    add(element);
    return whatToReturn;
  }

  // ADD METHODS
  public boolean add(T element){
    for (int i = 0; i < this.size(); i++){
      if ((this.get(i)).compareTo(element) > 0){
        super.add(i, element);
        return true;
      }
    }
    return super.add(element);
  }
  public void add(int index, T element){
    add(element);
  }
}
