package com.web.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.main.dao.ParticipantRepository;
import com.web.main.dao.QuestionRepository;
import com.web.main.model.Participant;
import com.web.main.model.Question;


@Service
public class ServiceImpl implements ServiceI {
	
	@Autowired
	private ParticipantRepository pr;
	
	@Autowired
	private QuestionRepository qr;

	@Override
	public Participant addParticipant(Participant p) {
		Participant participant=pr.save(p);
		return participant;
	}

	@Override
	public List<Participant> getAdmin(String uname, String pass) {
		
		List<Participant> p=pr.findByUnameAndPass(uname, pass);
		
		return p;
	}

	@Override
	public Question addQuestion(Question q) {
		Question question=qr.save(q);
		return question;
	}

}
