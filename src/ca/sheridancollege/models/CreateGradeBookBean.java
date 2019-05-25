package ca.sheridancollege.models;

public class CreateGradeBookBean {
	public GradeBookModel getGradeBookBean(String gradeBookName, String semester){
		GradeBookModel s1 = new GradeBookModel();
		s1.setGradeBookName(gradeBookName);
		s1.setSemester(semester);
		return s1;
	}
}
