package jp.co.type.form;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AnswerForm {
	private List<String> point2lists;
	private List<String> point1lists;

	String resultType;
	int score;

	public List<String> getPoint2lists() {
		return point2lists;
	}
	public void setPoint2lists(List<String> point2lists) {
		this.point2lists = point2lists;
	}
	public List<String> getPoint1lists() {
		return point1lists;
	}
	public void setPoint1lists(List<String> point1lists) {
		this.point1lists = point1lists;
	}


	public AnswerForm TypeDiscriminateA(int drive,int volunteer) {
		AnswerForm TypeDiscriminateA = new AnswerForm();
		if(drive > volunteer) {
			TypeDiscriminateA.resultType = "drive";
			TypeDiscriminateA.score = drive;
			return TypeDiscriminateA;
		}else if(drive < volunteer) {
			TypeDiscriminateA.resultType = "volunteer";
			TypeDiscriminateA.score = volunteer;
			return TypeDiscriminateA;
		}else {
			TypeDiscriminateA.resultType = "drivevolunteer";
			TypeDiscriminateA.score = volunteer;
			return TypeDiscriminateA;
		}
	}



	public AnswerForm TypeDiscriminateB(int create,int analyze) {
		AnswerForm TypeDiscriminateB = new AnswerForm();
		if(create > analyze) {
			TypeDiscriminateB.resultType = "create";
			TypeDiscriminateB.score = create;
			return TypeDiscriminateB;
		}else if(create < analyze) {
			TypeDiscriminateB.resultType = "analyze";
			TypeDiscriminateB.score = analyze;
			return TypeDiscriminateB;
		}else {
			TypeDiscriminateB.resultType = "createanalyze";
			TypeDiscriminateB.score = analyze;
			return TypeDiscriminateB;
		}
	}

	public String TypeDiscriminate(AnswerForm TypeA,AnswerForm TypeB) {
		String result;
		if(TypeA.score > TypeB.score) {
			result = TypeA.resultType;
			return result;
		}else if(TypeA.score < TypeB.score) {
			result = TypeB.resultType;
			return result;
		}else {
			result = TypeA.resultType + TypeB.resultType;
			return result;
		}
	}

	public int TypeDiscriminate_num(String result) {
		int num;
		if(result.equals("drive")) {
			num =1;
			return num;
		}else if(result.equals("volunteer")) {
			num =2;
			return num;
		}else if(result.equals("create")) {
			num =3;
			return num;
		}else if(result.equals("analyze")) {
			num =4;
			return num;
		}else if(result.equals("driveanalyze")) {
			num =5;
			return num;
		}else if(result.equals("drivecreate")) {
			num =6;
			return num;
		}else if(result.equals("volunteeranalyze")) {
			num =7;
			return num;
		}else if(result.equals("volunteercreate")) {
			num =8;
			return num;
		}else {
			num =9;
			return num;
		}
	}

}