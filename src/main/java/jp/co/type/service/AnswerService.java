package jp.co.type.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.type.dto.AnswerDto;
import jp.co.type.entity.Answer;
import jp.co.type.mapper.AnswerMapper;

@Service
public class AnswerService {

	@Autowired
	private AnswerMapper answerMapper;

	public List<AnswerDto> getAnswer() {
	    List<Answer> answerList = answerMapper.getAnswer();
	    List<AnswerDto> resultList = convertToDto(answerList);
	    return resultList;
	}

	private List<AnswerDto> convertToDto(List<Answer> answerList) {
	    List<AnswerDto> resultList = new LinkedList<AnswerDto>();
	    for (Answer entity : answerList) {
	        AnswerDto dto = new AnswerDto();
	        BeanUtils.copyProperties(entity, dto);
	        resultList.add(dto);
	    }
	    return resultList;
	}
}
