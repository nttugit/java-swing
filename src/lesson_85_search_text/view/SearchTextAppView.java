package lesson_85_search_text.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
		this.setSize(800, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		ActionListener searchTextAppListener = new SearchTextAppListener(this);

		Font label_font = new Font("Arial", Font.BOLD, 40);
		Font text_font = new Font("Arial", Font.PLAIN, 20);
		// Panel
		JPanel jPanel_text = new JPanel();
		jPanel_text.setLayout(new BorderLayout());

		JPanel jPanel_search = new JPanel();
		jPanel_search.setLayout(new FlowLayout());
		
		// Labels and text field (area)
		JLabel jLabel_text = new JLabel("Văn bản");
		jLabel_text.setFont(label_font);
		jTextArea_text = new JTextArea(5, 7);
		jTextArea_text.setFont(text_font);

		jPanel_text.add(jLabel_text, BorderLayout.NORTH);
		jPanel_text.add(jTextArea_text, BorderLayout.CENTER);

		JLabel jLabel_search = new JLabel("Từ khoá");
		jLabel_search.setFont(label_font);
		jTextField_search = new JTextField(30);
		jTextField_search.setFont(text_font);

		JButton jButton_search = new JButton("Tìm kiếm");
		jButton_search.setFont(text_font);
		jButton_search.addActionListener(searchTextAppListener);

		jLabel_result = new JLabel("Kết quả tìm kiếm", 10);
		jLabel_result.setFont(text_font);
//		jLabel_result.setEditable(false);
		
		jPanel_search.add(jLabel_search);
		jPanel_search.add(jTextField_search);
		jPanel_search.add(jButton_search);
		jPanel_search.add(jLabel_result);

		this.add(jPanel_text, BorderLayout.NORTH);
		this.add(jPanel_search, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public void searchText() {
		this.searchTextAppModel.setText(this.jTextArea_text.getText());
		this.searchTextAppModel.setSearchedText(this.jTextField_search.getText());
		this.searchTextAppModel.searchText();
		System.out.println(this.searchTextAppModel.getResult());

		this.jLabel_result.setText(this.searchTextAppModel.getResult());
	}

}
