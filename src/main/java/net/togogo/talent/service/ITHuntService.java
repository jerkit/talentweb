package net.togogo.talent.service;

import java.util.List;

import net.togogo.talent.domain.TbHunt;
import net.togogo.talent.domain.TbHuntExample;

public interface ITHuntService {
	List<TbHunt> selectByExample(TbHuntExample tbHuntExample);
	int deleteByExample(TbHuntExample tbHuntExample);
}
