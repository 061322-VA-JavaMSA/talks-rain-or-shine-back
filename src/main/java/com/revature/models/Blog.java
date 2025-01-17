package com.revature.models;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="blogs")
public class Blog {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="body", nullable=false)
	private String body;
	@Column(name="user_id", nullable=false)
	private int userId;
	@Column(name="time_created", nullable=false)
	private Date timeCreated;
	@Column(name="blog_username", nullable=false)
	private String blogUsername;


	public Blog() {
		super();
		// Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getTimeCreated() {
		return timeCreated;
	}
	public void setTimeCreated(Date timeCreated) {
		this.timeCreated = timeCreated;
	}

	public String getBlogUsername() {
		return blogUsername;
	}
	public void setBlogUsername(String blogUsername) {
		this.blogUsername = blogUsername;
	}

	@Override
	public int hashCode() {
		return Objects.hash(blogUsername, body, id, timeCreated, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Blog other = (Blog) obj;
		return Objects.equals(blogUsername, other.blogUsername) && Objects.equals(body, other.body) && id == other.id
				&& Objects.equals(timeCreated, other.timeCreated) && userId == other.userId;
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", body=" + body + ", userId=" + userId + ", timeCreated=" + timeCreated
				+ ", blogUsername=" + blogUsername + "]";
	}
	
}