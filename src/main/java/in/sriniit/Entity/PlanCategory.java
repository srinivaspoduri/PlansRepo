package in.sriniit.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLAN_CATEGORY")
public class PlanCategory {
	
	@Id
	@GeneratedValue
	@Column(name = "CATEGORY_ID")
	public Integer categoryId;
	
	@Column(name="CATEGORY_NAME")
	public String categoryName;
	
	@Column(name = "ACTIVE_SW")
	public String planActiveSW;
	
	@Column(name = "CREATED_BY")
	public String createdBy;
	
	@Column(name = "UPDATED_BY")
	public String updatedBy;
	
	@Column(name = "CREATE_DATE")
	public LocalDate createdOn;
	
	@Column(name = "UPDATED_DATE")
	public LocalDate updatedOn;

}
