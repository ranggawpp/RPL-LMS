package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;

@Entity
public class Mahasiswa extends Peminjam {
	private String _class;
}