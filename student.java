//by Annu Rajesh

package importsource;



class MyStudent{
	String name;
	int age;
	

MyStudent(String n,int a)
{
   name=n;
   age=a;
}
MyStudent(MyStudent std){
	name=std.name;
	age=std.age;
}
void display() {
	System.out.println("name: "+name);
	System.out.println("age: "+age);
}
}
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MyStudent std=new MyStudent("Arun",23);
		
		MyStudent std1=new MyStudent(std);
		std1.display();

	}

}
