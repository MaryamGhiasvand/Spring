package One2One_Uni_JoinColumn;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column
	private String name;
	
	
	@OneToOne
	//---- by default will create a Join col
	//can add @JoinCol to customise JoinCol name
	private Address address;

	

}
