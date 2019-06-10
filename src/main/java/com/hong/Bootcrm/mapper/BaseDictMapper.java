package com.hong.Bootcrm.mapper;

import java.util.List;

import com.hong.Bootcrm.pojo.BaseDict;

public interface BaseDictMapper {

	// 根据类别代码查询数据字典
	public List<BaseDict> selecBaseDictListByTypeCode(String typecode);

}
