package jp.co.type.entity;

public class Answer {
	private Integer id;
	private Integer question_id;
	private String drive_ans;
	private String analyze_ans;
	private String create_ans;
	private String volunteer_ans;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(Integer question_id) {
		this.question_id = question_id;
	}
	public String getDrive_ans() {
		return drive_ans;
	}
	public void setDrive_ans(String drive_ans) {
		this.drive_ans = drive_ans;
	}
	public String getAnalyze_ans() {
		return analyze_ans;
	}
	public void setAnalyze_ans(String analyze_ans) {
		this.analyze_ans = analyze_ans;
	}
	public String getCreate_ans() {
		return create_ans;
	}
	public void setCreate_ans(String create_ans) {
		this.create_ans = create_ans;
	}
	public String getVolunteer_ans() {
		return volunteer_ans;
	}
	public void setVolunteer_ans(String volunteer_ans) {
		this.volunteer_ans = volunteer_ans;
	}



}
