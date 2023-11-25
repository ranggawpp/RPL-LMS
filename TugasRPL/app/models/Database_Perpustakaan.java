package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;

import java.util.Vector;


@Entity
public class Database_Perpustakaan extends Model{
	private Buku _list_of_books;
	public Pustakawan _pustakawan;
	public Vector<Akun> _akuns = new Vector<Akun>();
	public Vector<Buku> _bukus = new Vector<Buku>();

	public void Add() {
		throw new UnsupportedOperationException();
	}

	public void Delete() {
		throw new UnsupportedOperationException();
	}

	public void Update() {
		throw new UnsupportedOperationException();
	}

	public void Display() {
		throw new UnsupportedOperationException();
	}

	public void Search() {
		throw new UnsupportedOperationException();
	}
}