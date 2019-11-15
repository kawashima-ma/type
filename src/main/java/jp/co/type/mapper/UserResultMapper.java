package jp.co.type.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import jp.co.type.entity.UserResult;
//import jp.co.noticeboard.entity.UserManagement;

@Component
public interface UserResultMapper {


	UserResult getUserResultById(@Param("id") Integer id);

	List<UserResult> getUserResultAll(@Param("id") Integer id);
}