package member.service;

import java.util.List;

import member.model.FriendListBean;

public interface OldFriendService {
	
	public List<FriendListBean> getAllFriendList(String memberNo);
	
	public List<FriendListBean> getAllFriendRequest(String memberNo);
	
	public List<FriendListBean> getAllFriendConfirm(String memberNo);
	
}
