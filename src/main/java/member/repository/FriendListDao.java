package member.repository;

import java.util.List;

import member.model.FriendListBean;

public interface FriendListDao {
	public List<FriendListBean> getAllFriendList(String memberNo);
	public List<FriendListBean> getAllFriendRequest(String memberNo);
	public List<FriendListBean> getAllFriendConfirm(String memberNo);
	
}
