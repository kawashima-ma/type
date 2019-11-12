package jp.co.type.dto.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.type.dto.TypeNameDto;
import jp.co.type.entity.TypeName;

@Component
public class TypeNameDtoFactory {
	public TypeNameDto create (TypeName typeName) {
		return new TypeNameDto(
				typeName.getId(),
				typeName.getType_name()
				);
	}

	public List<TypeNameDto> create(List<TypeName> names){
		List<TypeNameDto> list = new ArrayList<TypeNameDto>();
		for(TypeName name : names) {
			list.add(create(name));
		}

		return list;

	}

}
