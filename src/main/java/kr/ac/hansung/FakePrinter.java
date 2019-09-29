package kr.ac.hansung;

public class FakePrinter extends Printer {

	private String contents;

	@Override
	public void printContents(String s) {
		
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

}
