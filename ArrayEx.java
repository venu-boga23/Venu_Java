package Arrays;
public class ArrayEx{
	public static void main(String[] args) {
    String name[]=new String[3];
   String name1[]={"VENU","SWEETY","AMULYA"};
    for(String a:name1)
//    a=  name1.length;
//    System.out.println(a);


		System.out.println("Venu");
		int age[]=new int[5];

		age[0]=21;
		age[1]=23;
		age[2]=25;
		age[3]=27;
		age[4]=29;
		 System.out.println("Accessing Elements of Array:");
   System.out.println("First Element: " + age[0]);
   System.out.println("Second Element: " + age[1]);
   System.out.println("Third Element: " + age[2]);
   System.out.println("Fourth Element: " + age[3]);
   System.out.println("Fifth Element: " + age[4]);


   String name11[]=new String[3];
   String name111[]={"VENU","SWEETY","AMULYA"};
    for(int i=0;i<name111.length;i++)
    	System.out.println(name111[i]);

    for(int a:age)
    System.out.println(a);


   int a[][]=new int[3][];

    a[0]=new int[3];
    a[1]=new int[4];
    a[2]=new int[2];
/*
    a[0]={
    	{1,2,3},
    	{3,4,5},
    	{5,6,7}
    }

    a[1]={
    	{1,2,3,4},
    	{1,2}
    }
    a[2]={
    	{1,2},
    }
    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);

  */

	}
}

