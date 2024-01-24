package com.onetomany.main.enteties;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="question1")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	
	private String qcontent;

	
	@OneToMany(targetEntity = Answer.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "question_id",referencedColumnName = "qid")
	private List<Answer> answer;
	
	
	public int getQid() {
		return qid;
	}


	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", answer=" + answer + ", qcontent=" + qcontent + "]";
	}

	
	
	
	
	

}
