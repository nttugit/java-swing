package lesson_89_menu;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MyMenuView extends JFrame {
	private JLabel jLabel;

	public MyMenuView() {
		this.init();
	}

	private void init() {
		this.setTitle("My Paint");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());

		ActionListener menuListener = new MenuController(this);

		JMenuBar jMenuBar = new JMenuBar();

		// FILE
		JMenu jMenu_file = new JMenu("File");

		JMenuItem jMenuItem_open = new JMenuItem("Open");
		jMenuItem_open.addActionListener(menuListener);
		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenuItem_exit.addActionListener(menuListener);

		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);

		// HELP
		JMenu jMenu_help = new JMenu("Help");
		// HELP-WELCOME
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
		jMenuItem_welcome.addActionListener(menuListener);
		JMenu jMenu_terms = new JMenu("Terms");
		// HELP-TERMS-POLICY
		JMenuItem jMenuItem_terms_policy = new JMenuItem("Policy");
		jMenu_terms.add(jMenuItem_terms_policy);
//		 HELP-TERMS-ACCOUNTS
		JMenuItem jMenuItem_terms_accounts = new JMenuItem("Accounts");
		jMenu_terms.add(jMenuItem_terms_accounts);

		jMenu_help.add(jMenuItem_welcome);
		jMenu_help.add(jMenu_terms);

		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		
		this.setJMenuBar(jMenuBar);
		
		Font font = new Font("Arial", Font.BOLD, 20);
		jLabel = new JLabel();
		jLabel.setFont(font);

		this.add(jLabel);

		this.setVisible(true);
	}

	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}


}
