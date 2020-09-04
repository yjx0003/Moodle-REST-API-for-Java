package es.ubu.lsi.moodlerestapi.webservice.webservices;

import org.json.JSONObject;

public interface WSFunction {
	public WSFunctionEnum getWSFunction();
	public void addToMapParemeters();
	public JSONObject getParameters();
}
