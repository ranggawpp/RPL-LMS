package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;

import java.util.Vector;

@Entity
public class Buku extends Model{
	private String _title;
	private String _author;
	private String _iSBN;
	private String _publication;
	public Vector<Peminjam> _unnamed_Peminjam_ = new Vector<Peminjam>();
	public Library_Management_System _library_Management_System;
	public Pustakawan _pustakawan;
	public Database_Perpustakaan _database_Perpustakaan;

	public void Show_duedt() {
		throw new UnsupportedOperationException();
	}

	public void Renew_info() {
		throw new UnsupportedOperationException();
	}
}