package OopsConcepts;

public class Constructor 
{
	//Constructor is a Definition block that is used to Create an Object.
	//Constructor can also be used to initialize Non-Static Variables.
	//Constructor will be immediately called when we create an object of particular class.
	//Constructor cannot be inherited but it can be invoked.
	//When we do not create an user defined constructor compiler will not create a constructor.
	//For each class there will be one Default Constructor or Hidden Default Constructor.
	//Constructor Cannot have return type.
	//Constructor name must be same as Class name because to tell JVM for which class object to be created.
	//Constructor can have more than one Parameters.
	//Constructor can have any of the Access Modifiers. <<Private, Public, Protected, Default>>
	
	int i;
	int j;
	
	//Default Constructor initializing Non-Static Variables
	Constructor()
	{
		i=10;
		j=20;
	}

	Constructor(int a, int b)
	{
		System.out.println("One Argument Constructor");
		System.out.println(a+b);
	}

	Constructor(String m, int n)
	{
		System.out.println("Two Argument Constructor");
		System.out.println("Name is " + m + " and Age is " +n);
	}
	
	public static void main(String[] args)
	{
		Constructor construct1 = new Constructor();
		System.out.println(construct1.i);
		System.out.println(construct1.j);
		
		Constructor construct2 = new Constructor(20, 30);
		
		Constructor construct3 = new Constructor("Tom", 30);
	}
}
