
public class Book {
	private String name;
	private double price;
	private int qtyInStock;
	private Author []author=new Author[5];
	private int numAuthors=0;
	public Book(String n,double p,int q,Author authors[])
	{
		name=n;
		price=p;
		qtyInStock=q;
		author=authors;
		for(int i=0;i<authors.length;i++) {
 			if(authors[i]!=null)
 				this.numAuthors++;
 		}
	}
	public void setPrice(int p)
	{
		price=p;
	}
	public void setQtyInStock(int q)
	{
		qtyInStock=q;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQtyInStock()
	{
		return qtyInStock;
	}
	public Author[] getAuthor()
	{
		return author;
	}
	public String tostring()
	{
		return getName()+"by"+getAuthor()+ "("+Author.getGender()+")"+"at"+ Author.getEmail();
	}
}
