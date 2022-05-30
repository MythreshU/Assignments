package mythresh;

public class StringBufferInsert {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("It is used to at the specified index called");
		sb.insert(17,"insert text ");
		System.out.println(sb);
	}
}
