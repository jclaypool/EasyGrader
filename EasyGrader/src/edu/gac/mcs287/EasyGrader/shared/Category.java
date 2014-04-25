package edu.gac.mcs287.EasyGrader.shared;

public class Category {
	private String title;
	private CategoryGradeType type;
	private Category[] subcategories;

	public Category(String title, CategoryGradeType type){
		setTitle(title);
		setType(type);
	}
	
	
	public String toString(){
		//StringBuffer buffer = new StringBuffer();
		return "\t- "+this.title;
	}
	
	//Getters/setters
	public Category[] getSubcategories() {
		return subcategories;
	}

	public void setSubcategories(Category[] subcategories) {
		this.subcategories = subcategories;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CategoryGradeType getType() {
		return type;
	}

	public void setType(CategoryGradeType type) {
		this.type = type;
	}
	
	
}
