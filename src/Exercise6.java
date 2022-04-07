class Student{
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public int getScholarship(){
        int sum;
        if (this.averageMark == 5){
            sum = 100;
        }
        else{
            sum = 80;
        }
        return sum;
    }
}

class Aspirant extends Student{
    public int getScholarship(){
        int sum;
        if (this.averageMark == 5){
            sum = 200;
        }
        else{
            sum = 180;
        }
        return sum;
    }
}


public class Exercise6{
    public static void main(String[] args) {
        Student St1 = new Aspirant();
        St1.firstName = "Sergey";
        St1.lastName = "Sergeev";
        St1.group = "FMK";
        St1.averageMark = 4;
        System.out.println("Scholarship: " + St1.getScholarship());
        Student[] Students = new Student[5];
        Students[0] = new Student();
        Students[1] = new Student();
        Students[2] = new Aspirant();
        Students[3] = new Aspirant();
        Students[4] = new Aspirant();
        for (int i = 0; i < Students.length; i++){
            System.out.println("Scholarship for array: " + Students[i].getScholarship());
        }
    }
}
