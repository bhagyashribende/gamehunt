package com.web.main.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Participant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;

	private String pname;
	private int age;
	private String mob;
	private String uname;
	private String pass;
	
	/*
	 * @OneToMany private Question question;
	 */
	

}
