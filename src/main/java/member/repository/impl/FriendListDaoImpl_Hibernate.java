package member.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import init.HibernateUtils;
import member.model.FriendListBean;
import member.repository.FriendListDao;
@Repository
public class FriendListDaoImpl_Hibernate implements FriendListDao{
	@Autowired
	SessionFactory factory ;
	public FriendListDaoImpl_Hibernate() {
	
		
	}
	
	@SuppressWarnings("unchecked")
	public List<FriendListBean> getAllFriendList(String memberNo) {
		List<FriendListBean> friendList = null;
		Integer MemberNo = Integer.valueOf(memberNo);
		Session session = factory.getCurrentSession();
		String hql ="From FriendListBean fb WHERE fb.memberNo.memberNo =:memberNo and fb.accepted=:accepted";
		friendList = session.createQuery(hql).setParameter("memberNo", MemberNo).setParameter("accepted", 1).list();
		return friendList;
	}
	
	@SuppressWarnings("unchecked")
	public List<FriendListBean> getAllFriendRequest(String memberNo) {

		List<FriendListBean> friendList = null;
		Integer MemberNo = Integer.valueOf(memberNo);
		Session session = factory.getCurrentSession();
		String hql ="From FriendListBean fb WHERE fb.memberNo.memberNo =:memberNo and fb.accepted=:accepted";
		friendList = session.createQuery(hql).setParameter("memberNo", MemberNo).setParameter("accepted", 0).list();
		
		return friendList;
	}
	
	@SuppressWarnings("unchecked")
	public List <FriendListBean>getAllFriendConfirm(String memberNo) {

		List<FriendListBean> friendList = null;
		Integer MemberNo = Integer.valueOf(memberNo);
		Session session = factory.getCurrentSession();
		String hql ="From FriendListBean fb WHERE fb.friendNo.memberNo =:memberNo and fb.accepted=:accepted";
		friendList = session.createQuery(hql).setParameter("memberNo", MemberNo).setParameter("accepted", 0).list();
		
		
		return friendList;
	}
}
