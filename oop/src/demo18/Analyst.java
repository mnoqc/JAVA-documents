package demo18;

public class Analyst {
	
	private DataReader reader;
	
	public Analyst() {}
	public Analyst(DataReader reader) {
		this.reader = reader;
	}
	
	public void setReader(DataReader reader) {
		this.reader = reader;
	}
	public void analyze() {
		System.out.println("데이터 분석하기");
		String data = reader.read();
		System.out.println(data);
	}
	

}
