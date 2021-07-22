import dao.ProjectDao;
import dao.StudentDao;
import entity.Student;
import entity.projects.Project;
import entity.projects.ProjectStatus;

import java.util.List;


public class App {
    public static void main(String[] args) {
        ProjectDao projectDao = new ProjectDao();
        Project project = new Project();
        project.setProjectName("TPO");
        project.setProjectStatus(ProjectStatus.INPROGESS);
        projectDao.saveProject(project);

        List<Project> projects = projectDao.getProjects();
        projects.forEach(s -> {
            System.out.println(s.getProjectName());
            System.out.println(s.getProjectStatus());
        });
    }
}
