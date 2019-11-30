package es.ubu.lsi.moodlerestapi.api.core.course;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import es.ubu.lsi.moodlerestapi.webservices.Util;
import es.ubu.lsi.moodlerestapi.webservices.WSFunctionAbstract;
import es.ubu.lsi.moodlerestapi.webservices.WSFunctionEnum;

public class CoreCourseGetCategories extends WSFunctionAbstract {

	private String key;
	private Set<Integer> ids;
	private Boolean addSubcategories;

	public CoreCourseGetCategories(Set<Integer> ids) {
		super(WSFunctionEnum.CORE_COURSE_GET_CATEGORIES);
		key = "ids";
		this.ids = ids;
	}

	public CoreCourseGetCategories() {
		this(new HashSet<>());
	}

	public CoreCourseGetCategories(Integer... ids) {
		this(new HashSet<>(Arrays.asList(ids)));
	}

	public Boolean getAddSubcategories() {
		return addSubcategories;
	}

	public void setAddSubcategories(Boolean addSubcategories) {
		this.addSubcategories = addSubcategories;
	}

	@Override
	public void addToMapParemeters() {

		if (ids != null && !ids.isEmpty()) {
			String value = ids.stream()
					.map(String::valueOf)
					.collect(Collectors.joining(","));

			parameters.put("criteria[0][key]", key);
			parameters.put("criteria[0][value]", value);
		}

		Util.putIfNotNull(parameters, "addsubcategories", Util.booleanToBinary(addSubcategories));

	}

}
