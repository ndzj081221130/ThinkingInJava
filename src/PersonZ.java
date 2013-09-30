

import java.io.Serializable;
 
 
public class PersonZ implements Serializable {

	private int id;
	private String name="abc";
	private int age=100;
	private human h = new human();
	private man m = new man();
	public static void main(String[]args){
		PersonZ person=new PersonZ();
		
	}
	public PersonZ() {
		// TODO Auto-generated constructor stub
		System.out.println("person");
	}
	
	private  xman x = new xman();
	public PersonZ(String name,int age){
		this.age=age;
		this.name=name;
	} 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
	
	class human {
		public human() {
			// TODO Auto-generated constructor stub
			System.out.println("human");
			
		}
	}
	
	class man {
		public man() {
			// TODO Auto-generated constructor stub
			System.out.println("man");
			
		}
	}
	
	class xman {
		public xman() {
			// TODO Auto-generated constructor stub
			System.out.println("xman");
			
		}
	}
}
