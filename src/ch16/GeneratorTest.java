package ch16;import ch15.Generator;public class GeneratorTest {	public static int size = 10;	public static void test(Class<?> surroundingClass) {		for (Class<?> type : surroundingClass.getClasses()) {			System.out.print(type.getSimpleName() + " : ");			try {				Generator<?> generator = (Generator<?>) type.newInstance();				for (int i = 0; i < size; i++) {					System.out.print(generator.next() + " ");				}				System.out.println();			} catch (Exception e) {				// TODO: handle exception				throw new RuntimeException(e);// et			}		}	}	/**	 * @param args	 */	public static void main(String[] args) {		// TODO Auto-generated method stub		test(CountingGenerator.class);	}}