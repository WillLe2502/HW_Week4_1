package Week3_2;

public class Classroom {
	int id;
	String roomNumber;
	int level;
	Teacher teacher;

	public Classroom(int id, String roomNumber, int level) {
		super();
		this.id = id;
		this.roomNumber = roomNumber;
		this.level = level;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getLevel() {
		return level;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Classroom " + roomNumber + " located on level: " + level + ". Primary Teacher: " + teacher.getName();
	}
	
	

}
