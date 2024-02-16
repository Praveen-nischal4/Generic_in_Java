package Basic;

class Myclass<T>
{
	T obj;
	
	Myclass(T obj)
	{
		this.obj=obj;
	}
	
	T getObj()
	{
		return obj;
	}
}
public class Demo {

	public static void main(String[] args) {
	
		Integer i=14;
		Myclass<Integer> my = new Myclass<>(i);
		System.out.println(my.obj);
		
		Myclass<String> my1 = new Myclass<>("Raj Kumar");
		System.out.println(my1.obj);
	}

}
