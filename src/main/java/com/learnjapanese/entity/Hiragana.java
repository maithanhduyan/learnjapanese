package com.learnjapanese.entity;

import javax.persistence.Id;

public class Hiragana {
	
	@Id
	long id;
	String name;
	String romaji;
	String note;
	String imgURL;
	
	public Hiragana(long id, String name, String romaji, String note, String imgURL) {
		super();
		this.id = id;
		this.name = name;
		this.romaji = romaji;
		this.note = note;
		this.imgURL = imgURL;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRomaji() {
		return romaji;
	}

	public void setRomaji(String romaji) {
		this.romaji = romaji;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	
	
	
}
