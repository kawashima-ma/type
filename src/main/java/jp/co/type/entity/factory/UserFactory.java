package jp.co.type.entity.factory;

import org.springframework.stereotype.Component;

import jp.co.type.dto.UserDto;
import jp.co.type.entity.User;
import jp.co.type.Utils.CipherUtil;

@Component
public class UserFactory {


//	public User create(UserDto dto) {
//		return new User(
//				dto.getLogin_id(),
//				dto.getName(),
//				dto.getPassword()
//				);
//	}


	public User createEncrypt(UserDto dto) {
		return new User(
				dto.getLogin_id(),
				dto.getName(),
				CipherUtil.encrypt(dto.getPassword())
				);
	}
}