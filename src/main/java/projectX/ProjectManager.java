package projectX;

import projectX.Interface.ProjectInfoPI;
import projectX.dao.ProjectInfoDAO;
import projectX.dao.UserDAO;

//userId: string
//-       status: String
//+ getLogin
//+ getStatus
//+ getUser
//+ getAgenda
//+ getProject

public class ProjectManager {

	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public static void main(String[] args) {
		for (ProjectInfo id : ProjectInfoDAO.getAllProjects()) {
			System.out.println("Project van " + id.getUserID() + " is : " + id.getProjectName());
			System.out.println("Omschrijving: " + id.getDescription());
			System.out.println("");
		}
		
		try {
			System.out.print(UserDAO.findUser("papi").getLastName());
		} catch (NullPointerException e) {
			System.out.println("User Not Found");
		}
		
	}

}
