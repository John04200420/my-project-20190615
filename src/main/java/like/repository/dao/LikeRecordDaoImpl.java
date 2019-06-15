package like.repository.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import like.model.LikePostBean;
import like.model.LikeRecordBean;
import like.repository.LikeRecordDao;
@Repository
public class LikeRecordDaoImpl implements LikeRecordDao{
	@Autowired
	SessionFactory factory;
	
	public LikeRecordDaoImpl(){
	
	}
	
	@Override
	public List<LikeRecordBean> getLikeByMemberNo(Integer memberNo) {
		List<LikeRecordBean> ikeRecordBeanList = null;
		Session session = factory.getCurrentSession();
		
		String hql ="From LikeRecordBean lrb WHERE lrb.rb.mb.memberNo =:memberNo OR lrb.rb.mb.memberNo =:memberNo";
		ikeRecordBeanList = session.createQuery(hql).setParameter("memberNo", memberNo).list();
		
		return ikeRecordBeanList;
	}

}
