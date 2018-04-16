package test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class commonSubstring {
	static int commonSubstring(int[] numbers) {
		Map map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.get(numbers[i]) == null) {
				map.put(numbers[i], 1);
			} else {
				int num = (int) map.get(numbers[i]);
				map.put(numbers[i], num + 1);
			}
		}
		int count =0;
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
		for (Map.Entry<Integer, Integer> mapp : list) {
			if(mapp.getValue()!=1) {
				count++;
			}
		}
		return count;
	}
}
