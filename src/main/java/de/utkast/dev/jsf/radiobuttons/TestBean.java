package de.utkast.dev.jsf.radiobuttons;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TestBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String selectedValue;

	public List<String> getEntries() {
		return Arrays.asList("red", "green", "blue");
	}
	
	public String getSelectedValue() {
		return selectedValue;
	}

	public void setSelectedValue(String selectedValue) {
		this.selectedValue = selectedValue;
	}
	
}
