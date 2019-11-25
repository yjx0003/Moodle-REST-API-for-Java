package core.enrol;

import java.util.Map;

import webservices.WSFunctionAbstract;
import webservices.WebServiceFunctions;

public class CoreEnrolGetUsersCourses extends WSFunctionAbstract {

	/**
	 * user id (required)
	 */
	Integer userid;
	/**
	 * Include count of enrolled users for each course? This can add several seconds
	 * to the response time if a user is on several large courses, so set this to
	 * false if the value will not be used to improve performance.
	 */
	Integer returnusercount;

	public CoreEnrolGetUsersCourses(Integer userid) {
		super(WebServiceFunctions.CORE_ENROL_GET_USERS_COURSES);
		this.userid = userid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getReturnusercount() {
		return returnusercount;
	}

	public void setReturnusercount(Integer returnusercount) {
		this.returnusercount = returnusercount;
	}

	@Override
	public Map<String, String> getParameters() {
		return null;
	}

}
