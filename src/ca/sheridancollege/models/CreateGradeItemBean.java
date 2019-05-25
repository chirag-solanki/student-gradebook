package ca.sheridancollege.models;

public class CreateGradeItemBean {
	public GradeItemModel getGradeItemBean(String studentName, String grade, String gradeBookName){
		GradeItemModel s1 = new GradeItemModel();
		s1.setStudentName(studentName);
		s1.setGrade(Double.parseDouble(grade));
		s1.setGradeBookName(gradeBookName);
		return s1;
	}
}
