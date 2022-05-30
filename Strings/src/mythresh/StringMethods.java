package mythresh;

public class StringMethods {
	public static void main(String[] args) {
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		String replaceString = str.replace('a', '$');
		System.out.println(replaceString);
		String check = "collection";
		boolean value = str.contains(check);
		if(value)
			System.out.println("String found: "+ check);
		else
			System.out.println("String not found!");
		String str2 = "java string pool refers to collection of strings which are stored in heap memory";
		System.out.println("Comparing : " + str.equals(str2));
		System.out.println("Comparing by ignoring Lower&Upper : " + str.equalsIgnoreCase(str2));
		
	}
}
