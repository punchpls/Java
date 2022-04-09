class Student{
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public int getScholarship(){
        // без локальной переменной можно обойтись, используя сразу return
        // а вообще это можно записать в 1 строку
        // return this.averageMark == 5 ? 100 : 80;
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

// не выполнено условие отличия аспиранта от студента - наличие научной работы
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
        // используем геттеры и сеттеры, привыкай
        St1.firstName = "Sergey";
        St1.lastName = "Sergeev";
        St1.group = "FMK";
        St1.averageMark = 4;
        System.out.println("Scholarship: " + St1.getScholarship());
        // используй синтаксис
        // Student[] students = {new Student(), new Aspirant()};
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
