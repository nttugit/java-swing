package lesson_85_search_text.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import lesson_85_search_text.controller.SearchTextAppListener;
import lesson_85_search_text.model.SearchTextAppModel;

public class SearchTextAppView extends JFrame {
	private SearchTextAppModel searchTextAppModel;

	private JLabel jLabel_result;

	private JTextArea jTextArea_text;

	private JTextField jTextField_search;

	public SearchTextAppView() {
		this.searchTextAppModel = new SearchTextAppModel();
		this.init();
	}

	private void init() {
		this.setTitle("Search Text App");
		this.setSize(700, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout(20, 20));
		ActionListener searchTextAppListener = new SearchTextAppListener(this);

		Font label_font = new Font("Arial", Font.BOLD, 30);
		Font text_font = new Font("Arial", Font.PLAIN, 20);

		// Two main panel: Content Panel & Search Panel
		JPanel jPanel_content = new JPanel();
		jPanel_content.setLayout(new BorderLayout());
		JPanel jPanel_search_wrapper = new JPanel();
		jPanel_search_wrapper.setLayout(new BorderLayout());

		
		// Add components into Content Panel
		JLabel jLabel_text = new JLabel("Văn bản");
		jLabel_text.setFont(label_font);
		jTextArea_text = new JTextArea(5, 7);
		jTextArea_text.setFont(text_font);

		// Có thể tuỳ chỉnh ẩn hiện vertical hoặc horizontal scroll bar
		JScrollPane jScrollPane_content = new JScrollPane(jTextArea_text, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jPanel_content.add(jLabel_text, BorderLayout.NORTH);
		jPanel_content.add(jScrollPane_content, BorderLayout.CENTER);

		// Add components into Search Panel
		JLabel jLabel_search = new JLabel("Từ khoá");
		jLabel_search.setFont(label_font);

		JPanel jPanel_search_wrapper_text_and_button = new JPanel(new BorderLayout());
		jTextField_search = new JTextField(30);
		jTextField_search.setFont(text_font);
		JButton jButton_search = new JButton("Tìm kiếm");
		jButton_search.setFont(text_font);
		jButton_search.addActionListener(searchTextAppListener);

		JScrollPane jScrollPane_searchKey = new JScrollPane(jTextField_search);
		jPanel_search_wrapper_text_and_button.add(jScrollPane_searchKey, BorderLayout.WEST);
		jPanel_search_wrapper_text_and_button.add(jButton_search, BorderLayout.EAST);

		jLabel_result = new JLabel("Kết quả tìm kiếm");
		jLabel_result.setFont(text_font);

		jPanel_search_wrapper.add(jLabel_search, BorderLayout.NORTH);
		jPanel_search_wrapper.add(jPanel_search_wrapper_text_and_button, BorderLayout.CENTER);
		jPanel_search_wrapper.add(jLabel_result, BorderLayout.SOUTH);

		this.add(jPanel_content, BorderLayout.CENTER);
		this.add(jPanel_search_wrapper, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void searchText() {
		try {
			if (this.jTextArea_text.getText().length() > 0 && this.jTextField_search.getText().length() > 0) {
				this.searchTextAppModel.setText(this.jTextArea_text.getText());
				this.searchTextAppModel.setSearchedText(this.jTextField_search.getText());
				this.searchTextAppModel.searchText();

				this.jLabel_result.setText(this.searchTextAppModel.getResult());
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
