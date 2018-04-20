package myapps.solutions.wrapper.model;
// Generated Oct 30, 2017 4:30:21 PM by Hibernate Tools 5.2.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Refund generated by hbm2java
 */
@Entity
@Table(name = "refund", catalog = "wrapper")
public class Refund implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2565344956005505974L;
	private int id;
	private Payment payment;
	private String status;
	private double totalAmount;
	private double refundAmount;
	private Date refundDate;

	public Refund() {
	}

	public Refund(int id, Payment payment, String status, double totalAmount, double refundAmount, Date refundDate) {
		this.id = id;
		this.payment = payment;
		this.status = status;
		this.totalAmount = totalAmount;
		this.refundAmount = refundAmount;
		this.refundDate = refundDate;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paymentId", nullable = false)
	public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Column(name = "status", nullable = false, length = 45)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "totalAmount", nullable = false, precision = 22, scale = 0)
	public double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Column(name = "refundAmount", nullable = false, precision = 22, scale = 0)
	public double getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(double refundAmount) {
		this.refundAmount = refundAmount;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "refundDate", nullable = false, length = 10)
	public Date getRefundDate() {
		return this.refundDate;
	}

	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}

}
