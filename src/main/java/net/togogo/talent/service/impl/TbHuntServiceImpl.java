package net.togogo.talent.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.togogo.talent.domain.TbHunt;
import net.togogo.talent.domain.TbHuntExample;
import net.togogo.talent.mapper.TbHuntMapper;
import net.togogo.talent.service.ITHuntService;

@Service("tbHuntService")
public class TbHuntServiceImpl implements ITHuntService{

	@Resource
	TbHuntMapper tbHuntMapper;
	@Override
	public List<TbHunt> selectByExample(TbHuntExample tbHuntExample) {
		// TODO Auto-generated method stub
		return tbHuntMapper.selectByExample(tbHuntExample);
	}
	@Override
	public int deleteByExample(TbHuntExample tbHuntExample) {
		// TODO Auto-generated method stub
		return tbHuntMapper.deleteByExample(tbHuntExample);
	}
	
}
