import java.util.*;

public class Person
{
	//Fields.
	protected static final String[] suffix = {"Esq.", "Dr.", "Prof."};
	protected static final String[] name = {"Mary" , "John" , "Jim" , "Vludoc" , "Taiah" , "Kurama" , "Danielle" , "Pim" , "Roger" };
	protected static final String[] age = {"19" , "21" , "32" , "45" , "32" , "78" , "65" , "67" , "36"};
	protected static final int mutator = new Random().nextInt(8);;
	protected static Scanner scan = new Scanner(System.in);
	
	//Encapsulated start code.
	public Person()
	{
		//Starting information.
		System.out.println(name[mutator] + "\nAge: " + age[mutator]);
		System.out.println("Are they a Doctor, Lawyer, or Professor: \n Answer D, L, or P:");
		String input = Validate(input  = scan.nextLine());
		scan.close();
		
		//Generate random number and store from arrays.
		String sen = name[mutator] + "\nAge: " + age[mutator];

		//Decide what to print.
		if(input.equalsIgnoreCase("l"))
		{
			Chosen(suffix[0], sen);
		}//If.
		else if(input.equalsIgnoreCase("d"))
		{
			Chosen(suffix[1], sen);
		}//Else if.
		else
		{
			Chosen(suffix[2], sen);
		}//Else.
	}//Run.
	
	//To String based on chose input.
	private static void Chosen(String suffix, String sen)
	{
		System.out.println(suffix.toString() + " " + sen.toString());
	}//Chosen.
	
	//Validate input.
	private static String Validate(String input)
	{
		while(!(input.equalsIgnoreCase("l") || input.equalsIgnoreCase("d") || input.equalsIgnoreCase("p")))
		{
			System.out.println("Error! Are they a Doctor, Lawyer, or Professor: \n Answer D, L, or P:");
			input  = scan.nextLine();
		}
		return input;
	}//Validate.
	
	//Main Method.
	public static void main(String [] args)
	{
		new Person();
		System.exit(0);
	}//Main.
}//Person Class.
