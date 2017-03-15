package net.togogo.talent.service;

import net.togogo.talent.domain.TbResume;
import net.togogo.talent.domain.TbUser;

public interface ITbUserResumeService {

	int  insert(TbUser user,TbResume resume);
}
