import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class w2 {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int array[] = {1, 1, 2, 2, 4, 4, 4, 4,4, 5, 5, 6, 6};

			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

			for (int i = 0; i < array.length; i++) {
				if (map.containsKey(array[i])) {
					int temp = map.get(array[i]);

					map.put(array[i], temp + 1);
				} else {
					map.put(array[i], 1);
				}
			}

			Collection<Integer> count = map.values();

			int maxCount = Collections.max(count);

			int maxNumber = 0;

			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if (maxCount == entry.getValue()) {
					maxNumber = entry.getKey();
				}
			}

			System.out.println( maxNumber);
			System.out.println(  maxCount );	      

	}

	 
	

}
