package org.howard.edu.lsp.midterm.question1;

/**
 * This class represents a book in a library
 */
public class Book {
	private String title;
	private String author;
	private String ISBN;
	private int yearPublished;

	/**
     * Constructs a new Book instance with the specified attributes.
     *
     * @param title         book title
     * @param author        book author
     * @param ISBN          book ISBN number 
     * @param yearPublished the year the book was published
     */
	public Book(String title, String author, String ISBN, int yearPublished) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.yearPublished = yearPublished;
	}

	/**
     * Returns the title of the book.
     *
     * @return book title
     */
	public String getTitle() {
		return title;
	}
	/**
     * Returns the author of the book.
     *
     * @return book author
     */
	public String getAuthor() {
		return author;
	}
	/**
     * Returns the ISBN of the book.
     *
     * @return the ISBN of the book
     */
	public String getISBN() {
		return ISBN;
	}
	/**
     * Returns the year the book was published.
     *
     * @return the year published
     */
	public int getYearPublished() {
		return yearPublished;
	}

	/**
     * Sets the title of the book.
     *
     * @param title the new title of the book
     */
	public void setTitle(String title) {
		this.title = title;
	}
	 /**
     * Sets the author of the book.
     *
     * @param author the new author of the book
     */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
     * Sets the ISBN of the book.
     *
     * @param ISBN the new ISBN of the book
     */
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	/**
     * Sets the year the book was published.
     *
     * @param yearPublished the new year published
     */
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	// Override equals method

    /**
     * Checks if this Book object is equal to another object.
     *
     * @param obj the object to compare
     * @return true if the objects are equal based on ISBN and author; false otherwise
     */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Book book = (Book) obj;
		return ISBN.equals(book.ISBN) && author.equals(book.author);
	}

	// Override toString method

    /**
     * Returns a string representation of the Book object.
     *
     * @return a string containing the title, author, ISBN, and year published
     */
	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
	}
}

//used chatGPT and Notebook LM to help with this question
	
	
