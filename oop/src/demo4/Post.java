package demo4;

import java.util.Date;

public class Post {

	private int no;					// 번호
	private String title;			// 제목
	private String name;			// 작성자 아이디 writerId
	private String content;			// 내용
	private int goodCount;			// 추천수(좋아요 수) likeCount
	private int reviewCount;		// 리뷰 수
	private double reviewAverage;	// 리뷰 점수(평점)	reviewScore
	private boolean isDeleted;		// 삭제 여부
	private Date writeDate;			// 생성일자 createdDate
	private Date modifyDate;		// 수정일자 updatedDate
	private Date deleteDate;		// 삭제일자 deletedDate
	
	public Post() {
		
	}
	
	public Post(int no, String title, String name, String content) {
		super();
		this.no = no;
		this.title = title;
		this.name = name;
		this.content = content;
	}

	public Post(int no, String title, String name, String content, int goodCount, int reviewCount, double reviewAverage,
			boolean isDeleted, Date writeDate, Date modifyDate, Date deleteDate) {
		super();
		this.no = no;
		this.title = title;
		this.name = name;
		this.content = content;
		this.goodCount = goodCount;
		this.reviewCount = reviewCount;
		this.reviewAverage = reviewAverage;
		this.isDeleted = isDeleted;
		this.writeDate = writeDate;
		this.modifyDate = modifyDate;
		this.deleteDate = deleteDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getGoodCount() {
		return goodCount;
	}

	public void setGoodCount(int goodCount) {
		this.goodCount = goodCount;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public double getReviewAverage() {
		return reviewAverage;
	}

	public void setReviewAverage(double reviewAverage) {
		this.reviewAverage = reviewAverage;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	
	
	
	
	

}
