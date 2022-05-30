package mythresh;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Contact {
	long Phonenumber;
	String Name;
	String Email;
	String Gender;

	public Contact(long Phonenumber, String name, String email, String gender) {
		super();
		this.Phonenumber = Phonenumber;
		this.Name = name;
		this.Email = email;
		this.Gender = gender;
	}

	@Override
	public String toString() {
		return Name + " " + Email + " " + Gender;
	}

}

public class Contacts {
	public static void main(String[] args) {
		TreeMap<Long, Contact> tmap = new TreeMap<Long, Contact>();
		Contact c = new Contact(562, "vijay", "vijay@gmail.com", "male");
		Contact c1 = new Contact(126, "ajay", "hey@gmail.com", "male");
		Contact c2 = new Contact(217, "azhar", "axkar@gmail.com", "male");
		Contact c3 = new Contact(414, "vineetha", "vin@gmail.com", "female");

		tmap.put((long) 562, c);
		tmap.put((long) 126, c1);
		tmap.put((long) 217, c2);
		tmap.put((long) 414, c3);

		Set keys = tmap.keySet();
		System.out.println("Keys :" + keys);

		Collection<Contact> values = tmap.values();
		System.out.println("Values :" + values);

		Set<Map.Entry<Long, Contact>> entries = tmap.entrySet();
		System.out.println(entries);
	}
}
