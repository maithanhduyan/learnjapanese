package com.learnjapanese.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class KanjiBasic {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String content;
    int stroke;
    String note;

    public KanjiBasic() {

    }
 
    /**
     * @param id
     * @param name
     * @param content
     * @param stroke
     * @param note
     */
    public KanjiBasic(int id, String name, String content, int stroke, String note) {
	super();
	this.id = id;
	this.name = name;
	this.content = content;
	this.stroke = stroke;
	this.note = note;
    }

    /**
     * @return the id
     */
    public long getId() {
	return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
	this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the content
     */
    public String getContent() {
	return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
	this.content = content;
    }

    /**
     * @return the stroke
     */
    public int getStroke() {
	return stroke;
    }

    /**
     * @param stroke the stroke to set
     */
    public void setStroke(int stroke) {
	this.stroke = stroke;
    }

    /**
     * @return the note
     */
    public String getNote() {
	return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
	this.note = note;
    }

}
