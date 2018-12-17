package src.com.jp.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "MGR_TPC")
/*@AttributeOverrides({

		@AttributeOverride(column = @Column(name = "EMP_ID"), name = "empId"),
		@AttributeOverride(column = @Column(name = "EMP_NAME"), name = "empName"),
		@AttributeOverride(column = @Column(name = "EMP_SALARY"), name = "empSal") })
*/
@DiscriminatorValue(value="MGR")
public class Manager extends Employee {

	
	@Column(name = "Bonus")
	private Double bonus;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String empName, Double empSal, Double bonus) {

		super(empName, empSal);
		this.bonus = bonus;
	}

	public Double getBonus() {
		return super.getEmpSal() + bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	@Override
	public Double getEmpSal() {
		// TODO Auto-generated method stub
		return super.getEmpSal()+bonus;
	}

}
