package ch14;import java.util.List;public interface Robot {	String name();	String model();	List<Operation> operations();		class Test{		public static void test(Robot r){			if (r instanceof Null) {				System.out.println("null robot");			}else{				for(Operation operation : r.operations()){					operation.command();				}			}		}	}}