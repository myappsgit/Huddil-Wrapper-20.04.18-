package myapps.solutions.wrapper.model;
// Generated May 8, 2017 3:02:42 PM by Hibernate Tools 5.2.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * UserSubscription generated by hbm2java
 */
@Entity
@Table(name = "user_subscription", catalog = "wrapper")
public class UserSubscription implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -809167871766822087L;
	private Integer sno;
	private Package package_;
	private Subscription subscription;
	private UserDetails userDetails;
	private UserType userType;
	private Date dateOfSubscription;
	private Date expiration;

	public UserSubscription() {
	}

	public UserSubscription(UserDetails userDetails, Date dateOfSubscription) {
		this.userDetails = userDetails;
		this.dateOfSubscription = dateOfSubscription;
	}

	public UserSubscription(Package package_, Subscription subscription, UserDetails userDetails, UserType userType,
			Date dateOfSubscription, Date expiration) {
		this.package_ = package_;
		this.subscription = subscription;
		this.userDetails = userDetails;
		this.userType = userType;
		this.dateOfSubscription = dateOfSubscription;
		this.expiration = expiration;
	}
	
	public UserSubscription(UserDetails userDetails, UserType userType){
		this.userDetails = userDetails;
		this.userType = userType;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@JsonProperty(access = Access.WRITE_ONLY)
	@Column(name = "sNo", unique = true, nullable = false)
	public Integer getSno() {
		return this.sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "packageId")
	@JsonIgnore
	public Package getPackage() {
		return this.package_;
	}

	public void setPackage(Package package_) {
		this.package_ = package_;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "subId")
	public Subscription getSubscription() {
		return this.subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	@JsonProperty(access = Access.WRITE_ONLY)
	public UserDetails getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "productUserType")
	public UserType getUserType() {
		return this.userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateOfSubscription", nullable = false, length = 19)
	public Date getDateOfSubscription() {
		return this.dateOfSubscription;
	}

	public void setDateOfSubscription(Date dateOfSubscription) {
		this.dateOfSubscription = dateOfSubscription;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "expiration", length = 19)
	public Date getExpiration() {
		return this.expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

}
