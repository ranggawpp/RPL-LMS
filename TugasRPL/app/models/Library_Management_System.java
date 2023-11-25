package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;

import java.util.Vector;


@Entity
public class Library_Management_System extends Model{
	private String _userType;
	private String _username;
	private String _password;
	public Vector<Buku> _bukus = new Vector<Buku>();
	public Vector<Peminjam> _peminjams = new Vector<Peminjam>();
	public Pustakawan _pustakawan;

	public void Login() {
		throw new UnsupportedOperationException();
	}

	public void Register() {
		throw new UnsupportedOperationException();
	}

	public void Logout() {
		throw new UnsupportedOperationException();
	}
}