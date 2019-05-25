package ca.sheridancollege.models;

public class SaveGradeDAO {
	public GradeItemModel insertData(String studentName, String grade, String gradeBookName) {
		HibernateUtility hUtility = new HibernateUtility();
		GradeItemModel tempGrade = new GradeItemModel();
		tempGrade.setStudentName(studentName);
		tempGrade.setGrade(Double.parseDouble(grade));
		tempGrade.setGradeBookName(gradeBookName);
		hUtility.getSession().save(new CreateGradeItemBean().getGradeItemBean(studentName, grade, gradeBookName));
		hUtility.commitTransaction();
		hUtility.closeSession();
		return tempGrade;
	}
}
