package mod.quiz;

import java.util.Set;

import webservices.Util;
import webservices.WSFunctionAbstract;
import webservices.WSFunctionEnum;

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
