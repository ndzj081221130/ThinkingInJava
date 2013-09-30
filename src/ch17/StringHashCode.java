package ch17;

public class StringHashCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="hello";
		String b = "hello";
		Integer c = 91;
		Boolean fBoolean = false;
		System.out.println(a.hashCode());
		
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(fBoolean.hashCode());
	}

}
