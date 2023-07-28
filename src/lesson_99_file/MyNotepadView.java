package lesson_99_file;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyNotepadView extends JFrame {

	public JPanel contentPane;
	public MyNotepadModel model;
	public JLabel fileLabel;
	public JTextArea fileContentTextArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyNotepadView frame = new MyNotepadView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyNotepadView() {
		this.model = new MyNotepadModel();
		ActionListener notepadAction = new MyNotepadController(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		fileContentTextArea = new JTextArea();
		fileContentTextArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		
		JScrollPane scrollPane = new JScrollPane(fileContentTextArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10,50));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		 fileLabel = new JLabel("No file chosen");
		 fileLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 fileLabel.setBounds(10, 10, 418, 30);
		panel.add(fileLabel);
		
		JButton btnNewButton = new JButton("Open");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(454, 11, 159, 29);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(notepadAction);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBounds(640, 11, 159, 29);
		panel.add(btnSave);
		btnSave.addActionListener(notepadAction);
		
			
	}
	
	public void showFileContent() {
		this.fileLabel.setText(this.model.getfilePath());
		this.fileContentTextArea.setText(this.model.getContent());
	}

}
