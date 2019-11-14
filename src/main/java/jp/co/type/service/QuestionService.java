package jp.co.type.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.type.dto.QuestionDto;
import jp.co.type.entity.Question;
import jp.co.type.mapper.QuestionMapper;

@Service
public class QuestionService {

	@Autowired
	private QuestionMapper questionMapper;

	public List<QuestionDto> getQuestion() {
	    List<Question> questionList = questionMapper.getQuestion();
	    List<QuestionDto> resultList = convertToDto(questionList);
	    return resultList;
	}

	private List<QuestionDto> convertToDto(List<Question> questionList) {
	    List<QuestionDto> resultList = new LinkedList<QuestionDto>();
	    for (Question entity : questionList) {
	        QuestionDto dto = new QuestionDto();
	        BeanUtils.copyProperties(entity, dto);
	        resultList.add(dto);
	    }
	    return resultList;
	}
}
