package jp.co.type.mapper;

import org.apache.ibatis.annotations.Param;

public interface ResultAnswerMapper {

	void insert(@Param("user_id")int user_id, @Param("driveScore")int driveScore, @Param("analyzeScore")int analyzeScore,
			@Param("createScore")int createScore, @Param("volunteerScore")int volunteerScore);
}
