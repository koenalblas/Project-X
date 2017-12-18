package projectX;

import java.time.format.DateTimeFormatter;

// - userId: string
// - projectName: String
// - startDate: date
// - endDate: date
// - description: String
// + addProject
// + delProject
// + cusProject
// + getUserid

public class ProjectInfo extends ProjectManager {

	private int projectID;
	private String userID;
	private String projectName;
	private DateTimeFormatter startDate;
	private DateTimeFormatter endDate;
	private String description;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public DateTimeFormatter getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTimeFormatter startDate) {
		this.startDate = startDate;
	}

	public DateTimeFormatter getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTimeFormatter endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ProjectInfo(int projectID, String userID, String projectName, String description) {
		this.projectID = projectID;
		this.userID = userID;
		this.projectName = projectName;
		this.description = description;
	}
}
