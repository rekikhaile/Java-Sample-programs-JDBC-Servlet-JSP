package accessDateTime.bean;

public class Access {
	private int counter = 0;
	private String date;
	private String time;
	
	public Access(int counter, String date, String time) {
		super();
		this.counter = counter;
		this.date = date;
		this.time = time;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Access [counter=" + counter + ", date=" + date + ", time="
				+ time + "]";
	}
	


	
}
