package net.togogo.talent.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import net.togogo.talent.domain.TbRecruit;
import net.togogo.talent.domain.TbRecruitExample;
import net.togogo.talent.mapper.TbRecruitMapper;
import net.togogo.talent.service.ITbRecruitService;
@Service("tbRecruitService")
public class TbRecruitServiceImpl implements ITbRecruitService {

	@Resource
	private TbRecruitMapper tbRecruitMapper ;
	
	/**
	 * 获取首页的招聘内容
	 */
	@Override
	public List<TbRecruit> selectByExample(TbRecruitExample example) {
		PageHelper.startPage(1, 8);
		Page<TbRecruit> listpage = (Page<TbRecruit>)tbRecruitMapper.selectByExample(example);
//		for (TbRecruit tbRecruit : listpage) {
//			System.out.println(tbRecruit);
//		}
		return listpage;
	}
	
	/**
	 * 获取更多招聘信息,pageIndex是页码,pageSize是页面的大小
	 */
	@Override
	public List<TbRecruit> selectMoreByExample(TbRecruitExample example, int pageIndex, int pageSize) {
		// 加载下一页
		PageHelper.startPage(pageIndex, pageSize);
		Page<TbRecruit> listpage = (Page<TbRecruit>)tbRecruitMapper.selectByExample(example);
//		for (TbRecruit tbRecruit : listpage) {
//			System.out.println(tbRecruit);
//		}
		return listpage;
	}

}
