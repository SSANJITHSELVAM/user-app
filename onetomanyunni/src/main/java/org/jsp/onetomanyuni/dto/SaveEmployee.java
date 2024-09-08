package org.jsp.onetomanyuni.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {
	
		public static void main(String [] args){
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	QuestionData q = new QuestionData();
	q.setQuestion("what is hibernate?");
	q.setQuestionedBy("sathish");
	AnswerData a1=new AnswerData();
	a1.setAnswer("Hibernate ");

	AnswerData a2=new AnswerData();
	a1.setAnswer("stop wasting time on it");

	List<AnswerData>answers = new ArrayList<AnswerData>();
	answers.add(a1);
	answers.add(a2);
	q.setAnswer(answers); // Assigning answers to Question

	manager.persist(q);
	transaction.begin();
	transaction.commit();
	}
}
