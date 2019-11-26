package es.ubu.lsi.moodlerestapi.mod.quiz;

import java.util.Set;

import es.ubu.lsi.moodlerestapi.webservices.Util;
import es.ubu.lsi.moodlerestapi.webservices.WSFunctionAbstract;
import es.ubu.lsi.moodlerestapi.webservices.WSFunctionEnum;

public class ModQuizGetQuizzesByCourses extends WSFunctionAbstract{

	private Set<Integer> courseids;

	public ModQuizGetQuizzesByCourses(Set<Integer> courseids) {
		super(WSFunctionEnum.MOD_QUIZ_GET_QUIZZES_BY_COURSES);
		this.courseids = courseids;
	}
	
	@Override
	public void addToMapParemeters() {
		Util.putIfNotNull(parameters, "courseids", courseids);
	}
	

	
	
}
