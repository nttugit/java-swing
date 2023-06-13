package lesson_85_search_text.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lesson_85_search_text.view.SearchTextAppView;

public class SearchTextAppListener implements ActionListener {
	private SearchTextAppView searchTextAppView;

	public SearchTextAppListener(SearchTextAppView searchTextAppView) {
		this.searchTextAppView = searchTextAppView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Tìm kiếm")) {
			this.searchTextAppView.searchText();
		}
	}

}
