package com.moon.manager.module.service.impl;

import com.moon.manager.constant.CommonConstant;
import com.moon.manager.module.po.Type;
import com.moon.manager.module.service.TypeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.moon.manager.module.po.Jargon;
import com.moon.manager.module.mapper.JargonMapper;
import com.moon.manager.module.service.JargonService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @Project: manager
* @Package com.moon.manager.module.service.impl
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年03月31日 19:52
* @version V1.0
*/
@Service
@Slf4j
public class JargonServiceImpl implements JargonService
{

	@Resource
	private JargonMapper jargonMapper;

	@Resource
	private TypeService typeService;

	/**
	 * 返回 type 对应的 id
	 * @param type
	 * @return
	 */
	private int checkType(String type)
	{

		if (StringUtils.isBlank(type))
		{
			log.error("type  类型 为 null");
			return 0;
		}
		Type typeRecord = typeService.selectByType(type);
		if (typeRecord != null)
		{
			log.info(" typeRecord 不为 null：{}", typeRecord);
			return typeRecord.getId();
		}
		return typeService.insert(type);
	}

	@Override
	public int deleteByPrimaryKey(Integer id)
	{
		Jargon jargon = new Jargon();
		jargon.setId(id);
		jargon.setDataIsDeleted((byte) 1);
		return jargonMapper.updateByPrimaryKeySelective(jargon);
	}

	@Override
	@Transactional
	public int insert(Jargon record)
	{
		int typeId = 0;
		if (StringUtils.isNotBlank(record.getType()))
		{
			typeId = checkType(record.getType());
		}
		log.info(" typeRecord id：{}", typeId);
		if (typeId == 0)
		{
			return 0;
		}
		record.setTypeId(typeId);
		log.info("插入 行话记录， 内容： {}", record);
		record.setDataIsDeleted(CommonConstant.DATA_NOT_DELETE);
		return jargonMapper.insert(record);
	}

	@Override
	public int insertSelective(Jargon record)
	{
		return jargonMapper.insertSelective(record);
	}

	@Override
	public Jargon selectByPrimaryKey(Integer id)
	{
		return jargonMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Jargon record)
	{
		return jargonMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Jargon record)
	{
		return jargonMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Jargon> listAllJargon()
	{
		return jargonMapper.listAllJargon();
	}

}
