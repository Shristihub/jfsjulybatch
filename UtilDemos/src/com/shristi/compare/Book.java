package com.shristi.compare;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book o) {
//		return this.getTitle().compareTo(o.getTitle());
//	 try sorting by author
//		return this.getAuthor().compareTo(o.getAuthor());
//		Double price1 = this.getPrice();
//		Double price2 = o.getPrice();
//		return price1.compareTo(price2);
		
		return  ((Double)this.getPrice()).compareTo(o.getPrice());
	}
	
}




