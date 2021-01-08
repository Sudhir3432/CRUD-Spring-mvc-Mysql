package cruduserapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
//import java.time.format.DateTimeFormatter;




import org.springframework.format.annotation.DateTimeFormat;

//import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
public class User {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotNull
	@Size(min=2,message="Correct First name")  
	private String fname;
	@NotNull
	@Size(min=2,message="Correct Last name") 
	private String lname;
	
	@NotNull
//	@DateTimeFormat(pattern="yyyy-MM-dd")
//	@DateTimeFormat(iso = DateTimeFormatter.ISO_LOCAL_DATE)
//	@JsonFormat(pattern = "YYYY-MM-dd")
	

    @Temporal(TemporalType.DATE)	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String fname, String lname, Date birthday) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", birthday=" + birthday + "]";
	}
	
}
