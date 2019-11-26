package webservices;

import java.util.Map;

public interface WSFunction {
	public WSFunctionEnum getWSFunction();
	public void addToMapParemeters();
	public Map<String, String> getParameters();
	public void clearParameters();
}
