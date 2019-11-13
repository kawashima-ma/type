package jp.co.type.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.type.entity.TypeName;

@Component
public interface TypeNamesMapper {
	List<TypeName> getAll();

}
