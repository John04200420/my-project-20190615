package like.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import like.model.LikePostBean;
import like.model.LikeRecordBean;
import like.repository.LikePostDao;
import like.repository.LikeRecordDao;
import like.service.LikeRecordService;

@Service
public class LikeRecordServiceImpl implements LikeRecordService {
	@Autowired
	LikeRecordDao dao;
	
	@Override
	@Transactional
	public List<LikeRecordBean> getLikeByMemberNo(Integer memberNo) {
		List<LikeRecordBean> lrb =null;

		lrb = dao.getLikeByMemberNo(memberNo);

     return lrb;
	}
}
