package webservices;

import java.io.IOException;
import java.util.Map;

import org.json.JSONObject;
import org.jsoup.Jsoup;

public class WebService {

	private static String moodleWSRestFormat = "json";
	private static String host;
	private static String token;

	private WebService() {
		throw new UnsupportedOperationException();
	}

	public static void initialize(String host, String username, String password) throws IOException {
		WebService.host = host;
		String url = host + "/login/token.php";
		String response;
		try {
			response = Jsoup.connect(url)
					.ignoreContentType(true)
					.data("username", username,
							"password", password,
							"service", WSFunctionEnum.MOODLE_MOBILE_APP.toString())
					.execute()
					.body();

		} catch (IOException e) {
			throw new IOException("Cannot connect to the host: " + host);
		}

		JSONObject jsonObject = new JSONObject(response);
		if (jsonObject.has("error")) {
			throw new IllegalStateException(jsonObject.getString("error"));
		}
		initialize(jsonObject.getString("token"));
	}

	public static void initialize(String token) {
		WebService.token = token;
	}

	public static String getHost() {
		return host;
	}

	public static void setHost(String host) {
		WebService.host = host;
	}

	public static String getToken() {
		return token;
	}

	public static void setToken(String token) {
		WebService.token = token;
	}

	public static String getmoodleWSRestFormat() {
		return moodleWSRestFormat;
	}

	public static void setmoodleWSRestFormat(String moodleWSRestFormat) {
		WebService.moodleWSRestFormat = moodleWSRestFormat;
	}

	public static String getResponse(WSFunctionEnum wsFunction, Map<String, String> parameters)
			throws IOException {
		String url = host + "/webservice/rest/server.php";
		return Jsoup.connect(url)
				.ignoreContentType(true)
				.data("wsfunction", wsFunction.toString(),
						"moodlewsrestformat", moodleWSRestFormat,
						"wstoken", token)
				.data(parameters)
				.maxBodySize(0)
				.timeout(0)
				.execute()
				.body();
	}

	public static String getResponse(WSFunction wsFunction) throws IOException {
		wsFunction.clearParameters();
		wsFunction.addToMapParemeters();
		return getResponse(wsFunction.getWSFunction(), wsFunction.getParameters());
	}
}
