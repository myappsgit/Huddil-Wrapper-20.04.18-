package myapps.solutions.wrapper.model;
// Generated Aug 18, 2017 3:04:11 PM by Hibernate Tools 5.2.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * State generated by hbm2java
 */
@Entity
@Table(name = "state", catalog = "wrapper", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class State implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7224628045784691793L;
	private Integer id;
	private String name;
	//private Set<UserDetails> userDetailses = new HashSet<UserDetails>(0);

	public State() {
	}

	public State(String name/*, Set<UserDetails> userDetailses*/) {
		this.name = name;
		//this.userDetailses = userDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", unique = true, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "state")
	public Set<UserDetails> getUserDetailses() {
		return this.userDetailses;
	}

	public void setUserDetailses(Set<UserDetails> userDetailses) {
		this.userDetailses = userDetailses;
	}*/

}
