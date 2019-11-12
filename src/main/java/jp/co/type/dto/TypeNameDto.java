package jp.co.type.dto;

public class TypeNameDto {
	private Integer id;
	private String type_name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public TypeNameDto(Integer id, String type_name) {
		super();
		this.id = id;
		this.type_name = type_name;
	}


}
