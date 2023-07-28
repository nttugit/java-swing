package lesson_99_file;

public class MyNotepadModel {
	private String filePath;
	private String content;

	public MyNotepadModel(String filePath, String content) {
		super();
		this.filePath = filePath;
		this.content = content;
	}

	public MyNotepadModel() {
		this.filePath = "";
		this.content = "";
	}

	public String getfilePath() {
		return filePath;
	}

	public void setfilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void showFileContent() {
		// TODO Auto-generated method stub
		
	}

}
