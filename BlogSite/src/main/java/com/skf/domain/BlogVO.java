package com.skf.domain;

public class BlogVO {
	private Integer blogId;

	private String authorId;
	private String blogColumnAlias;

	private String blogTitle;

	private String blogContent;

	private String blogCreatetime;

	private String blogViewNum;

	private String blogStick;

	private Integer blogsRecommendNum;

	private String blogsCommentID;
	private Author author;

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getBlogColumnAlias() {
		return blogColumnAlias;
	}

	public void setBlogColumnAlias(String blogColumnAlias) {
		this.blogColumnAlias = blogColumnAlias;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	public String getBlogCreatetime() {
		return blogCreatetime;
	}

	public void setBlogCreatetime(String blogCreatetime) {
		this.blogCreatetime = blogCreatetime;
	}

	public String getBlogViewNum() {
		return blogViewNum;
	}

	public void setBlogViewNum(String blogViewNum) {
		this.blogViewNum = blogViewNum;
	}

	public String getBlogStick() {
		return blogStick;
	}

	public void setBlogStick(String blogStick) {
		this.blogStick = blogStick;
	}

	public Integer getBlogsRecommendNum() {
		return blogsRecommendNum;
	}

	public void setBlogsRecommendNum(Integer blogsRecommendNum) {
		this.blogsRecommendNum = blogsRecommendNum;
	}

	public String getBlogsCommentID() {
		return blogsCommentID;
	}

	public void setBlogsCommentID(String blogsCommentID) {
		this.blogsCommentID = blogsCommentID;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
