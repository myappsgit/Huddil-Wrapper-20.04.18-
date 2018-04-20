package myapps.solutions.wrapper.model;
// Generated May 12, 2017 11:30:29 AM by Hibernate Tools 5.2.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserPreferences generated by hbm2java
 */
@Entity
@Table(name = "user_preferences", catalog = "cashup")
public class UserPreferences implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4519739566205892022L;
	private int userId;
	private int userType;
	private String sessionId;
	private int age;
	private String gender;
	private int points;
	private String city;


	public UserPreferences() {
	}

	public UserPreferences(int userId, int userType) {
		this.userId = userId;
		this.userType = userType;
	}

	public UserPreferences(int userId, int userType, String sessionId) {
		this.userId = userId;
		this.userType = userType;
		this.sessionId = sessionId;
	}

	public UserPreferences(int userId, String sessionId) {
		this.userId = userId;
		this.sessionId = sessionId;
	}

	public UserPreferences(int userId, int userType, int age, String gender) {
		this.userId = userId;
		this.userType = userType;
		this.age = age;
		this.gender = gender;
	}
	
	public UserPreferences(int userId, int userType, String sessionId, int age, String gender, String city) {
		this.userId = userId;
		this.userType = userType;
		this.sessionId = sessionId;
		this.age = age;
		this.gender = gender;
		this.city = city;
	}

	@Id

	@Column(name = "sessionId", length = 128)
	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Column(name = "userId", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "userType", nullable = false)
	public int getUserType() {
		return this.userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	@Column(name = "age", nullable = false)
	public int isAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name = "gender", nullable = false, length = 1)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	
}
