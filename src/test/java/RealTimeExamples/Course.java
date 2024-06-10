package RealTimeExamples;



public class Course {

    private String course;
    private String category;
    private int reviewScore;
    private int nuOfStudents;

    public Course(String course, String category, int reviewScore, int nuOfStudents) {
        this.course = course;
        this.category = category;
        this.reviewScore = reviewScore;
        this.nuOfStudents = nuOfStudents;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNuOfStudents() {
        return nuOfStudents;
    }

    public void setNuOfStudents(int nuOfStudents) {
        this.nuOfStudents = nuOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course='" + course + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore=" + reviewScore +
                ", nuOfStudents=" + nuOfStudents +
                '}';
    }
}
