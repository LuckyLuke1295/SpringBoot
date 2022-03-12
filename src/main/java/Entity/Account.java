package Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_name", nullable = false, unique = true)
	private String userName;
	
	@Column(name = "pass_word", length = 1000, nullable = false)
	private String passWord;
	

}
