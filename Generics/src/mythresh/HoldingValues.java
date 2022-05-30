package mythresh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HoldingValues {
	public static void main(String[] args) {
		HashMap<Integer,Double> hmap = new HashMap<Integer,Double>();
		hmap.put(1,25.2);
		hmap.put(2,23.20);
		hmap.put(3,25.27);
		hmap.put(4,253.2);
		hmap.put(5,30.03);
		hmap.put(6,1.245);
		hmap.put(7,8.2);
		hmap.put(8,99.99);
		hmap.put(9,100.00);
		hmap.put(10,50.00);
		Set set = hmap.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry rec = (Map.Entry)i.next();
			System.out.println(rec.getKey()+":"+rec.getValue());
		}
	}
}
