package Basic;

class Demo2
{
	static <T>void getArray(T[] arr){
		for(T i:arr)
		{
			System.out.println(i);
		}
	}
}
public class MyGenericMethod {

	public static void main(String[] args) {

Integer arr[]= {2,3,5,9,5};
       Demo2.getArray(arr);

       Double arr1[] = {1.1,2.3,4.5,6.7};
       Demo2.getArray(arr1);
	}

}
