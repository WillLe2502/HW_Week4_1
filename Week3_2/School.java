package Week3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userInput;

		Exam exam = new Exam();
		// ClassRoomList
		Classroom class10a1 = new Classroom(1, "10A1", 3);
		Classroom class10a2 = new Classroom(2, "10A2", 3);
		Classroom class10a3 = new Classroom(3, "10A2", 3);
		Classroom class11a1 = new Classroom(4, "11A1", 2);
		Classroom class11a2 = new Classroom(5, "11A2", 2);
		Classroom class11a3 = new Classroom(6, "11A3", 2);
		Classroom class12a1 = new Classroom(7, "12A1", 1);
		Classroom class12a2 = new Classroom(8, "12A2", 1);
		Classroom class12a3 = new Classroom(9, "12A3", 1);

		// TeacherList
		Teacher alpha = new Teacher(1, "Alpha");
		Teacher beta = new Teacher(2, "Beta");
		Teacher charlie = new Teacher(3, "Charlie");
		Teacher delta = new Teacher(4, "Delta");
		Teacher echo = new Teacher(5, "Echo");
		Teacher foxtrot = new Teacher(6, "Foxtrot");
		Teacher gamma = new Teacher(7, "Gamma");
		Teacher newton = new Teacher(8, "Newton");
		Teacher viktor = new Teacher(9, "Viktor");

		// SubjectList
		Subject math = new Subject(1, "Math");
		Subject literature = new Subject(1, "Literature");
		Subject english = new Subject(1, "English");
		Subject history = new Subject(1, "History");
		Subject geography = new Subject(1, "Geography");
		Subject physics = new Subject(1, "Physcis");
		Subject pe = new Subject(1, "PE");
		Subject biology = new Subject(1, "Biology");
		Subject chemistry = new Subject(1, "Chemistry");

		// Object Lists

		Classroom[] classroomList = { class10a1, class10a2, class10a3, class11a1, class11a2, class11a3, class12a1,
				class12a2, class12a3 };

		Subject[] subjectList = { math, literature, english, physics };

		Teacher[] teacherList = { alpha, beta, charlie, delta, echo, foxtrot, gamma, newton, viktor };

		// Student[] studentList = { quang };

		// Assign Teacher To classroom and vice versa
		for (int i = 0; i < classroomList.length; i++) {
			classroomList[i].setTeacher(teacherList[i]);
		}

		for (int i = 0; i < teacherList.length; i++) {
			teacherList[i].setClassroom(classroomList[i]);
		}

		// Assign Teacher To subject and vice versa

//		for (int i = 0; i < subjectList.length; i++) {
//			subjectList[i].setTeacher(teacherList[i]);
//		}
//
//		for (int i = 0; i < teacherList.length; i++) {
//			teacherList[i].setSubject(subjectList[i]);
//		}

		// Assign Student to Classroom

//		System.out.println("Welcome to Coding School! How can we help you");
//		System.out.println("Input 1 to list all of the current classrooms.");
//		System.out.println("Input 2 to list all of the current teachers.");
//		System.out.println("Input 3 to list all of the current subjects.");
//		System.out.println("Input 4 to list all of the current students.");
//		System.out.println("Input 5 to list the report card of a specific student.");
//		System.out.println();
//		System.out.print("Please Input a Number: ");
//		userInput = sc.nextInt();

		// StudentList
		Student quang = new Student("Quang");
		quang.setClassroom(class12a3);
		
		Student[] studentsList = {quang};

		Exam quangMath15test = new Exam(1, "15", 8.8, math, 1);
		Exam quangMath45test = new Exam(2, "45", 9, math, 1);
		Exam quangMathfinaltest = new Exam(3, "final", 8, math, 1);
		Exam quangLiteraturefinaltest = new Exam(4, "final", 6, literature, 1);
		Exam quangLiterature15test = new Exam(5, "15", 6.3, literature, 1);
		Exam quangLiterature45test = new Exam(6, "45", 5, literature, 1);
		Exam quangEnglishfinaltest = new Exam(7, "final", 7.7, english, 1);
		Exam quangEnglish15test = new Exam(8, "15", 8, english, 1);
		Exam quangEnglish45test = new Exam(9, "45", 9, english, 1);
		Exam quangPhysicsfinaltest = new Exam(10, "final", 7.4, physics, 1);
		Exam quangPhysics15test = new Exam(11, "15", 6.2, physics, 1);
		Exam quangPhysics45test = new Exam(12, "45", 8, physics, 1);

		Exam quangMath15test2 = new Exam(13, "15", 9, math, 2);
		Exam quangMath45test2 = new Exam(14, "45", 8, math, 2);
		Exam quangMathfinaltest2 = new Exam(15, "final", 5, math, 2);
		Exam quangLiteraturefinaltest2 = new Exam(16, "final", 8, literature, 2);
		Exam quangLiterature15test2 = new Exam(17, "15", 9, literature, 2);
		Exam quangLiterature45test2 = new Exam(18, "45", 7, literature, 2);
		Exam quangEnglishfinaltest2 = new Exam(19, "final", 6.2, english, 2);
		Exam quangEnglish15test2 = new Exam(20, "15", 9, english, 2);
		Exam quangEnglish45test2 = new Exam(21, "45", 8, english, 2);
		Exam quangPhysicsfinaltest2 = new Exam(22, "final", 5.5, physics, 2);
		Exam quangPhysics15test2 = new Exam(23, "15", 8, physics, 2);
		Exam quangPhysics45test2 = new Exam(24, "45", 7, physics, 2);

		Exam[] quangExamList = { quangMath15test, quangMath45test, quangMathfinaltest, quangLiterature15test,
				quangLiterature45test, quangLiteraturefinaltest, quangEnglish15test, quangEnglish45test,
				quangEnglishfinaltest, quangPhysics15test, quangPhysics45test, quangPhysicsfinaltest, quangMath15test2,
				quangMath45test2, quangMathfinaltest2, quangLiterature15test2, quangLiterature45test2,
				quangLiteraturefinaltest2, quangEnglish15test2, quangEnglish45test2, quangEnglishfinaltest2,
				quangPhysics15test2, quangPhysics45test2, quangPhysicsfinaltest2 };

		quang.setExamList(quangExamList);

		ReportCard quangReportCardSem1 = new ReportCard(quangExamList, 1);

		quang.setReportCard(quangReportCardSem1);

//		for (Exam exam : quangExamList) {
//			System.out.println(exam.toString());
//		}

		String userInputName;
		System.out.print("Please Input student name: ");
		userInputName = sc.next();
		boolean isFound = false;
		Student currentStudent = new Student();
		for (int i = 0; i < studentsList.length; i++) {
			if (studentsList[i].getName().equals(userInputName)) {
				currentStudent = studentsList[i];
				isFound = true;
			}
		}
		
		if(isFound == true) {
			System.out.println("Report Card");
			System.out.println("Student: " + currentStudent.getName());
			System.out.println("Classroom: " + currentStudent.getClassroom().getRoomNumber());
			System.out.println("Teacher: " + currentStudent.getClassroom().getTeacher().getName());
			
			Exam[] currentExamList = currentStudent.getExamList();
			
			currentStudent.generateReportCard(subjectList, currentExamList, 1);
			currentStudent.generateReportCard(subjectList, currentExamList, 2);
			
			double semesterOneAverage = currentStudent.getSemesterAverage(subjectList, currentExamList, 1);
			double semesterTwoAverage = currentStudent.getSemesterAverage(subjectList, currentExamList, 2);
			
			double yearTotal = semesterOneAverage + 2*semesterTwoAverage;
			double unRoundYearAverage = yearTotal / 3;
			double yearAverage = Math.round(unRoundYearAverage * 100.00) / 100.00;
			
			System.out.println("Year Average: " + yearAverage);
			char studentGrade = currentStudent.getAlphbetGrade(yearAverage);
			System.out.println("Grade: " + studentGrade);
		}
	}

}