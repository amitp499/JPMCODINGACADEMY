package src.com.jp.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table(name = "SALES_TPC")
@DiscriminatorValue(value="SMGR")
/*@AttributeOverrides({

		@AttributeOverride(column = @Column(name = "EMP_ID"), name = "empId"),
		@AttributeOverride(column = @Column(name = "EMP_NAME"), name = "empName"),
		@AttributeOverride(column = @Column(name = "EMP_SALARY"), name = "empSal"),
		@AttributeOverride(column = @Column(name = "Bomus"), name = "bonus")})*/
public class Sales extends Manager{
	
	@Column(name="Comission")
	private Double commission;

	public Sales(String empName, Double empSal, Double bonus, Double commission) {
		super(empName, empSal, bonus);
		this.commission = commission;
	}

	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sales [commission=" + commission + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void setBonus(Double bonus) {
		// TODO Auto-generated method stub
		super.setBonus(bonus);
	}
	
	

	
	
	

}
