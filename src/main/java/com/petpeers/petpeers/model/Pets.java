
@Data
@Entity
public class Pets{

	@Id
	@GeneratedValue(stratedgy = GenerationType.SEQUENCE)
	private int petId;
	private String petName;
	private int petAge;
	private String petPlace;
	private int petOwnerId;

}
