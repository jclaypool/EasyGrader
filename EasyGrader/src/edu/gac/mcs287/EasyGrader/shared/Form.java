package edu.gac.mcs287.EasyGrader.shared;

public class Form {
	private Category[] categories;
	private boolean isFilledOut;
	private String person;
	private String title;

	public Form(String title) {
		setFilledOut(false);
		setTitle(title);
	}

	public Form(String title, Category[] categories) {
		setCategories(categories);
		setTitle(title);
		setFilledOut(false);
	}

	public void print() {
		StringBuffer printString = new StringBuffer(title + "\n");
		for (int i = 0; i < categories.length; i++) {
			printString.append(categories[i].toString() + "\n");
		}

		System.out.println(printString.toString());
	}

	// Getters and setters
	public Category[] getCategories() {
		return categories;
	}

	public void setCategories(Category[] categories) {
		this.categories = categories;
	}

	public String getPerson() {
		return person;
	}

	public void setFilledOut(boolean isFilledOut) {
		this.isFilledOut = isFilledOut;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public boolean isFilledOut() {
		return isFilledOut;
	}

	public static void main(String[] args) {
		Form f = new Form("Sergio's form");
		Category[] categories = {
				new Category("How awesome is Sergio", CategoryGradeType.DECIMAL),
				new Category("Sergio's grade in life",
						CategoryGradeType.DECIMAL) };
		f.setCategories(categories);
		f.print();

	}

}
