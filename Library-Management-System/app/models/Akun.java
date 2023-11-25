package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;


@Entity
public class Akun extends Model{
	private int _no_borrowed_books;
	private int _no_returned_books;
	private int _no_lost_books;
	private float _fine_amount;
	public Peminjam _unnamed_Peminjam_;
	public Database_Perpustakaan _database_Perpustakaan;

	public void Calculate_fine() {
		throw new UnsupportedOperationException();
	}
}