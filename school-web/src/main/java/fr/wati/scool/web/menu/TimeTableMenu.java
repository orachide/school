/**
 * 
 */
package fr.wati.scool.web.menu;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import com.vaadin.ui.Button;

import fr.wati.scool.web.annotations.MenuConfig;
import fr.wati.scool.web.menu.Menu.MenuGroup;
import fr.wati.scool.web.view.TimeTableView;

/**
 * @author Rachid Ouattara
 *
 */
@Component
@Scope(value= WebApplicationContext.SCOPE_SESSION)
@MenuConfig(MenuGroup.TOP)
@SuppressWarnings("serial")
public class TimeTableMenu extends AbstractMenu {

	private Button button;
	/**
	 * @param navigator
	 */
	public TimeTableMenu() {
		super();
	}

	/* (non-Javadoc)
	 * @see fr.wati.scool.web.menu.Menu#getButton()
	 */
	@Override
	public Button getComponent() {
		if(button==null){
			button=new Button("Calendrier");
			button.setHtmlContentAllowed(true);
		}
		return button;
	}

	@Override
	public String getViewName() {
		return TimeTableView.NAME;
	}

	@Override
	public int getPosition() {
		return 1;
	}

}
