package jp.co.type.form;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginForm {
	@NotEmpty
	private String login_id;
	@NotEmpty
	private String password;

	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
