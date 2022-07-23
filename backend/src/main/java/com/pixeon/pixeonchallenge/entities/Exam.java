package com.pixeon.pixeonchallenge.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_exam")
public class Exam implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String HealthcareInstitution;
	
	@Column(nullable = false)
	private String PatientName;
	
	@Column(nullable = false)
	private Long PatientAge;
	
	@Column(nullable = false)
	private String PatientGender;
	
	@Column(nullable = false)
	private String PhysicianName;
	
	@Column(nullable = false)
	private Long PhysicianCRM;
	
	@Column(nullable = false)
	private String ProcedureName;
	
	public Exam() {
		
	}

	public Exam(long l, String string) {
		// TODO Auto-generated constructor stub
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

	public Long getPatientAge() {
		return PatientAge;
	}

	public void setPatientAge(Long patientAge) {
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

	public Long getPhysicianCRM() {
		return PhysicianCRM;
	}

	public void setPhysicianCRM(Long physicianCRM) {
		PhysicianCRM = physicianCRM;
	}

	public String getProcedureName() {
		return ProcedureName;
	}

	public void setProcedureName(String procedureName) {
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
