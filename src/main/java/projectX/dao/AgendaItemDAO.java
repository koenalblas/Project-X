package projectX.dao;

import java.util.ArrayList;
import java.util.List;

import projectX.AgendaItem;
import projectX.User;

public class AgendaItemDAO {

	// List is working as a database
	// 
	
	private static final List<AgendaItem> ai= new ArrayList<>();

	static {
		ai.add(new AgendaItem("Maanlanding","5 mei","6 mei","Landing op de maan"));
	}
	

	public List<AgendaItem> getAi() {
		return ai;
	}
//
//	public void setAi(List<AgendaItem> ai) {
//		this.ai = ai;
//	}

}
