public class Student {
    String name;
    int id;
    String course;
    String sem;
    int phone;
    public Student(String name,int id,String course,String sem,int phone){
        this.name = name;
        this.id = id;
        this.course = course;
        this.sem = sem;
        this.phone = phone;
    }
    public void displayInfo(){
        System.out.println("Student Name:"+name);
        System.out.println("Student ID:"+id);
        System.out.println("Course:"+course);
        System.out.println("Semester:"+sem);
        System.out.println("Phone Number:"+phone);
    }
    public static void main(String[] args) {
       Student stu1 = new Student("saniya",101,"BCA","second",891766353);
        stu1.displayInfo();
    }
}
