package ch9;

import java.util.ArrayList;

public class Outer {

	private ArrayList<String> arrayList = new ArrayList<String>();
	public void add(String s) {
		arrayList.add(s);
	}
	private class Im implements CanRun{

		@Override
		public void fight() {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}
	CanRun getIm(){
			Im im = new Im(); 
			return im;
		}
	class Inner{
		private int i=10;
		public Inner() {
			System.out.println("Size="+arrayList.size());
			// TODO Auto-generated constructor stub
		}
		
		public int getS() {
			return arrayList.size();
		}
	}
	
	Inner getInner(){
		Inner inner = new Inner();
		System.out.println(inner.i);
		return inner;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer uo = new Outer();
//		Outer.Inner inner  = uo.getInner();
//		uo.add("a");
//		System.out.println(inner.getS());
//		uo.new Inner();
		Outer.Im im = (Im) uo.getIm();
		
	}

}
