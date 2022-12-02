package advanced_mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher_details")
public class TeacherDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="teacher_details_id")
	private int id;//teacher_details_id
	@Column(name="taught_course")
	private String course;
	@Column(name="city")
	private String city;
	@Column(name="blood_group")
	private String blood_grp;
	
	public TeacherDetails() {
		
	}

	public TeacherDetails(String taught_course, String city, String blood_grp) {
		
		this.course = taught_course;
		this.city = city;
		this.blood_grp = blood_grp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaught_course() {
		return course;
	}

	public void setTaught_course(String taught_course) {
		this.course = taught_course;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBlood_grp() {
		return blood_grp;
	}

	public void setBlood_grp(String blood_grp) {
		this.blood_grp = blood_grp;
	}

	@Override
	public String toString() {
		return "TeacherDetails [id=" + id + ", taught_course=" + course + ", city=" + city + ", blood_grp="
				+ blood_grp + "]";
	}
	
}
