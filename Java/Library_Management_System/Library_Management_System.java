package Library_Management_System;

import java.util.Vector;
import Library_Management_System.Buku;
import Library_Management_System.Peminjam;

public class Library_Management_System {
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