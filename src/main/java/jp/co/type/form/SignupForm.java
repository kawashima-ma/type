package jp.co.type.form;

import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SignupForm {
	@NotEmpty(message = "ログインIDを入力してください")
	@Size(min = 6, max = 20,message = "ログインIDを、6~20文字以下で入力して下さい")
	@Pattern(regexp = "[a-zA-Z0-9]+")

	private String login_id;
	@NotEmpty(message = "名前を入力してください")
	@Size(min = 6, max = 20,message = "名前を、6~20文字以下で入力して下さい")
	@Pattern(regexp = "[a-zA-Z0-9]+")

	private String name;
	@NotEmpty(message = "パスワードを入力してください")
	@Size(min = 6, max = 20,message = "パスワードを、6~20文字以下で入力して下さい")
	@Pattern(regexp = "[a-zA-Z0-9]+")
	private String password;


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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}