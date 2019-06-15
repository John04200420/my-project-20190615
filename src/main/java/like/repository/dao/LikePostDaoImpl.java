package like.repository.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import friend.model.FriendRequestBean;
import friend.repository.FriendRequestDao;
import like.model.LikePostBean;
import like.repository.LikePostDao;

@Repository
public class LikePostDaoImpl implements LikePostDao{
	@Autowired
	SessionFactory factory;
	
	public LikePostDaoImpl(){
	
	}
	
	@Override
	public List<LikePostBean> getLikeByMemberNo(Integer memberNo) {
		List<LikePostBean> likePostBeanList = null;
		Session session = factory.getCurrentSession();
		
		String hql ="From LikePostBean lpb WHERE lpb.pb.mb1.memberNo =:memberNo OR lpb.pb.mb2.memberNo =:memberNo";
		likePostBeanList = session.createQuery(hql).setParameter("memberNo", memberNo).list();
		
		return likePostBeanList;
	}

}
