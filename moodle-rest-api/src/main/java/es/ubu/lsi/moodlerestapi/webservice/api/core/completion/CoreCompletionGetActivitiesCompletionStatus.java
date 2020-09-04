package es.ubu.lsi.moodlerestapi.webservice.api.core.completion;

import es.ubu.lsi.moodlerestapi.webservice.webservices.WSFunctionAbstract;
import es.ubu.lsi.moodlerestapi.webservice.webservices.WSFunctionEnum;

public class CoreCompletionGetActivitiesCompletionStatus extends WSFunctionAbstract {

	public CoreCompletionGetActivitiesCompletionStatus(int courseid, int userid) {
		super(WSFunctionEnum.CORE_COMPLETION_GET_ACTIVITIES_COMPLETION_STATUS);
		setUserid(userid);
		setCourseid(courseid);
	}

	public void setUserid(int userid) {
		parameters.put("userid", userid);
	}

	public void setCourseid(int courseid) {
		parameters.put("courseid", courseid);
	}

}
