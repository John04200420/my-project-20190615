package like.service;

import java.util.List;

import like.model.LikePostBean;

public interface LikePostService {
	public List<LikePostBean> getLikeByMemberNo(Integer memberNo);
	
}
