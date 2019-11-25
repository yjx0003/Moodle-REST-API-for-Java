package webservices;

public enum WebServiceFunctions {
	
	/**
	 * Get categories.
	 */
	CORE_COURSE_GET_CATEGORIES,
	
	/**
	 * Get course content (modules + web service file urls).
	 */
	CORE_COURSE_GET_CONTENTS,
	
	/**
	 * Get enrolled users by course id.
	 */
	CORE_ENROL_GET_ENROLLED_USERS,
	
	/**
	 * Get list of course ids that a user is enrolled in (if you are allowed to see that).
	 */
	CORE_ENROL_GET_USERS_COURSES,
	
	/**
	 * Retrieve users information for a specified unique field - If you want to do a user search, use core_user_get_users().
	 */
	CORE_USER_GET_USERS_BY_FIELD,
	
	/**
	 * Returns the complete list of grade items for users in a course.
	 */
	GRADEREPORT_USER_GET_GRADE_ITEMS,
	
	/**
	 * Get the user/s report grades table for a course. 
	 */
	GRADEREPORT_USER_GET_GRADES_TABLE,
	
	/**
	 * Returns the courses and assignments for the users capability.
	 */
	MOD_ASSIGN_GET_ASSIGNMENTS,
	
	/**
	 * Return information of a given lesson. 
	 */
	MOD_LESSON_GET_LESSON,
	
	/**
	 * Returns a list of quizzes in a provided list of courses, if no list is provided all quizzes that the user can view will be returned. 
	 */
	MOD_QUIZ_GET_QUIZZES_BY_COURSES,
	
	/**
	 * Return the user token.
	 */
	MOODLE_MOBILE_APP;
}
