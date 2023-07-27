package lesson_94_icon_image;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainView extends JFrame {
	private JMenu menu, subMenu;
	private JMenuItem newItem, saveItem, saveAsItem, exitItem, helpItem;
	private JMenuBar mb = new JMenuBar();
	private JButton jButton;
	private JLabel jLabel;

	public MainView() {
		this.setTitle("My Notepad");
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		// Set JFrame icon
		URL notepadIconUrl = MainView.class.getResource("./icon/notepad-icon.png");
		System.out.println(notepadIconUrl);
		Image icon  = Toolkit.getDefaultToolkit().createImage(notepadIconUrl);
		this.setIconImage(icon);
		
		int desiredWidth = 24;
		
		// ICONs
		ImageIcon originalNewImageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("./icon/new-icon.png")));
		Image resizedNewImage = originalNewImageIcon.getImage().getScaledInstance(desiredWidth, -1, Image.SCALE_SMOOTH);
		ImageIcon resizedNewIcon = new ImageIcon(resizedNewImage);
		
		ImageIcon originalSaveImageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("./icon/save-icon.png")));
		Image resizedSaveImage = originalSaveImageIcon.getImage().getScaledInstance(desiredWidth, -1, Image.SCALE_SMOOTH);
		ImageIcon resizedSaveIcon = new ImageIcon(resizedSaveImage);
		
		ImageIcon originalSaveAsImageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("./icon/save_as-icon.png")));
		Image resizedSaveAsImage = originalSaveAsImageIcon.getImage().getScaledInstance(desiredWidth, -1, Image.SCALE_SMOOTH);
		ImageIcon resizedSaveAsIcon = new ImageIcon(resizedSaveAsImage);
		
		ImageIcon originalExitImageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("./icon/exit-icon.png")));
		Image resizedExitImage = originalExitImageIcon.getImage().getScaledInstance(desiredWidth, -1, Image.SCALE_SMOOTH);
		ImageIcon resizedExitIcon = new ImageIcon(resizedExitImage);
		
		ImageIcon originalHelpImageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("./icon/help-icon.png")));
		Image resizedHelpImage = originalHelpImageIcon.getImage().getScaledInstance(desiredWidth, -1, Image.SCALE_SMOOTH);
		ImageIcon resizedHelpIcon = new ImageIcon(resizedHelpImage);
		
		
		// JMenuBar
		menu = new JMenu("Menu");
		subMenu = new JMenu("Sub Menu");
		newItem = new JMenuItem("New");
		newItem.setIcon(resizedNewIcon);
		
		saveItem = new JMenuItem("Save");
		saveItem.setIcon(resizedSaveIcon);
		
		saveAsItem = new JMenuItem("Save as");
		saveAsItem.setIcon(resizedSaveAsIcon);
		
		exitItem = new JMenuItem("Exit");
		exitItem.setIcon(resizedExitIcon);
		
		helpItem = new JMenuItem("Help");
		helpItem.setIcon(resizedHelpIcon);
		
		menu.add(newItem);
		menu.add(saveItem);
		menu.add(saveAsItem);
		subMenu.add(exitItem);
		subMenu.add(helpItem);
		menu.add(subMenu);
		mb.add(menu);

		// JLabel
		jLabel = new JLabel();
		jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("./icon/TacoCloud.png"))));

		// JButton
		jButton = new JButton("TEST BUTTON");
		jButton.setFont(new Font("Arial", Font.BOLD, 50));
		jButton.setSize(50, 50);

		this.setJMenuBar(mb);
		this.add(jLabel, BorderLayout.CENTER);
		this.add(jButton, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MainView();
	}
}
