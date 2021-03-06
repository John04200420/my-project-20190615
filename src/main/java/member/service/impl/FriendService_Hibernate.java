package member.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import init.HibernateUtils;
import member.model.FriendListBean;
import member.repository.FriendListDao;
import member.repository.impl.FriendListDaoImpl_Hibernate;
import member.service.OldFriendService;
import register.model.MemberBean;
@Service
public class FriendService_Hibernate implements OldFriendService{
		@Autowired
		FriendListDao dao  ;
		
	public FriendService_Hibernate() {
	
	}
	@Transactional
	@Override
	public List<FriendListBean> getAllFriendList(String memberNo) {
		List<FriendListBean> friendList =null;

			friendList = dao.getAllFriendList(memberNo);

		return friendList;
	}
	@Transactional
	@Override
	public List<FriendListBean> getAllFriendRequest(String memberNo) {
		List<FriendListBean> friendList =null;

			friendList = dao.getAllFriendRequest(memberNo);

		return friendList;
	}
	@Transactional
	@Override
	public List<FriendListBean> getAllFriendConfirm(String memberNo) {
		List<FriendListBean> friendList =null;

			friendList = dao.getAllFriendConfirm(memberNo);

		return friendList;
	}

}
