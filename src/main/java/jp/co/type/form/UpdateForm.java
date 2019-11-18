package jp.co.type.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UpdateForm {

	@NotEmpty(message = "名前を入力してください")
	@Size(max = 20,message = "名前を、20文字以下で入力して下さい")
	private String name;
	@NotEmpty(message = "ログインIDを入力してください")
	@Size(min = 6, max = 20,message = "ログインIDを、6~20文字以下で入力して下さい")
	@Pattern(regexp = "[a-zA-Z0-9]+",message = "ログインIDを半角英数字で入力して下さい")
	private String login_id;
	@NotEmpty(message = "パスワードを入力してください")
	@Size(min = 6, max = 20,message = "パスワードを、6~20文字以下で入力して下さい")
	@Pattern(regexp = "^[0-9a-zA-Z]+$",message = "パスワードを半角英数字で入力して下さい")
	private String password;
	@NotEmpty(message = "パスワードを入力してください")
	private String confirm_password;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}


}
