class Course {
    static int maxCapacity;
    static int enrolledStudent;
    String courseName;
    String studentName;

    static {
        maxCapacity = 5;
        enrolledStudent=0;
    }
    Course(String courseName){
        this.courseName = courseName;
    }

    static int setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
        return Course.maxCapacity;
    }

    void enrolledStudents(String studentName){
        if(enrolledStudent<maxCapacity) {
            System.out.println("Welcome " + studentName + " in this course.");
            enrolledStudent++;
        }
        else
            System.out.println("The course is full");
    }

    void unenrolledStudents(String studentName){
        this.studentName = studentName;
        if(enrolledStudent==0){
            System.out.println("You are not in this course.");
        }
        else {
            System.out.println(studentName+" Your enrollment is cancelled now...");
            enrolledStudent--;
        }
    }

    public static void main(String[] args){
        Course course = new Course("CSE");
        Course course2 = new Course("BBA");
        System.out.println("MAX Capacity of courses is:" + maxCapacity);
        course.enrolledStudents("Aditya");
        course.enrolledStudents("B");
        course.enrolledStudents("C");
        course.enrolledStudents("D");
        course.enrolledStudents("E");
        course.unenrolledStudents("F");
        course2.enrolledStudents("Harsh");
        course2.enrolledStudents("Z");
        course2.enrolledStudents("Y");
        course2.enrolledStudents("X");
        course2.enrolledStudents("W");
        course2.enrolledStudents("V");
    }

}