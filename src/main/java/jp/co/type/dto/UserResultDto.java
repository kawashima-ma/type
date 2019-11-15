package jp.co.type.dto;
import java.util.Date;
public class UserResultDto {
	private Integer id;
	private String login_id;
	private String name;
	private Integer result_type;
	private Integer drivescore;
	private Integer analyzescore;
	private Integer createscore;
	private Integer volunteerscore;
	private Date createdAt;
	private Date updatedAt;
	private String type_name;
	private Integer result_id;

	public UserResultDto(Integer id, String login_id, String name, Integer result_type,Integer result_id,Integer drivescore, Integer analyzescore, Integer createscore, Integer volunteerscore,Date createdAt,Date updatedAt,String type_name) {
		this.id = id;
		this.login_id = login_id;
		this.name = name;
		this.result_type = result_type;
		this.result_id = result_id;
		this.drivescore = drivescore;
		this.analyzescore = analyzescore;
		this.createscore = createscore;
		this.volunteerscore = volunteerscore;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.type_name = type_name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getResult_type() {
		return result_type;
	}
	public void setResult_type(Integer result_type) {
		this.result_type = result_type;
	}
	public Integer getDrivescore() {
		return drivescore;
	}
	public void setDrivescore(Integer drivescore) {
		this.drivescore = drivescore;
	}
	public Integer getAnalyzescore() {
		return analyzescore;
	}
	public void setAnalyzescore(Integer analyzescore) {
		this.analyzescore = analyzescore;
	}
	public Integer getCreatescore() {
		return createscore;
	}
	public void setCreatescore(Integer createscore) {
		this.createscore = createscore;
	}
	public Integer getVolunteerscore() {
		return volunteerscore;
	}
	public void setVolunteerscore(Integer volunteerscore) {
		this.volunteerscore = volunteerscore;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public Integer getResult_id() {
		return result_id;
	}

	public void setResult_id(Integer result_id) {
		this.result_id = result_id;
	}
}
