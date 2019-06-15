package comment.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import post.model.PostBean;
import register.model.MemberBean;

@Entity
@Table(name="comment")
public class CommentBean {
	private Integer CommentNo;
	private MemberBean mb;
	private PostBean pb;
	private String commentText;
	private Timestamp creationDateTime;
	private String ip;
	
	public CommentBean() {
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getCommentNo() {
		return CommentNo;
	}
	public void setCommentNo(Integer commentNo) {
		CommentNo = commentNo;
	}
	
	@ManyToOne
	@JoinColumn(name="memberNo", nullable=false)
	public MemberBean getMb() {
		return mb;
	}
	public void setMb(MemberBean mb) {
		this.mb = mb;
	}
	
	@ManyToOne
	@JoinColumn(name="postNo", nullable=false)
	public PostBean getPb() {
		return pb;
	}
	public void setPb(PostBean pb) {
		this.pb = pb;
	}

	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public Timestamp getCreationDateTime() {
		return creationDateTime;
	}
	public void setCreationDateTime(Timestamp creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
	
}
