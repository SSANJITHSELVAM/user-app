package onetoone.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.Query;

public class AnswerDataByQuestionid {
public static void main(String[] args) {
	String jpql="select q.answer from QuestionData q where q.id=?1";
	EntityManager  manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the question");
	int qid=sc.nextInt();
	Query q=m.create
}
}
