package kodlamaio.hrms.entities.concretes;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvert"})
public class Employer extends User {

	@NotBlank(message="Şirket ismi alanını boş bırakmayınız")
	@Column(name="company_name")
	private String companyName;
    
	@NotBlank(message="Web alaı boş bırakmayınız")
	@Column(name="web_address")
	private String webAddress;
	
    @NotBlank(message="Telefon numarasını alanı boş bırakmayınız")
	@Column(name="phone_number")
	private String phoneNumber;
    
    @JsonIgnore
    @OneToMany(mappedBy="employer")
	private List<JobAdvertisement> jobAdvertisement;
	
	
	

}
