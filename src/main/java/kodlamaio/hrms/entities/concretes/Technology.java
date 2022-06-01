package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="technologies")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resume"})
public class Technology {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="creating_date")
	private LocalDate creatingDate;
	
	@Column(name="description")
	private String description;
	
	
	
	@ManyToOne
	@JoinColumn(name="resume_id")
	private Resume resume;
	

}
