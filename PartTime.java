public class PartTime extends Teacher {
    private int hoursworked;
    private int salary;

    public PartTime() {
        super();
        hoursworked = 0;
        
    }

    public PartTime(String name, int age, String subject, int hoursworked, int salary) {
        super(name, age, subject);
        this.hoursworked = hoursworked;
        this.salary = salary;
    }

	public int getHoursworked() {
		return this.hoursworked;
	}

	public void setHoursworked(int hoursworked) {
		this.hoursworked = hoursworked;
	}

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
       

    public void print() {
        System.out.println("---- Part Time Teacher ----");
        super.print();
        System.out.println("Hours Worked : " + hoursworked);
        System.out.println("Salary       : " + salary);
    }
    
}
 