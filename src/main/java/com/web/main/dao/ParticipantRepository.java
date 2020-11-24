package com.web.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.main.model.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Integer>{
   List<Participant> findByUnameAndPass(String uname,String pass);
}
