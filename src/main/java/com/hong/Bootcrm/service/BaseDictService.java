package com.hong.Bootcrm.service;

import java.util.List;
import com.hong.Bootcrm.pojo.BaseDict;

public interface BaseDictService {
	//根据类别代码查询数据字典
	public List<BaseDict> findBaseDictByTypeCode(String typecode);
}
