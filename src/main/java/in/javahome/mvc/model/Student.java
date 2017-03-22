package in.javahome.mvc.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	@NotEmpty(message="Student name is mandatory")
	@Length(min=4,max=20, message="Name must be minimum 4 and max 20 characters")
	private String name;
	@Email(message="Not a valid email")
	private String mail;
	private String phone;
	private String course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", mail=" + mail + ", phone=" + phone + ", course=" + course + "]";
	}
	
}
