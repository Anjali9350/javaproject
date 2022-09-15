package labtest;
/*
 * @author : Anjali
 * Program : WAP to create 2 ArrayLists list1 and list2 and add 3 objects of Book in each list.
 *           and print elements of both ArrayList one on one line.
 */
public class Book {
	private String book_Id;
	private String subject;
	private String author;
	
		

		public Book(String book_Id, String subject, String author) 
		{
		super();
		this.book_Id = book_Id;
		this.subject = subject;
		this.author = author;
	}

		@Override
	public String toString() {
		return "Book [book_Id=" + book_Id + ", subject=" + subject + ", author=" + author + ", getBook_Id()="
				+ getBook_Id() + ", getSubject()=" + getSubject() + ", getAuthor()=" + getAuthor() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public String getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(String book_Id) {
		this.book_Id = book_Id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
