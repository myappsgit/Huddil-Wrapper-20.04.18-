package myapps.solutions.wrapper.model;
// Generated May 4, 2017 1:51:18 PM by Hibernate Tools 5.2.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DefaultSettings generated by hbm2java
 */
@Entity
@Table(name = "default_settings", catalog = "wrapper")
public class DefaultSettings implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1053497316451116728L;
	private Integer id;
	private int maxDeviceCnt;

	public DefaultSettings() {
	}

	public DefaultSettings(int maxDeviceCnt) {
		this.maxDeviceCnt = maxDeviceCnt;
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

	@Column(name = "maxDeviceCnt", nullable = false)
	public int getMaxDeviceCnt() {
		return this.maxDeviceCnt;
	}

	public void setMaxDeviceCnt(int maxDeviceCnt) {
		this.maxDeviceCnt = maxDeviceCnt;
	}

}
