package lesson_99_file;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

public class MyNotepadController implements ActionListener {
	private MyNotepadView view;

	public MyNotepadController(MyNotepadView view) {
		this.view = view;
	}

	public static void writeTextFile(String filePath, String data) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(filePath, "UTF-8");
			pw.print(data);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		pw.flush();
		pw.close();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		JFileChooser fc = new JFileChooser();

		System.out.println(command);
		if (command.trim() == "Open") {
			int returnValue = fc.showOpenDialog(this.view);
			if (returnValue == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String fileName = file.getName();
				String filePath = file.getAbsolutePath();
				String fileContent = "";
				// Nếu định dạng là file .txt thì đọc
				if (fileName.endsWith(".txt")) {
					List<String> allText = null;
					try {
						allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (allText != null) {
						for (String line : allText) {
							fileContent += line + "\n";
						}
						fileContent = fileContent.substring(0, fileContent.length() - 2);
					}

				}

				// update model and view
				this.view.model.setfilePath(filePath);
				this.view.model.setContent(fileContent);
				this.view.showFileContent();
			}
		} else if (command.trim() == "Save") {
			String filePath = this.view.model.getfilePath();
			String data = this.view.fileContentTextArea.getText();

			// Nếu đang thao tác trên file bạn vừa mở lúc nãy
			if (filePath.length() > 0) {
				writeTextFile(filePath, data);
			} else {
				// Ngược lại, nếu tạo file mới
				int returnValue = fc.showSaveDialog(this.view);

				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					
					String savedFilePath = file.getAbsolutePath();
					if(!savedFilePath.endsWith(".txt")) {
						writeTextFile(savedFilePath + ".txt", data);
					}else {
						writeTextFile(savedFilePath, data);
					}
					System.out.println(savedFilePath);
				}
			}
		} else {
			return;
		}
	}

}
