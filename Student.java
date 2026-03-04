class Student {
   private  String name;
     private double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    double getMarks() {
    return marks;
}
}


