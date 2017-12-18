package projectX.Interface;
import java.util.List;

import projectX.ProjectInfo;

public interface ProjectInfoPI {

	
		public List<ProjectInfo> getAllProjects();
		public ProjectInfoPI getProject(int projectID);
		public void updateProject(ProjectInfo projectInformatie);
		public void deleteProject(ProjectInfo projectInformatie);
	
}
