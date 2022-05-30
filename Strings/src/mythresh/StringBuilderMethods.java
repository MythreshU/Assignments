package mythresh;

public class StringBuilderMethods {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Application on StringBuffer class");
		sb.append(" method");
		System.out.println("After append: " + sb);
		sb.delete(34, 40);
		System.out.println("After Deleting: " + sb);
		System.out.println("Reverse: "+sb.reverse());
		sb.replace(0, 40, "Above some methods on StringBuffer class");
		System.out.println("After replace: " + sb);
	}
}
