package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;

import java.util.Vector;


@Entity
public class Pustakawan extends Model{
	private String _name;
	private int _iD;
	private String _password;
	private String _searchString;
	public Library_Management_System _library_Management_System;
	public Vector<Buku> _bukus = new Vector<Buku>();
	public Database_Perpustakaan _database_Perpustakaan;

	public void Verify_Librarian() {
		throw new UnsupportedOperationException();
	}

	public void Search() {
		throw new UnsupportedOperationException();
	}
}