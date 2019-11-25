package webservices;

import java.util.Map;

public abstract class WSFunctionAbstract implements WSFunction {
	private WebServiceFunctions webserviceFunctions;
	protected Map<String, String> parameters;
	
	public WSFunctionAbstract(WebServiceFunctions webserviceFunctions) {
		this.webserviceFunctions = webserviceFunctions;
	}
	
	@Override
	public WebServiceFunctions getWSFunction() {
		return webserviceFunctions;
	}
	
	@Override
	public Map<String, String> getParametesAfterClear(){
		parameters.clear();
		return getParameters();
	}
	
}
