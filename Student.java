public class Student extends Person {
    private int id;
    private int score;
    private String major;

    public Student() {
        id = 0;
        score = 0;
        major = "Unknown";
    }

    public Student(int id, String name, int age, int score, String major) {
        super(name, age);
        this.id = id;
        this.score = score;
        this.major = major;
    }
    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
    
    public void print() {
        System.out.println("---- Student ----");
        super.print();
        System.out.println("ID           : " + id);
        System.out.println("Score        : " + score);
        System.out.println("Major        : " + major);
    }

    
}
