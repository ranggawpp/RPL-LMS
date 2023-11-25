package Library_Management_System;

import java.util.Vector;
import Library_Management_System.Peminjam;

public class Buku {
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