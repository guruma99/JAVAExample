package sec02.exam02;

public class Member {
	String name;
	String id;
	String pass;
	int age;
	
	Member(String name, String id){
		this(name, id, "0000", 20);
		System.out.println("매개변수: String,String");
	}
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("매개변수: String,int");
	}
	public Member(String name, String id, String pass, int age) {
		this.name=name;
		this.id=id;
		this.pass=pass;
		this.age=age;
		System.out.println("매개변수: String,String,String,int");
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	public void setPassword(String pass) {
		this.pass=pass;
	}
	
	public void printMemberInfo() {
		System.out.println("Name is " + name);
		System.out.println("Id is " + id);
		System.out.println("Password is " + pass);
		System.out.println("Age is " + age);
	}
}