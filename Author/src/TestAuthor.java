
public class TestAuthor {
	public static void main(String[] args)
	{
		Author anAuthor=new Author("Tan Ah Teck","ahteck@somewhere.com", 'm');
		System.out.println(anAuthor);
		anAuthor.setEmail("paul@noewhere.com");
		System.out.println(anAuthor);
	}
}
