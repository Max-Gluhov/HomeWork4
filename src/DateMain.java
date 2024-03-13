
public class DateMain {

	public static void main(String[] args) {
		Date d1 = new Date(25, 5, 1995);
		Date d2 = new Date(7, 9, 2000);
		Date d3 = new Date(10, 8, 1966);
		Date d4 = new Date(30, 2, 1751);
		Date d5 = new Date(31, -2, 2060);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d1.calcAge());
		System.out.println(d2.calcAge());
		System.out.println(d3.calcAge());
		System.out.println(d4.calcAge());
		System.out.println(d5.calcAge());
	}

}
