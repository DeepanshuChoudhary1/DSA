public class Z_18_oops {
    public static void main(String[] args) {
        System.out.println("hello oops");
        Student stu1 = new Student();
        Student stu2 = new Student(stu1);

        stu2.name = "deep";
        stu1.marks[0] = 100;
        System.out.println(stu1.name);
        for (int num : stu2.marks) {
            System.out.println(num);
        }
        System.out.println(stu2.name);

    }
}

class Student {
    int rollNo;
    String name;
    int marks[];

    Student() {
        this.name = "raju";
        this.rollNo = 17;
        marks = new int[3];
        marks[0] = 20;
        marks[1] = 30;
        marks[2] = 40;
    }

    // shallow copy
    // Student(Student s) {
    // this.name = s.name;
    // this.rollNo = s.rollNo;
    // marks = new int[3];
    // this.marks = s.marks;

    // }

    // deepCopy
    Student(Student s) {
        this.name = s.name;
        this.rollNo = s.rollNo;
        marks = new int[3];
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s.marks[i];
        }

    }

}
