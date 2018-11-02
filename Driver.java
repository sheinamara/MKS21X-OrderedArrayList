public class Driver{
  public static void main(String[] args){
    // ACTUALLY MAKING THE ARRAY LISTS
    System.out.println("First thing's first: No Nulls!");

    NoNullArrayList<String> fruity = new NoNullArrayList<String>(20);
    fruity.add("apples");
    fruity.add("bananas");
    fruity.add("watermelon");
    fruity.add("mangoes");
    System.out.println(fruity.toString());

    NoNullArrayList<String> veggie = new NoNullArrayList<String>(20);
    veggie.add("cucumbers");
    veggie.add("carrots");
    veggie.add("spinach");
    veggie.add("bok choy");
//    veggie.add(null); UNCOMMENT WHEN YOU WANT TO TEST NULL CASES THIS SHOULD THROW BACK
    System.out.println(veggie.toString());



  }
}
