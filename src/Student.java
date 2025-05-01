public class Student {
    String name;
    int studentID;
    int score;

    Student(String name, int studentID, int score) {
        this.name = name;
        this.studentID = studentID;
        this.score = score;
    }

    public String printStudent() {
        return "name : " + name + ", studentID : " + studentID + ", score : " + score;
    }

//    public int register_student(){
//
//        return studentID;
//    }
}
