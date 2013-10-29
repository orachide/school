/**
 * 
 */
package fr.wati.scool.web.view;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.event.ShortcutListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * @author Rachid Ouattara
 * 
 */
@SuppressWarnings("serial")
public class LoginView extends CustomComponent implements View {

	public static final String NAME = "";
	
	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private CssLayout mainLayout;
	@AutoGenerated
	private VerticalLayout loginLayout;

	private TextField usernameField;
	private  PasswordField passwordField ;
	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public LoginView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private CssLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new CssLayout();
		mainLayout.setImmediate(false);
		mainLayout.setSizeFull();
		mainLayout.addStyleName("main-bg");
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");

		// loginLayout
		loginLayout = new VerticalLayout();
		loginLayout.addStyleName("login-layout");
		loginLayout.setSizeFull();
		mainLayout.addComponent(loginLayout);

		final CssLayout loginPanel = new CssLayout();
		loginPanel.addStyleName("login-panel");

		HorizontalLayout labels = new HorizontalLayout();
		labels.setWidth("100%");
		labels.setMargin(true);
		labels.addStyleName("labels");
		loginPanel.addComponent(labels);

		Label welcome = new Label("Welcome");
		welcome.setSizeUndefined();
		welcome.addStyleName("h4");
		labels.addComponent(welcome);
		labels.setComponentAlignment(welcome, Alignment.MIDDLE_LEFT);

		Label title = new Label("QuickTickets Dashboard");
		title.setSizeUndefined();
		title.addStyleName("h2");
		title.addStyleName("light");
		labels.addComponent(title);
		labels.setComponentAlignment(title, Alignment.MIDDLE_RIGHT);

		HorizontalLayout fields = new HorizontalLayout();
		fields.setSpacing(true);
		fields.setMargin(true);
		fields.addStyleName("fields");

		usernameField = new TextField("Username");
		usernameField.focus();
		fields.addComponent(usernameField);

		passwordField = new PasswordField("Password");
		fields.addComponent(passwordField);

		final Button signin = new Button("Sign In");
		signin.addStyleName("default");
		fields.addComponent(signin);
		fields.setComponentAlignment(signin, Alignment.BOTTOM_LEFT);

		final ShortcutListener enter = new ShortcutListener("Sign In",
				KeyCode.ENTER, null) {
			@Override
			public void handleAction(Object sender, Object target) {
				signin.click();
			}
		};

		signin.addClickListener(new ClickListener() {
			@Override
			public void buttonClick(ClickEvent event) {
				
				//
				// Validate the fields using the navigator. By using validors for the
				// fields we reduce the amount of queries we have to use to the database
				// for wrongly entered passwords
				//
				if (!usernameField.isValid() || !passwordField.isValid()) {
					return;
				}

				String username = usernameField.getValue();
				String password = passwordField.getValue();

				//
				// Validate username and password with database here. For examples sake
				// I use a dummy username and password.
				//
				boolean isValid =true;
//				username.equals("test@test.com")
//						&& password.equals("passw0rd");

				if (isValid) {
					// Store the current user in the service session
					getSession().setAttribute("user", username);

					// Navigate to main view
					getUI().getNavigator().navigateTo(MainView.NAME);

				} else {

					// Wrong password clear the password field and refocuses it
					LoginView.this.passwordField.setValue(null);
					LoginView.this.passwordField.focus();
				}
				
				
//				if (username.getValue() != null
//						&& username.getValue().equals("")
//						&& password.getValue() != null
//						&& password.getValue().equals("")) {
//					signin.removeShortcutListener(enter);
//					// TODO navigate
//				} else {
//					if (loginPanel.getComponentCount() > 2) {
//						// Remove the previous error message
//						loginPanel.removeComponent(loginPanel.getComponent(2));
//					}
//					// Add new error message
//					Label error = new Label(
//							"Wrong username or password. <span>Hint: try empty values</span>",
//							ContentMode.HTML);
//					error.addStyleName("error");
//					error.setSizeUndefined();
//					error.addStyleName("light");
//					// Add animation
//					error.addStyleName("v-animate-reveal");
//					loginPanel.addComponent(error);
//					username.focus();
//				}
			}
		});

		signin.addShortcutListener(enter);

		loginPanel.addComponent(fields);

		loginLayout.addComponent(loginPanel);
		loginLayout.setComponentAlignment(loginPanel, Alignment.MIDDLE_CENTER);
		return mainLayout;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.vaadin.navigator.View#enter(com.vaadin.navigator.ViewChangeListener
	 * .ViewChangeEvent)
	 */
	@Override
	public void enter(ViewChangeEvent event) {
		usernameField.focus();
	}

}