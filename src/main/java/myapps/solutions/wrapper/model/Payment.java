package myapps.solutions.wrapper.model;
// Generated Oct 30, 2017 4:30:21 PM by Hibernate Tools 5.2.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import myapps.payment.service.model.InstaMojoPayment;

/**
 * Payment generated by hbm2java
 */
@Entity
@Table(name = "payment", catalog = "wrapper")
public class Payment implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7102219656588348113L;
	private String id;
	private Product product;
	private UserDetails userDetails;
	private String buyerName;
	private String method;
	private double amount;
	private String status;
	private double fees;
	private Date paymentDate;
	private String responseCode;
	private Set<Refund> refunds = new HashSet<Refund>(0);

	public Payment() {
	}

	public Payment(String id, Product product, UserDetails userDetails, String buyerName, String method, double amount,
			String status, double fees, Date paymentDate) {
		this.id = id;
		this.product = product;
		this.userDetails = userDetails;
		this.buyerName = buyerName;
		this.method = method;
		this.amount = amount;
		this.status = status;
		this.fees = fees;
		this.paymentDate = paymentDate;
	}

	public Payment(String id, Product product, UserDetails userDetails, String buyerName, String method, double amount,
			String status, double fees, Date paymentDate, Set<Refund> refunds) {
		this.id = id;
		this.product = product;
		this.userDetails = userDetails;
		this.buyerName = buyerName;
		this.method = method;
		this.amount = amount;
		this.status = status;
		this.fees = fees;
		this.paymentDate = paymentDate;
		this.refunds = refunds;
	}

	public Payment(Product product, int userId, InstaMojoPayment payment) {
		this.id = payment.getId();
		this.product = product;
		this.userDetails = new UserDetails();
		this.buyerName = payment.getBuyerName();
		this.method = payment.getMethod();
		this.amount = payment.getAmount();
		this.status = payment.getStatus();
		this.fees = payment.getFees();
		this.paymentDate = payment.getPaymentDate();
	}

	public Payment(String responseCode) {
		this.responseCode = responseCode;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false, length = 50)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productId", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	public UserDetails getUserDetails() {
		return this.userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	@Column(name = "buyerName", nullable = false, length = 45)
	public String getBuyerName() {
		return this.buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	@Column(name = "method", nullable = false, length = 45)
	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	@Column(name = "amount", nullable = false, precision = 22, scale = 0)
	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Column(name = "status", nullable = false, length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "fees", nullable = false, precision = 22, scale = 0)
	public double getFees() {
		return this.fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "paymentDate", nullable = false, length = 10)
	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "payment")
	public Set<Refund> getRefunds() {
		return this.refunds;
	}

	public void setRefunds(Set<Refund> refunds) {
		this.refunds = refunds;
	}

	@Transient
	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

}
