package Library_Management_System;

import java.util.Vector;
import Library_Management_System.Buku;

public class Pustakawan {
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