package com.skf.domain;

/**
 * 
 * 博客 pojo
 * 
 * @Project:cmsblogs
 * @file:Blog.java
 *
 * @Author:chenssy
 * @email:chenssy995812509@163.com
 * @url : http://cmsblogs.com
 * @qq : 122448894
 *
 * @data:2015年9月11日
 */
public class Blog {
	private String blogId;

	private String authorId;
	private String blogColumnAlias;

	private String blogTitle;

	private String blogContent;

	private String blogCreatetime;

	private Integer blogViewNum;

	private String blogStick;

	private Integer blogsRecommendNum;

	private String blogsCommentID;

	public String getBlogId() {
		return blogId;
	}

	public void setBlogId(String blogId) {
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

	public Integer getBlogViewNum() {
		return blogViewNum;
	}

	public void setBlogViewNum(Integer blogViewNum) {
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

}