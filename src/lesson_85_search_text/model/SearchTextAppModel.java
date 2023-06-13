package lesson_85_search_text.model;

public class SearchTextAppModel {
	private String text;
	private String searchedText;
	private String result;

	public SearchTextAppModel() {
		this.text = "";
		this.searchedText = "";
		this.result = "";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSearchedText() {
		return searchedText;
	}

	public void setSearchedText(String searchedText) {
		this.searchedText = searchedText;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void searchText() {
		int count = 0;
		int startIndex = 0;
		while (true) {
			int foundIndex = this.text.indexOf(this.searchedText, startIndex);
			if (foundIndex == -1)
				break;
			else {
				count++;
				startIndex = foundIndex + 1;
			}
		}
		this.result = "Tìm thấy \"" + this.searchedText + "\" xuất hiện " + count + " lần.";
	}

}
