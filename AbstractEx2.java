package Abstract;
/*
abstract class Abstract{
	void show()
	{
		System.out.println("This is abstract class");
	}
	abstract void show2();
    abstract void show3();	

}
class Abs extends Abstract
{
	void show1(){
	System.out.println("This is Extends class");
}
 void show2(){
 	System.out.println("this is Extends abstract method");
 }
 void show3(){
 	System.out.println("3");
 }
} 
class Str extends Abs{
	void show3()
	{
		System.out.println("This show3 method form Str class");
	}
}
public class AbstractClass
{
	public static void main(String[] args) {
		Str a= new Str();
		a.show1();
		a.show2();
		a.show3();
		Abs b=new Abs();
		b.show3();
		Abstract ab =new Abs();
		ab.show();

	}
}*/

abstract class Abstract
{
   int x,y;
   Abstract(int x,int y)
   {
   	this.x=x;
   	this.y=y;
   	System.out.println("X is "+x+"Y is "+y);
   }
   abstract void calculate();
}
class Addition extends Abstract
{
	int add;
	static java.lang.String s="VENU";
	Addition()
	{
      super(45,22);
	}
   void calculate()
   {
   	add=x+y;
   	System.out.println("Addition is "+add);
   }
   static void venuMa()
   {
   	System.out.println("NAME is "+s);
   }
}
class Multi extends Abstract
{
	int mul;
	Multi()
	{
		super(7,12);
	}
	void calculate()
	{
		mul=x*y;
		System.out.println("Multiplication is ="+mul);
	}
}
public class AbstractEx2
{
	public static void main(String[] args) {
		Addition ad=new Addition();
   	ad.calculate();
   	Addition.venuMa();

		Multi m=new Multi();
		m.calculate();

	}
}


