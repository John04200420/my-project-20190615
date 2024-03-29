package post.service;

import java.util.List;

import post.model.PostBean;

public interface PostService {
	public PostBean getPostDetailBean(String postNo);
	public List<PostBean> getAllPosts();
	public int savePost(PostBean pb);
	public int updatePostMemberNo2(Integer postNo, Integer memberNo2);
	public List<PostBean> getAllDonePosts();
	//public List<PostBean> getAllDonecooperation();
	public List<PostBean> getAllCooperation();
	public List<PostBean> getPostsByMemberNo(int memberNo);
}
