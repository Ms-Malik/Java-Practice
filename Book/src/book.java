class Book {
 private String author, title;
 int id;
 static int identification =0;
 public Book()
 { title = author = "unknown";
   identification++;
   id = identification; }
 public Book (String title, String author)
 {  this.title = title;
  this.author = author;
  identification++;
  id = identification; }
 public Book (Book b)
 {  title = b.title;
  author = b.author;
  identification++;
  id = identification;} 
  public void setAuthor(String author)
 {  this.author = author; }
 public String toString()
{  return "Book No: " + id + " entitled- " 
   + title + " written by-  " + author; }}
