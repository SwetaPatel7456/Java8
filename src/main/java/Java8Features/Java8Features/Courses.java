package Java8Features.Java8Features;

public class Courses {
	private String coursename;
	private int noOfStudent;
	private int reviewScore;

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	@Override
	public String toString() {
		return "Courses [coursename=" + coursename + ", noOfStudent=" + noOfStudent + ", reviewScore=" + reviewScore
				+ "]";
	}

	public Courses(String coursename, int noOfStudent, int reviewScore) {
		super();
		this.coursename = coursename;
		this.noOfStudent = noOfStudent;
		this.reviewScore = reviewScore;
	}

	public Courses() {
		super();
// TODO Auto-generated constructor stub
	}

}
