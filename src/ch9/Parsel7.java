package ch9;

public class Parsel7 {
	private int x = 100;
	public Contents getContents(final int arg) {
		return new Contents( ){

			private int myX = arg;
			@Override
			public int value() {
				// TODO Auto-generated method stub
				int a = x+arg;
				System.out.println(myX);
				return 10;
			}
			
		};
	}
	
	public static void main(String[]args){
		new Parsel7().getContents(5).value();
	}
}
