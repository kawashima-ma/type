package jp.co.type.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import jp.co.type.entity.User;
@Component
public interface UsersMapper {
	User getUser (@Param("login_id")String login_id, @Param("password")String password);

	List<User> getAll();
}
