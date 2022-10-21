package Week3_2;

public class Exam {
	private int id;
	private String type;
	private double grade;
	private Subject subject;
	private int semester;

	public Exam() {

	}

	public Exam(int id, String type, double grade, Subject subject, int semester) {
		super();
		this.id = id;
		this.type = type;
		this.grade = grade;
		this.subject = subject;
		this.semester = semester;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", type=" + type + ", grade=" + grade + ", subject=" + subject.getName() + "]";
	}

	public double getGradeBySubjectAndType(Exam[] currentExamList, Subject subject, String string) {
		// for (int)
		return 0;
	}

}
