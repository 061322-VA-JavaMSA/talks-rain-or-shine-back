package com.revature.models;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	@ManyToOne
	@JoinColumn(name="user_id", nullable=false)
	private int userId;
	@Column(name="time_created", nullable=false)
	private Timestamp timeCreated;
	
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

	
	public Timestamp getTimeCreated() {
		return timeCreated;
	}
	public void setTimeCreated(Timestamp timeCreated) {
		this.timeCreated = timeCreated;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(body, id, timeCreated, userId);
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
		return Objects.equals(body, other.body) && id == other.id && Objects.equals(timeCreated, other.timeCreated)
				&& userId == other.userId;
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", body=" + body + ", userId=" + userId + ", timeCreated=" + timeCreated + "]";
	}
	
}