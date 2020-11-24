package com.web.main.service;

import java.util.List;

import com.web.main.model.Participant;
import com.web.main.model.Question;

public interface ServiceI {
	
	public Participant addParticipant(Participant p);
	public List<Participant> getAdmin(String uname, String pass);
	public Question addQuestion(Question q);

}
