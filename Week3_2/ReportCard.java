package Week3_2;

public class ReportCard {
	private Subject subject;
	private Student student;
	private Teacher teacher;
	private double grade;
	private int semester;

	private Exam[] examList;

	public ReportCard() {
	}

	public ReportCard(Exam[] examList, int semester) {
		super();
		this.semester = semester;
		this.examList = examList;
	}

	public ReportCard(Subject subject, double grade) {
		super();
		this.subject = subject;
		this.grade = grade;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Exam[] getExamList() {
		return examList;
	}

	public void setExamList(Exam[] examList) {
		this.examList = examList;
	}

	@Override
	public String toString() {
		return "ReportCard [subject=" + subject.getName() + ", grade=" + grade + "]";
	}

	// public double getGradefromExamList (List<Exam> examList, String type, )
}
