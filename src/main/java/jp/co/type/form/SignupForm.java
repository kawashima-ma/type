package jp.co.type.form;

import org.hibernate.validator.constraints.NotEmpty;

public class SignupForm {
	@NotEmpty//空欄のとき無効
	private String login_id;
	@NotEmpty
	private String name;
	@NotEmpty
	private String password;
	@NotEmpty
	private Integer result_type;


	public String getLoginId() {
		return login_id;
	}

	public void setLoginId(String login_id) {
		this.login_id = login_id;
	}

	public String getName() {
		return name;
	}

	public void setNName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer result_type() {
		return result_type;
	}

	public void setResult_type(Integer result_type) {
		this.result_type = result_type;
	}
}