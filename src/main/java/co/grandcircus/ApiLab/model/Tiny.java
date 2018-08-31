package co.grandcircus.ApiLab.model;

public class Tiny {

	private String name;
	private String invented;
	private int year;
	
	public Tiny() {
		// TODO Auto-generated constructor stub
	}

	public Tiny(String name, String invented, int year) {
		super();
		this.name = name;
		this.invented = invented;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInvented() {
		return invented;
	}

	public void setInvented(String invented) {
		this.invented = invented;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Tiny [name=" + name + ", invented=" + invented + ", year=" + year + "]";
	}
	
}
