package Entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id",nullable = false, unique = true)
	private Long productId;
	
	@Column(name = "product_name",columnDefinition = "not null varchar(50)")
	private String productName;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "unit_price")
	private Double unitPrice;
	
	@Column(name = "Image",length = 1000)
	private String image;
	
	@Column(name = "discount")
	private Double discount;
	
	@Column(name = "entered_date")
	private LocalDate enteredDate;
	
	@Column(name = "status")
	private short Status;
	
	@Column(name = "descrition")
	private String descrition;
	
	
	
	//create a forein key
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false, unique = true)
	private Category category;
	

}