package es.ubu.lsi.moodlerestapi.webservice.api.gradereport;

import es.ubu.lsi.moodlerestapi.webservice.webservices.WSFunctionEnum;

/**
 * Returns the complete list of grade items for users in a course.
 * 
 * @author Yi Peng Ji
 *
 */
public class GradereportUserGetGradeItems extends GradereportUserGetGradesTable {

	public GradereportUserGetGradeItems(int courseid) {
		super(WSFunctionEnum.GRADEREPORT_USER_GET_GRADE_ITEMS, courseid);
	}

}
