package jp.co.type.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.type.Utils.CipherUtil;
import jp.co.type.dto.UserDto;
import jp.co.type.dto.factory.UserDtoFactory;
import jp.co.type.mapper.UsersMapper;

@Service
public class LoginService {
	@Autowired
	private UsersMapper usersMapper;
	@Autowired
	private UserDtoFactory userDtoFactory;

	public UserDto login(String login_id, String password) {

		UserDto userDto = userDtoFactory.create(usersMapper.getUser(login_id, CipherUtil.encrypt(password)));
		return userDto;
	}

}
