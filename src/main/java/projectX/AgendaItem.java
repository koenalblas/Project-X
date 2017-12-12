package projectX;
import java.time.format.DateTimeFormatter;

// + addItem
// + addComment
// + delItem
// + cusItem
// + getStatus
// + getUserID

public class AgendaItem {

	private String itemName;
	private DateTimeFormatter startDate;
	private DateTimeFormatter endDate;
	private String description;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public DateTimeFormatter getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTimeFormatter startDate) {
		this.startDate = startDate;
	}

	public DateTimeFormatter getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTimeFormatter endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
