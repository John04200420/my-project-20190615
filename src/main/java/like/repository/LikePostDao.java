package like.repository;

import java.util.List;

import like.model.LikePostBean;

public interface LikePostDao {

	public List<LikePostBean> getLikeByMemberNo(Integer memberNo);

}
