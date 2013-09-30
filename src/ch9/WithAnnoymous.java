package ch9;

public class WithAnnoymous {

	public WithArgConstruct getWithArgConstruct = new WithArgConstruct(5){
		private int aaa;
		public int get_label(){
//			return 1;
			return super.get_label()+1;
		}
		public int getAaa() {
			return aaa;
		}
		public void setAaa(int aaa) {
			this.aaa = aaa;
		}
	};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new WithAnnoymous().getWithArgConstruct.get_label());
	}

}
