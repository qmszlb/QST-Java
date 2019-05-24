package demo;

public class Teacher {
	public  String name;
	public String sex;
	public int age;
	public String title;//职称
	 
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	 public Teacher(String name, String sex,int age, String title) {
		super();
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.title=title;
		// TODO Auto-generated constructor stub
	}

 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
public void Put(){
	System.out.print(name);
}
public void OutPut(){
	System.out.println("-------输出教师属性----------");
	System.out.println("教师姓名:"+name);
	System.out.println("教师性别:"+sex);
	System.out.println("教师年龄:"+age);
	System.out.println("教师职称:"+title);
	
  }
}
