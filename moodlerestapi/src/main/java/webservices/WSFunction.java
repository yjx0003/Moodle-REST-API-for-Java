package webservices;

import java.util.Map;

public interface WSFunction {
	public WebServiceFunctions getWSFunction();
	public Map<String, String> getParameters();
	public Map<String, String> getParametesAfterClear();
}
