package com.hackathon3.back_server.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Member {

	private @Id @GeneratedValue @Column(name = "member_id") Long id;
	private String name;
	private String username;
	private String password;
	private String grade;
	private int age;
	private String job;
	private String investOpt;
	private int salary;
	private int property;
	private String profile;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "member",cascade = CascadeType.ALL)
	private List<Stock> stocks = new ArrayList<>();
	
	@Override
	public boolean equals(Object o) {

	    if (this == o)
	      return true;
	    if (!(o instanceof Member))
	      return false;
	    Member member = (Member) o;
	    return Objects.equals(this.id, member.id) && Objects.equals(this.name, member.name)
	    	&& Objects.equals(this.username, member.username) && Objects.equals(this.password, member.password)
	    	&& Objects.equals(this.grade, member.grade) && Objects.equals(this.age, member.age)
	        && Objects.equals(this.job, member.job) && Objects.equals(this.investOpt, member.investOpt)
	        && Objects.equals(this.salary, member.salary) && Objects.equals(this.property, member.property)
	        && Objects.equals(this.profile, member.profile);
	}
	
	@Override
	public int hashCode() {
	    return Objects.hash(this.id, this.name, this.username, this.password, this.grade, this.age, this.job, this.investOpt, this.salary
	    		, this.property, this.profile);
	}
	
	@Override
	public String toString() {
	    return "Member{" + "id=" + this.id + ", name='" + this.name + '\'' + ", username='" + this.username + '\''
	    		+ ", password='" + this.password + '\'' + ", grade='" + this.grade + '\''
	    		+ ", age='" + this.age + '\'' + ", job='" + this.job + '\'' 
	    		+ ", investOpt='" + this.investOpt + '\'' + ", salary='" + this.salary + '\''
	    		+ ", property='" + this.property + '\'' + ", profile='" + this.profile + '\'' + '}';
	}
	
//	Member() {}
//	
//	Member(String name, String grade, int age, String job, String investOpt, int salary, int property, String profile) {
//	
//	    this.name = name;
//	    this.grade = grade;
//	    this.age = age;
//	    this.job = job;
//	    this.investOpt = investOpt;
//	    this.salary = salary;
//	    this.property = property;
//	    this.profile = profile;
//	}
//
//	public Long getId() {
//	    return this.id;
//	}
//
//	public String getName() {
//	    return this.name;
//	}
//	
//	public String getGrade() {
//		return this.grade;
//	}
//
//	public int getAge() {
//	    return this.age;
//	}
//	
//	public String getJob() {
//		return this.job;
//	}
//	
//	public String getInvestOpt() {
//		return this.investOpt;
//	}
//	
//	public int getSalary() {
//		return this.salary;
//	}
//	
//	public int getProperty() {
//		return this.property;
//	}
//	
//	public String getProfile() {
//		return this.profile;
//	}
//
//	public void setId(Long id) {
//	    this.id = id;
//	}
//
//	public void setName(String name) {
//	    this.name = name;
//	}
//	
//	public void setGrade(String grade) {
//		this.grade = grade;
//	}
//
//	public void setAge(int age) {
//	    this.age = age;
//	}
//	
//	public void setJob(String job) {
//		this.job = job;
//	}
//	
//	public void setInvestOpt(String investOpt) {
//		this.investOpt = investOpt;
//	}
//	
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//	
//	public void setProperty(int property) {
//		this.property = property;
//	}
//	
//	public void setProfile(String profile) {
//		this.profile = profile;
//	}
}
