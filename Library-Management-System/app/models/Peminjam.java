package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;

import java.util.Vector;

@Entity
public class Peminjam extends Model{
	private String _name;
	private int _iD;
	public Library_Management_System _library_Management_System;
	public Akun _unnamed_Akun_;
	public Vector<Buku> _unnamed_Buku_ = new Vector<Buku>();

	public void Verify() {
		throw new UnsupportedOperationException();
	}

	public void CheckAccount() {
		throw new UnsupportedOperationException();
	}

	public void get_book_info() {
		throw new UnsupportedOperationException();
	}
}