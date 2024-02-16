package Basic;

interface Fruit<T>
{
	 void tellTaste(T fruit);
}


class AnyFruit<T> implements Fruit<T>
{

	@Override
	public void tellTaste(T fruit) {

    String fruitname = fruit.getClass().getName();
     if(fruitname.equals("Orange"))
      System.out.println("Orange is sour");
     else if(fruitname.equals("Banana"))
	       System.out.println("Sweet");
        
	}
	
}

class Banana
{
	
}

class Orange
{
	
}
public class MyGeneric {

	public static void main(String[] args) {
		
		Banana b = new Banana();
		AnyFruit<Banana> an = new AnyFruit<>();
		an.tellTaste(b);
		Orange b1 = new Orange();
		AnyFruit<Orange> an1 = new AnyFruit<>();
		an1.tellTaste(b1);
	}

}
