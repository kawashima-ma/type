package jp.co.type.dto.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.type.dto.UserDto;
import jp.co.type.entity.User;

@Component
public class UserDtoFactory {
	public UserDto create (User user) {
		if(user == null) {
			return null;
		}
		return new UserDto(
				user.getId(),
				user.getLogin_id(),
				user.getName(),
				user.getPassword(),
				user.getResult_type()
				);
	}

	public List<UserDto> create(List<User> users){
		List<UserDto> list = new ArrayList<UserDto>();
		for(User user : users) {
			list.add(create(user));
		}

		return list;
	}
}
