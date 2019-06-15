package like.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import like.model.LikePostBean;
import like.repository.LikePostDao;
import like.service.LikePostService;
import register.model.MemberBean;
import register.repository.MemberDao;

@Service
public class LikePostServiceImpl implements LikePostService {
	@Autowired
	LikePostDao dao;
	
	@Override
	@Transactional
	public List<LikePostBean> getLikeByMemberNo(Integer memberNo) {
		List<LikePostBean> lpb =null;

		lpb = dao.getLikeByMemberNo(memberNo);

     return lpb;
	}

}
