package like.repository;

import java.util.List;

import like.model.LikeRecordBean;

public interface LikeRecordDao {

	public List<LikeRecordBean> getLikeByMemberNo(Integer memberNo);

}
