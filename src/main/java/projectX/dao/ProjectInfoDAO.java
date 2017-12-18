package projectX.dao;

import java.util.ArrayList;
import java.util.List;

import projectX.ProjectInfo;


public class ProjectInfoDAO {

	private static final List<ProjectInfo> projectInformatie = new ArrayList<>();

	static {
		projectInformatie.add(new ProjectInfo(1, "Henk", "Verover de maan", "Stappenplan voor het overnemen van de bekende hemellichaam"));
		projectInformatie.add(new ProjectInfo(2, "Piet", "Eet alle kaas", "Er mag hierna geen kaas meer overblijven"));
		projectInformatie.add(new ProjectInfo(3, "Klaas", "Git++", "Leuker kunnen we het niet maken, wel ingewikkelder"));
	}
	
	public static List<ProjectInfo> getAllProjects() {
		return projectInformatie;
	}
	
	public static ProjectInfo getProjectInfo(int projectID) {
		return projectInformatie.get(projectID);
	}
	
//	public void deleteProject(ProjectInfo projectInformatie) {
//		projectInformatie.remove(projectInformatie.get(projectID));
//	}


}
