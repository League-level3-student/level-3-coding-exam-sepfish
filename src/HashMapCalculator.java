import java.util.HashMap;

public class HashMapCalculator {
	int commonKeyValuePairs(HashMap<String, String> h1, HashMap<String, String> h2) {
		int common = 0;
		String[] keys = h1.keySet().toArray(new String[h1.size()]);
		for (int i = 0; i < h1.size(); i++) {
			for (int j = 0; j < h2.size(); j++) {
				if (h2.containsKey(keys[i]) && h2.get(keys[i]) == h1.get(keys[i])) {
					common++;
					break;
				}
			}
		}
		return common;
	}
}
