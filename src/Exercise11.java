abstract class Shape{
    String color;
    public abstract void draw();

    public abstract boolean equals();
}


class Circle extends Shape{
    int coordinate1, coordinate2;

    @Override
    public void draw(){
        System.out.println("Drawing circle with the coordinates " + this.coordinate1 +
                " , " + this.coordinate2);
    }
    @Override
    public boolean equals(){
        return true; //не уверен, что заглушку именно такую нужно указывать
    }

    public boolean equals(Circle circle){
        return this.color == circle.color &&
                this.coordinate1 == circle.coordinate1 &&
                this.coordinate2 == circle.coordinate2;
    }

    Circle(int coordinate1, int coordinate2){
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }
}

class Rectangle extends Shape{
    int coordinate1, coordinate2;
    @Override
    public void draw(){
        System.out.println("Drawing rectangle with the coordinates " + this.coordinate1 +
                " , " + this.coordinate2);
    }
    @Override
    public boolean equals(){
        return true; //не уверен, что заглушку именно такую нужно указывать
    }

    public boolean equals(Rectangle rectangle){
        return this.color == rectangle.color &&
                this.coordinate1 == rectangle.coordinate1 &&
                this.coordinate2 == rectangle.coordinate2;
    }

    Rectangle(int coordinate1, int coordinate2){
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }
}

public class Exercise11{
    public static void main(String[] args){
        Shape[] ShapesArray = new Shape[2];
        ShapesArray[0] = new Circle(3, 5);
        ShapesArray[1] = new Rectangle(2, 7);
        for (int i = 0; i <ShapesArray.length; i++){
            ShapesArray[i].draw();
        }
    }
}