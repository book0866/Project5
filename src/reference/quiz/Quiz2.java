package reference.quiz;

public class Quiz2 {

	public static void main(String[] args) {

		// 부서 객체를 생성하고, 부서원들을 추가하세요
		Employee employee1 = new Employee("둘리", 50, 5000000, 20);
		Employee employee2 = new Employee("또치", 40, 4000000, 10);
		Employee employee3 = new Employee("도우너", 30, 3000000, 3);
		
		Department department = new Department(employee1, employee2, employee3);
		
	}

}


//직원(Employee)을 정의하는 클래스를 만드세요
//속성: 이름, 나이, 월급, 근속년수
class Employee {
	
	String name;
	int age;
	int pay;
	int jobTenure;
	
	public Employee(String name, int age, int pay, int jobTenure) {
		super();
		this.name = name;
		this.age = age;
		this.pay = pay;
		this.jobTenure = jobTenure;
	}
	
}


// 부서(Department)를 정의하는 클래스를 만드세요.
// 속성: 부서장, 수석연구원, 책임연구원
class Department {
	
	String head;
	String chief;
	String senior;
	
	
	public Department(String head, String chief, String senior) {
		super();
		this.head = head;
		this.chief = chief;
		this.senior = senior;
	}
	
}




















