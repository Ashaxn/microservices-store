package model;

public class Review {
	private int id;
	private String title;
	private String details;
	private int sellerId;
	private int submiterId;
	private String sumbitedAt;
	private String updatedAt;
	
	public Review() {
		super();
	}

	public Review(String title, String details, int sellerId, int submiterId) {
		super();
		this.title = title;
		this.details = details;
		this.sellerId = sellerId;
		this.submiterId = submiterId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public int getSubmiterId() {
		return submiterId;
	}

	public void setSubmiterId(int submiterId) {
		this.submiterId = submiterId;
	}

	public String getSumbitedAt() {
		return sumbitedAt;
	}

	public void setSumbitedAt(String sumbitedAt) {
		this.sumbitedAt = sumbitedAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", title=" + title + ", details=" + details + ", sellerId=" + sellerId
				+ ", submiterId=" + submiterId + ", sumbitedAt=" + sumbitedAt + ", updatedAt=" + updatedAt + "]";
	}
}
