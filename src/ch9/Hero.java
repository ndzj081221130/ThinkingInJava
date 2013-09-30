package ch9;

public class Hero extends ActionCharacter implements CanFight{
	public static void main(String[]args){
//		new Hero().fight();
		Outer.Inner inner = new Outer().new Inner();
	}
}
