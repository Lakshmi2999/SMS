public class Student {
    private int studId;
    private String studName;
    private String course;
    private String phnNo[];
    public int getStudId() {
        return studId;
    }
    public void setStudId(int studId) {
    	this.studId = studId;
    }
    public String getStudName() {
    	return studName;
    }
    public void setStudName(String studName) {
        this.studName = studName;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setPhnNo(String phnNo[]){
        this.phnNo=phnNo;
    }
    public String[] getPhnNo(){
        return phnNo;
    }
}