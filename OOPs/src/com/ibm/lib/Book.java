package com.ibm.lib;
public class Book {

	private int isbn;
	private String title;	
	private Member member;
	
	public Book() {
		
	}
	
	public Book(int isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
	}

	public void status()
	{
		if (member == null)
			System.out.println(title + " is not issued to any member");
		else
			System.out.println(title + " is issued to "+ member.getName());
	}
	
	//BL Methods
	public void issueBook(Member mbr) {
		if (member != null) {
			System.out.println(title + " is already issued to "+ member.getName());
		}
		else if (mbr.getBook() != null) {
			System.out.println(mbr.getName() + " has already issued a book");
		}
		else {
			this.member = mbr;
			mbr.setBook(this);
		}
	}
	
	public void returnBook(Member mbr) {
		if (member == null) {
			System.out.println(title + " is not issued to any member");
		}
		
		else if(mbr != this.member) {
			System.out.println(mbr.getName() + " has not issued " + getTitle());
		}
		else {
			this.member = null;
			mbr.setBook(this);
		}
	}
	
	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
}
