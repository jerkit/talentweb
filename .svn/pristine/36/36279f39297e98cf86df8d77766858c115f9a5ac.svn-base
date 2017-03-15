package net.togogo.talent.service;

import java.util.List;

import net.togogo.talent.domain.TbRecruit;
import net.togogo.talent.domain.TbRecruitExample;

/**
 * 
 * @author chenxing
 *
 */
public interface ITbRecruitService {

	//获取首页的招聘列表
	List<TbRecruit> selectByExample(TbRecruitExample example);

	//获取更多招聘信息列表,pageIndex是页码,pageSize是页面的大小
	public List<TbRecruit> selectMoreByExample(TbRecruitExample example, int pageIndex, int pageSize);
	
}
