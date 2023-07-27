package lesson_89_menu;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;


public class MyMenuView extends JFrame {
	private JLabel jLabel;
	private JPopupMenu jRightMouseMenu;
	private JToolBar jToolBar;

	public MyMenuView() {
		this.init();
	}

	private void init() {
		this.setTitle("My Panel With Menu And Toolbar");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());

		ActionListener menuListener = new MenuController(this);
		MouseListener mouseListener = new MenuMouseListener(this);

		Font font = new Font("Arial", Font.BOLD, 20);

		JMenuBar jMenuBar = new JMenuBar();

		// Menu FILE
		JMenu jMenu_file = new JMenu("File");

		JMenuItem jMenuItem_open = new JMenuItem("Open");
		jMenuItem_open.addActionListener(menuListener);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenuItem_exit.addActionListener(menuListener);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));

		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);

		// Menu VIEW
		JMenu jMenu_view = new JMenu("View");
		JCheckBoxMenuItem jCheckBoxMenuItem_toolBar = new JCheckBoxMenuItem("Toolbar");
		jCheckBoxMenuItem_toolBar.addActionListener(menuListener);
		jMenu_view.add(jCheckBoxMenuItem_toolBar);

		// Menu HELP
		JMenu jMenu_help = new JMenu("Help");
		// HELP-WELCOME
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
		jMenuItem_welcome.addActionListener(menuListener);
		JMenu jMenu_terms = new JMenu("Terms");
		// HELP-TERMS-POLICY
		JMenuItem jMenuItem_terms_policy = new JMenuItem("Policy");
		jMenu_terms.add(jMenuItem_terms_policy);
		jMenu_terms.addActionListener(menuListener);
//		 HELP-TERMS-ACCOUNTS
		JMenuItem jMenuItem_terms_accounts = new JMenuItem("Accounts");
		jMenuItem_terms_accounts.addActionListener(menuListener);
		jMenuItem_terms_accounts.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.ALT_DOWN_MASK));

		jMenu_terms.add(jMenuItem_terms_accounts);

		jMenu_help.add(jMenuItem_welcome);
		jMenu_help.add(jMenu_terms);
//		jMenu_help.setMnemonic(KeyEvent.VK_H);

		// Add menus for menu bar
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_view);
		jMenuBar.add(jMenu_help);
		
		
		jLabel = new JLabel();
		jLabel.setFont(font);

		// Tạo Toolbar
		jToolBar = new JToolBar();
		JButton jButton_Undo = new JButton("Undo");
		jButton_Undo.addActionListener(menuListener);
		jButton_Undo.setToolTipText("Undo");

		JButton jButton_Redo = new JButton("Redo");
		jButton_Redo.addActionListener(menuListener);
		jButton_Redo.setToolTipText("Redo");

		JButton jButton_Copy = new JButton("Copy");
		jButton_Copy.addActionListener(menuListener);
		jButton_Copy.setToolTipText("Copy");

		JButton jButton_Cut = new JButton("Cut");
		jButton_Cut.addActionListener(menuListener);
		jButton_Cut.setToolTipText("Cut");

		JButton jButton_Paste = new JButton("Paste");
		jButton_Paste.addActionListener(menuListener);
		jButton_Paste.setToolTipText("Paste");

		jToolBar.add(jButton_Undo);
		jToolBar.add(jButton_Redo);
		jToolBar.add(jButton_Copy);
		jToolBar.add(jButton_Cut);
		jToolBar.add(jButton_Paste);

		// Menu chuột phải
		jRightMouseMenu = new JPopupMenu();
		// Font Menu
		JMenu jMenuPopup_font = new JMenu("Font");
		JMenuItem jMenuItem_font_type = new JMenuItem("Type");
		jMenuItem_font_type.addActionListener(menuListener);

		JMenuItem jMenuItem_font_size = new JMenuItem("Size");
		jMenuItem_font_size.addActionListener(menuListener);

		jMenuPopup_font.add(jMenuItem_font_type);
		jMenuPopup_font.add(jMenuItem_font_size);

		JMenuItem jMenuItem_cut = new JMenuItem("Cut");
		jMenuItem_cut.addActionListener(menuListener);

		JMenuItem jMenuItem_copy = new JMenuItem("Copy");
		jMenuItem_copy.addActionListener(menuListener);

		JMenuItem jMenuItem_paste = new JMenuItem("Paste");
		jMenuItem_paste.addActionListener(menuListener);

		jRightMouseMenu.add(jMenuPopup_font);
		jRightMouseMenu.add(jMenuItem_cut);
		jRightMouseMenu.add(jMenuItem_copy);
		jRightMouseMenu.add(jMenuItem_paste);

		this.add(jRightMouseMenu);

		this.addMouseListener(mouseListener);

		this.setJMenuBar(jMenuBar);
		this.add(jLabel);

		this.setVisible(true);
	}

	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}

	public void showRightMousePopup(Component component, int x, int y) {
		this.jRightMouseMenu.show(component, x, y);

	}

	public void enableToolbar() {
		this.add(jToolBar, BorderLayout.NORTH);
		this.jToolBar.setVisible(true);
	}

	public void disableToolbar() {
//		this.remove(jToolBar);
		this.jToolBar.setVisible(false);
	}

	public void refreshUI() {
//		this.pack();
//		this.setSize(500, 500);

	}

}
