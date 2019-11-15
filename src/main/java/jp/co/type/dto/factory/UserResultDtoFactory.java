package jp.co.type.dto.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.type.dto.UserResultDto;
import jp.co.type.entity.UserResult;




	@Component
	public class UserResultDtoFactory {
		public UserResultDto create (UserResult userResult) {
			if(userResult == null) {
				return null;
			}
			return new UserResultDto(
					userResult.getId(),
					userResult.getLogin_id(),
					userResult.getName(),
					userResult.getResult_type(),
					userResult.getResult_id(),
					userResult.getDrivescore(),
					userResult.getAnalyzescore(),
					userResult.getCreatescore(),
					userResult.getVolunteerscore(),
					userResult.getCreatedAt(),
					userResult.getUpdatedAt(),
					userResult.getType_name()
					);
		}

		public List<UserResultDto> create (List<UserResult> userResults) {
			List<UserResultDto> lists = new ArrayList<UserResultDto>();
			for(UserResult userResult : userResults) {
				lists.add(create(userResult));
			}

			return lists;
		}

}
