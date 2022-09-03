
public class Author {
	private String name;
	private static String email;
	private static char gender;
	public Author(String n,String e,char g)
	{
		name=n;
		email=e;
		gender=g;
	}
	public void setEmail(String Email)
	{
		email=Email;
	}
	public String getName()
	{
		return name;
	}
	public static String getEmail()
	{
		return email;
	}
	public static char getGender()
	{
		return gender;
	}
	public String tostring()
	{
		return getName()+"("+getGender()+")"+"at"+ getEmail();
	}
}
