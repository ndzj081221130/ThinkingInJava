package ch15;

public class Holder <T>{

	private T _value;
	public Holder(){
		
	}
	
	public Holder(T a){
		_value = a;
	}
	
	public void set(T val) {
		_value = val;
	}
	
	public T get(){
		return _value;
	}
	
	public boolean equals(Object obj) {
		return _value.equals(obj);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holder<Mocha> apples = new Holder<Mocha>();
		Mocha d = new Mocha();
		apples.set(d);
		Holder<? extends Coffee> fruit = apples;
		Coffee pCoffee = fruit.get();
		d = (Mocha) fruit.get();
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		fruit.set(new Coffee());
		System.out.println(fruit.equals(d));
	}

}
