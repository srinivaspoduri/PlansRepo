package in.sriniit.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAN_MASTER")
public class Plan {

	@Id
	@GeneratedValue
	@Column(name="PLAN_ID")
	public Integer planId;
	
	@Column(name="PLAN_NAME")
	public String planName;
	
	@Column(name="PLAN_START_DATE")
	public LocalDate planStartDate;
	
	@Column(name="PLAN_END_DATE")
	public LocalDate planEndDate;
	
	@Column(name = "PLAN_CATEGORY_ID")
	public Integer planCategoryId;
	
	@Column(name="PLAN_ACTIVE_SW")
	public String activteSW;
	
	@Column(name="CREATED_BY")
	public String createdBy;
	
	@Column(name="UPDATED_BY")
	public String updatedBy;
	
	@Column(name="CREATED_DATE")
	public LocalDate createdOn;
	
	@Column(name="UPDATED_DATE")
	public LocalDate updatedOn;
}
