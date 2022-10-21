package Week3_2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Student {

	private int id;
	private String name;
	private Date dob;
	private String address;
	private String phoneNumber;

	private Teacher teacher;
	private Classroom classroom;
	private Subject subject;
	private ReportCard reportCard;

	private Exam[] examList;

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student name: " + name + ", Primary teacher: " + classroom.getTeacher().getName() + ", Class: "
				+ classroom.getRoomNumber();
	}

	public double getAverageSemester(ReportCard[] reportCardSemester1) {
		double total = 0;
		double average = 0;
		for (int i = 0; i < reportCardSemester1.length; i++) {
			if (reportCardSemester1[i].getSubject().getName().equals("Math")
					|| reportCardSemester1[i].getSubject().getName().equals("Literature")
					|| reportCardSemester1[i].getSubject().getName().equals("English")) {
				total = total + reportCardSemester1[i].getGrade() * 2;
			} else {
				total = total + reportCardSemester1[i].getGrade();
			}
		}

		average = total / 12;
		return average;
	}

	public void setExamList(Exam[] quangExamList) {
		this.examList = quangExamList;
	}

	public Exam[] getExamList() {
		return examList;
	}

	public ReportCard getReportCard() {
		return reportCard;
	}

	public void setReportCard(ReportCard reportCard) {
		this.reportCard = reportCard;
	}

	public void generateReportCard(Subject[] subjectList, Exam[] examLists, int semester) {
		int subjectCounter = 0;
		double totalAvarage = 0;
		double total = 0;
		List<Exam> examListBySemester = new ArrayList<Exam>();
		
		for (int i = 0; i < examLists.length; i++) {
			if(examLists[i].getSemester() == semester) {
				examListBySemester.add(examLists[i]);
				//System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("Semester: " + semester);

		//Exam[] currentExamList = examLists;

		System.out.println("Subject        15      45      final      average");

		while (subjectCounter < subjectList.length) {
			System.out.print(subjectList[subjectCounter].getName());

			if (subjectList[subjectCounter].getName().length() < 10) {
				int spaceNeed = 10 - subjectList[subjectCounter].getName().length();
				for (int i = 0; i < spaceNeed; i++) {
					System.out.print(" ");
				}
			}
			System.out.print("     ");
			
			for (int i = 0; i < examListBySemester.size(); i++) {
				if (subjectList[subjectCounter].getName().equals(examListBySemester.get(i).getSubject().getName())
						&& (examListBySemester.get(i).getType()).equals("15")){
					total += examListBySemester.get(i).getGrade();
					System.out.print(examListBySemester.get(i).getGrade());
					System.out.print("     ");
				}
			}

			for (int i = 0; i < examListBySemester.size(); i++) {
				if (subjectList[subjectCounter].getName().equals(examListBySemester.get(i).getSubject().getName())
						&& (examListBySemester.get(i).getType()).equals("45")){
					total += examListBySemester.get(i).getGrade() * 2;
					System.out.print(examListBySemester.get(i).getGrade());
					System.out.print("     ");
				}
			}

			for (int i = 0; i < examListBySemester.size(); i++) {
				if (subjectList[subjectCounter].getName().equals(examListBySemester.get(i).getSubject().getName())
						&& (examListBySemester.get(i).getType()).equals("final")){
					total += examListBySemester.get(i).getGrade() * 3;
					System.out.print(examListBySemester.get(i).getGrade());
					System.out.print("     ");
				}
			}
			
			double unroundAverage = total / 6;
			double average = Math.round(unroundAverage * 100.00) / 100.00;

			System.out.print("   " + average);
			if (subjectList[subjectCounter].getName().equals("Math")
					|| subjectList[subjectCounter].getName().equals("Literature")
					|| subjectList[subjectCounter].getName().equals("English")) {
				totalAvarage = totalAvarage + average * 2;
			} else {
				totalAvarage = totalAvarage + average;
			}
			total = 0;

			System.out.println();
			subjectCounter++;

		}
		double unroundTotalAverage = totalAvarage / 7;
		double totalAverage = Math.round(unroundTotalAverage * 100.00) / 100.00;
		System.out.println("                                          " + totalAverage);
	}

	public double getSemesterAverage(Subject[] subjectList, Exam[] examLists, int semester) {
		int subjectCounter = 0;
		double totalAvarage = 0;
		double total = 0;
		List<Exam> examListBySemester = new ArrayList<Exam>();
		
		for (int i = 0; i < examLists.length; i++) {
			if(examLists[i].getSemester() == semester) {
				examListBySemester.add(examLists[i]);
				//System.out.println(i);
			}
		}
		
		while (subjectCounter < subjectList.length) {
			for (int i = 0; i < examListBySemester.size(); i++) {
				if (subjectList[subjectCounter].getName().equals(examListBySemester.get(i).getSubject().getName())
						&& (examListBySemester.get(i).getType()).equals("15")){
					total += examListBySemester.get(i).getGrade();
				}
			}

			for (int i = 0; i < examListBySemester.size(); i++) {
				if (subjectList[subjectCounter].getName().equals(examListBySemester.get(i).getSubject().getName())
						&& (examListBySemester.get(i).getType()).equals("45")){
					total += examListBySemester.get(i).getGrade() * 2;
				}
			}

			for (int i = 0; i < examListBySemester.size(); i++) {
				if (subjectList[subjectCounter].getName().equals(examListBySemester.get(i).getSubject().getName())
						&& (examListBySemester.get(i).getType()).equals("final")){
					total += examListBySemester.get(i).getGrade() * 3;
				}
			}
			
			double unroundAverage = total / 6;
			double average = Math.round(unroundAverage * 100.00) / 100.00;

			if (subjectList[subjectCounter].getName().equals("Math")
					|| subjectList[subjectCounter].getName().equals("Literature")
					|| subjectList[subjectCounter].getName().equals("English")) {
				totalAvarage = totalAvarage + average * 2;
			} else {
				totalAvarage = totalAvarage + average;
			}
			total = 0;
			subjectCounter++;

		}
		double unroundTotalAverage = totalAvarage / 7;
		double totalAverage = Math.round(unroundTotalAverage * 100.00) / 100.00;
		
		return totalAverage;
	}

	public char getAlphbetGrade(double yearAverage) {
		char grade;

		if (yearAverage < 5) {
			grade = 'F';
		} else if (yearAverage >= 5 && yearAverage < 6) {
			grade = 'D';
		} else if (yearAverage >= 6 && yearAverage < 7) {
			grade = 'C';
		} else if (yearAverage >= 7 && yearAverage < 8) {
			grade = 'B';
		} else if (yearAverage >= 8 && yearAverage < 9) {
			grade = 'A';
		} else {
			grade = 'S';
		}
		return grade;
		
	}
	
	

}
