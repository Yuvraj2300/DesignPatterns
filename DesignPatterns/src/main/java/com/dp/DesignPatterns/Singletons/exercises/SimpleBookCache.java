package com.dp.DesignPatterns.Singletons.exercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class SimpleBookCache {
	
	private	Map<Integer, Book>		bookCache;
	
	@PostConstruct
	public	void	start() {
		bookCache	=	new	LinkedHashMap<Integer, Book>();
		List<Book>	bookData	=	getBookData();
		int	i	=	1;
		
		for(Book	book:bookData) {
			bookCache.put(i, book);
			i++;
		}
	}
	
	public	String	getISBNCache(String	ISBN) {
		Set<Map.Entry<Integer, Book>>	setBook	=	bookCache.entrySet();
		String	retreivedISBN	=	null;
		
		for(Map.Entry<Integer, Book>	entry:setBook) {
			
			retreivedISBN	=	entry.getValue().getISBN();
			
			if(retreivedISBN==ISBN) {
				break;
			}else {
				return	"Not Present";
			}
		}
		return	retreivedISBN;
	}
	
	public	String	getAuthor(String	author) {
		Set<Map.Entry<Integer, Book>>	setBook	=	bookCache.entrySet();
		String	retreivedAuthor	=	null;
		
		for(Map.Entry<Integer, Book>	entry:setBook) {
			
			retreivedAuthor	=	entry.getValue().getAuthor();
			
			if(retreivedAuthor==author) {
				break;
			}else {
				return	"Not Present";
			}
		}
		return	retreivedAuthor;
	}
	
	
	private	List<Book>	getBookData(){
		List<Book>	books	=	new	ArrayList<Book>();
		
		books.add(new	Book("1238-8954355AC", "Yuval", "Classic-Sci"));
		books.add(new	Book("1238-24254355AC", "JK Rowling", "Fiction"));
		books.add(new	Book("1238-8454355AC", "Jeffery Archer", "Fiction"));
		books.add(new	Book("1238-845112", "Jack Keruack", "Fiction"));
		
		return	books;
		
	}
}
