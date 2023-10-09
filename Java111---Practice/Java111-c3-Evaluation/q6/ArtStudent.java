package q6;

public class ArtStudent implements Student{
	
	private Integer hindiMarks;
	private Integer englishMarks;
	private Integer historyMarks;
	
	public ArtStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArtStudent(Integer hindiMarks, Integer englishMarks, Integer historyMarks) {
		super();
		this.hindiMarks = hindiMarks;
		this.englishMarks = englishMarks;
		this.historyMarks = historyMarks;
	}

	public Integer getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(Integer hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public Integer getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(Integer englishMarks) {
		this.englishMarks = englishMarks;
	}

	public Integer getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(Integer historyMarks) {
		this.historyMarks = historyMarks;
	}

	@Override
	public String toString() {
		return "ArtStudent [hindiMarks=" + hindiMarks + ", englishMarks=" + englishMarks + ", historyMarks="
				+ historyMarks + "]";
	}

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		return (hindiMarks + englishMarks + historyMarks)/3.0;
	}
	
	

}
