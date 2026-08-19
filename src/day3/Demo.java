package day3;

public class Demo {
	public static void main(String[] args) {
		
		try {
			int[] a = {10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception handeled");
		}
		System.out.println("Hello sir");
	}
}
