package io.javabrains.springbootstarter.lessons;

import io.javabrains.springbootstarter.courses.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lesson 
{
	@Id
	private String id;
	private String name;
	private String description;
	
	
	@ManyToOne
	private Course course;
	
	public Lesson() {}
	
	public Lesson(String id, String name, String description, String courseId)
	{
		super();
		this.id=id;
		this.name=name;
		this.description=description;
		this.course=new Course(courseId, "", "", "");
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}
}
