package com.web.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.main.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

}
