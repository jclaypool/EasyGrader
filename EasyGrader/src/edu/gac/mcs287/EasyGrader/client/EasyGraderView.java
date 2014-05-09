package edu.gac.mcs287.EasyGrader.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

import edu.gac.mcs287.EasyGrader.shared.Category;
import edu.gac.mcs287.EasyGrader.shared.CategoryGradeType;
import edu.gac.mcs287.EasyGrader.shared.Form;

public class EasyGraderView {
	private EasyGrader control;

	public void setControl(EasyGrader control) {
		this.control = control;
	}

	public EasyGrader getControl() {
		return control;
	}

	public void viewAddFormPage() {
		System.out.println("hello");
		Button submitButton = Button.wrap(Document.get().getElementById("sub"));
		if (submitButton != null) {
			System.out.println("not null!");
		} else {
			System.out.println("sub is null");
		}
		final TextBox title = TextBox.wrap(DOM.getElementById("title"));

		// final TextBox description = TextBox.wrap(DOM
		// .getElementById("description"));

		submitButton.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				System.out.println("Clicked");
				Element div = DOM.getElementById("categoryDiv");
				int categoryCount = (int) (Math.ceil((div.getChildCount() - 3) / 2));
				for (int i = 0; i < div.getChildCount(); i++) {
					System.out.println("child = " + div.getChild(i));
				}
				final TextBox[] categories = new TextBox[categoryCount];
				int i = 0;
				while (true) {
					System.out.println("i, c" + i + " " + categoryCount);
					Element element = DOM.getElementById("c" + i);
					System.out.println(element);
					if (element == null) {
						System.out.println("element is null");
						break;
					}
					categories[i] = TextBox.wrap(element);
					i++;

				}
				Form form = new Form(title.getText(),
						createCategoriesFromTextBoxes(categories));
				form.print();
			}

		});
	}

	private Category[] createCategoriesFromTextBoxes(TextBox[] textboxes) {
		Category[] categories = new Category[textboxes.length];
		for (int i = 0; i < textboxes.length; i++) {
			TextBox text = textboxes[i];

			Category category = new Category(text.getText(),
					CategoryGradeType.DECIMAL);

			categories[i] = category;
			System.out.println(category);
		}
		return categories;
	}

	public void viewWelcomePage() {
		//setWindow("welcome.html");
		
		Button newFormButton = Button.wrap(DOM.getElementById("newFormButton"));
		System.out.println(newFormButton);
		newFormButton.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				setWindow("yolohtml.html");
				System.out.println("window set");
				viewAddFormPage();
				
				
			}
			
		});
	}

	public void setWindow(String url) {
		Window.Location.replace(url);
	}

}
