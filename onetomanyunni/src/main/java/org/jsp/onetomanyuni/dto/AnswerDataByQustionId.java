package org.jsp.onetomanyuni.dto;

import java.util.Scanner;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class AnswerDataByQustionId {
	
		public static void main(String [] args){
			String qry = "select q.answers from QuestionData q where q.id = ?1";
			EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
			Scanner s= new Scanner(System.in);
			System.out.println("enter the question id to fetch answers");
			int qid=s.nextInt();
			Query q = manager.createQuery(qry);
			q.setParameter(1, qid);
			List<AnswerData> answers = q.getResultList();
			if( answers.size() >0){
				for(AnswerData a:answers){
					System.out.println("Question id"+a.getId());
					System.out.println("Question "+a.getQuestion());
					System.out.println("Question "+a.getQuestionedBy());
				}
			}
			else{
			}
		}
	}