package com.hong.Bootcrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hong.Bootcrm.mapper.BaseDictMapper;
import com.hong.Bootcrm.pojo.BaseDict;
import com.hong.Bootcrm.service.BaseDictService;

@Service("baseDictService")
@Transactional
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictMapper baseDictMapper;

	// 根据类别代码查询数据字典
	@Override
	public List<BaseDict> findBaseDictByTypeCode(String typecode) {

		return baseDictMapper.selecBaseDictListByTypeCode(typecode);
	}

}
