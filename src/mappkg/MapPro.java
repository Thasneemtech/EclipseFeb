package mappkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> mp = new HashMap<String, String>();
		
		mp.put("key1","Hello");
		mp.put("key2", "Hai");
		mp.put("key3", "Good");
		mp.put("key4", "Java");
		
		System.out.println(mp.get("key1"));
		System.out.println(mp);
		
		Set mapset = mp.entrySet();
		
		Iterator iter = mapset.iterator();
		while(iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();   /* Type casting */
	                                                     /* for converting from one data to another ,that means converting from collection to Map*/
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		
					

	}

}
