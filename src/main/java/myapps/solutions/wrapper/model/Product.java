package myapps.solutions.wrapper.model;
// Generated May 8, 2017 3:02:42 PM by Hibernate Tools 5.2.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Product generated by hbm2java
 */

@SqlResultSetMapping(name = "products", classes = {
		@ConstructorResult(targetClass = Product.class, columns = { @ColumnResult(name = "id"), @ColumnResult(name = "name") }) })

@Entity
@Table(name = "product", catalog = "wrapper")
public class Product implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1085526305233113676L;
	private int id;
	private String name;
	private String description;
	private byte[] icon;
	private Integer downloads;
	private List<UserType> userTypes = new ArrayList<UserType>(0);
	private List<Package> packages = new ArrayList<Package>(0);

	public Product() {
	}

	public Product(String name, int downloads) {
		this.name = name;
		this.downloads = downloads;
	}

	public Product(UserType userType, String name, String description, byte[] icon, int downloads,
			List<Package> packages, List<UserType> userTypes) {
		this.name = name;
		this.description = description;
		this.icon = icon;
		this.downloads = downloads;
		this.userTypes = userTypes;
		this.packages = packages;
	}

	public Product(int id, String name){
		this.id = id;
		this.name = name;
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

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "icon")
	public byte[] getIcon() {
		return this.icon;
	}

	public void setIcon(byte[] icon) {
		this.icon = icon;
	}

	@Column(name = "downloads", nullable = false)
	public Integer getDownloads() {
		return this.downloads;
	}

	public void setDownloads(Integer downloads) {
		this.downloads = downloads;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	@JsonIgnore
	public List<UserType> getUserTypes() {
		return this.userTypes;
	}

	public void setUserTypes(List<UserType> userTypes) {
		this.userTypes = userTypes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	@JsonIgnore
	public List<Package> getPackages() {
		return this.packages;
	}

	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}

}
