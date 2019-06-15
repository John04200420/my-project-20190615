package like.service;

import java.util.List;

import like.model.LikeRecordBean;

public interface LikeRecordService {
	public List<LikeRecordBean>  getLikeByMemberNo(Integer memberNo);
	
}
