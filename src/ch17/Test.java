package ch17;

public abstract class Test<C> {

	String name;
	public Test(String name){
		this.name = name;
	}
	
	abstract int test(C container,TestParam tp);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
