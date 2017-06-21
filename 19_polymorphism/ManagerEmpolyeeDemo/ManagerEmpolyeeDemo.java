abstract  class Empolyee {
	private  String name;
	private  String id;
	private int salary;

	public Empolyee() {}
	public Empolyee(String name, String id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name; 
	}
	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}

	public abstract void work();
}

class Programmer extends Empolyee {
	public Programmer() {}
	public Programmer(String name, String id, int salary) {
		super(name, id, salary);
	}

	public void work() {
		System.out.println("按照需撸代码");
	}
}

class Manager extends Empolyee {
	private int bouns;

	public Manager() {}
	public Manager(String name, String id, int salary, int bouns) {
		super(name, id, bouns);
		this.bouns = bouns;
	}

	public void setBouns(int bouns) {
		this.bouns = bouns;
	}
	public int getBouns() {
		return bouns;
	}

	public void work() {
		System.out.println("和客户洽谈业务");
	}
}

public class ManagerEmpolyeeDemo {
	public static void main(String[] args) {
		Empolyee emp = new Programmer("孙燕姿","1002",18000);
		System.out.println(emp.getName() + "---" + emp.getId() + "---" +emp.getSalary());
		emp.work();
		System.out.println("=================");

		Manager m = new Manager("何宽","1024",10000,5000);
		System.out.println(m.getName() + "---" + m.getId() + "---" +m.getSalary());
		m.work();
	}
}
