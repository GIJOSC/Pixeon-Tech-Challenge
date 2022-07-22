package com.pixeon.pixeonchallenge.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_exam")
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String HealthcareInstitution;	
	private String PatientName;
	private Integer PatientAge;
	private String PatientGender;
	private String PhysicianName;
	private Integer PhysicianCRM;
	private Integer ProcedureName;
	
	public Exam() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHealthcareInstitution() {
		return HealthcareInstitution;
	}

	public void setHealthcareInstitution(String healthcareInstitution) {
		HealthcareInstitution = healthcareInstitution;
	}

	public String getPatientName() {
		return PatientName;
	}

	public void setPatientName(String patientName) {
		PatientName = patientName;
	}

	public Integer getPatientAge() {
		return PatientAge;
	}

	public void setPatientAge(Integer patientAge) {
		PatientAge = patientAge;
	}

	public String getPatientGender() {
		return PatientGender;
	}

	public void setPatientGender(String patientGender) {
		PatientGender = patientGender;
	}

	public String getPhysicianName() {
		return PhysicianName;
	}

	public void setPhysicianName(String physicianName) {
		PhysicianName = physicianName;
	}

	public Integer getPhysicianCRM() {
		return PhysicianCRM;
	}

	public void setPhysicianCRM(Integer physicianCRM) {
		PhysicianCRM = physicianCRM;
	}

	public Integer getProcedureName() {
		return ProcedureName;
	}

	public void setProcedureName(Integer procedureName) {
		ProcedureName = procedureName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exam other = (Exam) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", HealthcareInstitution=" + HealthcareInstitution + ", PatientName=" + PatientName
				+ ", PatientAge=" + PatientAge + ", PatientGender=" + PatientGender + ", PhysicianName=" + PhysicianName
				+ ", PhysicianCRM=" + PhysicianCRM + ", ProcedureName=" + ProcedureName + "]";
	}	

}
