package ch17;

public class TestParam {

	public final int _size;
	public final int _loops;
	public TestParam(int size,int loops){
		this._size = size;
		this._loops = loops;
	}
	
	public static TestParam[] array(int ... values){
		int size = values.length/2;
		TestParam[] resultParams = new TestParam[size];
		int n=0;
		for (int i = 0; i < resultParams.length; i++) {
			resultParams[i] = new TestParam(values[n++], values[n++]);
		}
		return resultParams;
	}
	
	public static TestParam[] array(String[] values){
		int []vals = new int[values.length];
		
		for (int i = 0; i < vals.length; i++) {
			vals[i] = Integer.decode(values[i]);
		}
		
		return array(vals);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
