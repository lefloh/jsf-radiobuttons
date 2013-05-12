package de.utkast.dev.jsf.radiobuttons;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;
import javax.faces.component.UINamingContainer;
import javax.faces.context.FacesContext;

@FacesComponent("radioGroup")
public class RadioGroupComponent extends UIInput implements NamingContainer {

	private String value;
	
	@Override
	public String getFamily() {
		return UINamingContainer.COMPONENT_FAMILY;
	}

	@Override
	public void decode(FacesContext context) {
		String id = (String) getAttributes().get("id");
		value = context.getExternalContext().getRequestParameterMap().get(id);
	}

	@Override
	public Object getSubmittedValue() {
		return value;
	}

}