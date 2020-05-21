package ex06_autowiring;

import java.io.FileWriter;

public class OutputerImpl implements Outputer{
	private String path;
	
	public void setPath(String path) {
		this.path=path;
	}
	@Override
	public void write(String message) throws Exception {
		FileWriter f = new FileWriter(path);
		f.write(message);
		f.close();
	}

}
