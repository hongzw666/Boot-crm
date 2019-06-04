package com.hong.Bootcrm.mapper;

import java.util.List;

import com.hong.Bootcrm.pojo.BaseDict;

public interface BaseDictMapper {
	//
	public List<BaseDict> selecBaseDictListByTypeCode(String typeCode);
	
}
