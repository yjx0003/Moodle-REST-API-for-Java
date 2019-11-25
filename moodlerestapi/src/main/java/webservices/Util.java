package webservices;

import java.util.Map;
import java.util.Map.Entry;

public class Util {

	private Util() {
		throw new UnsupportedOperationException();
	}

	public static void putIfNotNull(Map<String, String> parameters, String key, Object value) {
		if (value != null)
			parameters.put(key, value.toString());
	}

	public static void putIfNotNull(Map<String, String> parameters, String arrayName, String keyName,
			String valueName, Map<String, Object> map) {

		int index = 0;
		for (Entry<String, Object> entry : map.entrySet()) {
			String keyValue = entry.getKey();
			String value = entry.getValue().toString();
			if (value != null) {
				parameters.put(arrayName + "[" + index + "][" + keyName + "]", keyValue);
				parameters.put(arrayName + "[" + index + "][" + valueName + "]", value);
				index++;
			}
		}
	}
}
