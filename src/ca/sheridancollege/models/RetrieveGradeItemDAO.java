package ca.sheridancollege.models;

import java.util.List;

public class RetrieveGradeItemDAO {
	public List<GradeItemModel> getAllGrades(String gradeBookName) {
		HibernateUtility hUtility = new HibernateUtility();
		@SuppressWarnings("unchecked")
		//List<GradeItemModel> tempStudents = (List<GradeItemModel>)hUtility.getSession().createQuery("from GradeItem i ").list();
		List<GradeItemModel> tempStudents = (List<GradeItemModel>)hUtility.getSession().createQuery("from GradeItemModel s where s.gradeBookName = '" + gradeBookName + "'").list();
		hUtility.commitTransaction();
		hUtility.closeSession();
		return tempStudents;
	}
}
