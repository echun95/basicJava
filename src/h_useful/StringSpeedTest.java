package h_useful;

public class StringSpeedTest {

	public static void main(String[] args) {
		
		/*String str = "a";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			str += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start+ "ms");
		*/
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 200000; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start+ "ms");
	
	
	}
}
