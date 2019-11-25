package core.course;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import webservices.Util;
import webservices.WSFunctionAbstract;
import webservices.WebServiceFunctions;

public class CoreCourseGetCategories extends WSFunctionAbstract {

	private String key;
	private Set<Integer> ids;
	private Boolean addSubcategories;

	public CoreCourseGetCategories() {
		super(WebServiceFunctions.CORE_COURSE_GET_CATEGORIES);
		key = "ids";
		ids = new HashSet<>();
	}

	public CoreCourseGetCategories(int... ids) {
		this();
		for (int id : ids) {
			this.ids.add(id);
		}
	}

	public CoreCourseGetCategories(Set<Integer> ids) {
		this();
		this.ids.addAll(ids);
	}

	public Boolean getAddSubcategories() {
		return addSubcategories;
	}

	public void setAddSubcategories(Boolean addSubcategories) {
		this.addSubcategories = addSubcategories;
	}

	@Override
	public Map<String, String> getParameters() {

		if (ids != null && !ids.isEmpty()) {
			String value = ids.stream()
					.map(String::valueOf)
					.collect(Collectors.joining(","));

			parameters.put("criteria[0][key]", key);
			parameters.put("criteria[0][value]", value);
		}

		Util.putIfNotNull(parameters, "addsubcategories", this.addSubcategories ? "1" : "0");

		return parameters;
	}

}
