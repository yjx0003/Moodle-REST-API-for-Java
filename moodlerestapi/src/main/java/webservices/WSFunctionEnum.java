package webservices;

import java.util.HashMap;
import java.util.Map;

public enum WSFunctionEnum {

	/**
	 * Get calendar events.
	 */
	CORE_CALENDAR_GET_CALENDAR_EVENTS("core_calendar_get_calendar_events", "2.5"),
	
	/**
	 * Get categories.
	 */
	CORE_COURSE_GET_CATEGORIES("core_course_get_categories", "2.3"),

	/**
	 * Get course content (modules + web service file urls).
	 */
	CORE_COURSE_GET_CONTENTS("core_course_get_contents", "2.2"),
	
	/**
	 * List of courses a user has accessed most recently.
	 */
	CORE_COURSE_GET_RECENT_COURSES("core_course_get_recent_courses", "3.6"),

	/**
	 * Get enrolled users by course id.
	 */
	CORE_ENROL_GET_ENROLLED_USERS("core_enrol_get_enrolled_users", "2.1"),

	/**
	 * Get list of course ids that a user is enrolled in (if you are allowed to see
	 * that).
	 */
	CORE_ENROL_GET_USERS_COURSES("core_enrol_get_users_courses", "2.0"),

	/**
	 * Retrieve users information for a specified unique field - If you want to do a
	 * user search, use core_user_get_users().
	 */
	CORE_USER_GET_USERS_BY_FIELD("core_user_get_users_by_field", "2.5"),

	/**
	 * Returns the complete list of grade items for users in a course.
	 */
	GRADEREPORT_USER_GET_GRADE_ITEMS("gradereport_user_get_grade_items", "3.2"),

	/**
	 * Get the user/s report grades table for a course.
	 */
	GRADEREPORT_USER_GET_GRADES_TABLE("gradereport_user_get_grades_table", "2.9"),

	/**
	 * Returns the courses and assignments for the users capability.
	 */
	MOD_ASSIGN_GET_ASSIGNMENTS("mod_assign_get_assignments", "2.4"),

	/**
	 * Return information of a given lesson.
	 */
	MOD_LESSON_GET_LESSONS_BY_COURSES("mod_lesson_get_lessons_by_courses", "3.3"),

	/**
	 * Returns a list of quizzes in a provided list of courses, if no list is
	 * provided all quizzes that the user can view will be returned.
	 */
	MOD_QUIZ_GET_QUIZZES_BY_COURSES("mod_quiz_get_quizzes_by_courses", "3.1"),

	/**
	 * Return the user token.
	 */
	MOODLE_MOBILE_APP("moodle_mobile_app", "2.0");

	private static Map<String, WSFunctionEnum> map = new HashMap<>();

	static {
		for (WSFunctionEnum value : WSFunctionEnum.values()) {
			map.put(value.name, value);
		}
	}

	private String name;
	private String introducedIn;

	private WSFunctionEnum(String name, String introducedIn) {
		this.name = name;
		this.introducedIn = introducedIn;
	}

	public WSFunctionEnum get(String name) {
		if (map.containsKey(name))
			return map.get(name);
		throw new IllegalArgumentException(name + " web service function not avaible.");
	}
	
	public String getIntroducedIn() {
		return introducedIn;
	}

	@Override
	public String toString() {
		return name;
	}
}
