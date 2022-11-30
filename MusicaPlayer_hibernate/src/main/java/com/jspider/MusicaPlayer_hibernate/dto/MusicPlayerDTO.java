package com.jspider.MusicaPlayer_hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class MusicPlayerDTO {
	@Id
	private int id;
	
	private String name;
	
	private String singer;
	
	private double length;
}
