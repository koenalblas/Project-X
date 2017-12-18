package projectX;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// + addItem
// + addComment
// + delItem
// + cusItem
// + getStatus
// + getUserID

public class AgendaItem {

	private String itemName;
	private String startDate;
	private String endDate;
	private String description;

	public AgendaItem(String itemName, String startDate, String endDate, String description) {
		// TODO Auto-generated constructor stub
		this.itemName = itemName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;

	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
