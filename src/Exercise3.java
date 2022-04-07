class Matrix{
    int column;
    int row;
    double[][] twoDimArray = new double[row][column];

    Matrix (int rowNumber, int columnNumber){
        this.row = rowNumber;
        this.column = columnNumber;
        this.twoDimArray = new double[row][column];
    }

    public void generateMatrixInts(){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                twoDimArray[i][j] = getRandomNumber();
            }
        }
    }

    public static double getRandomNumber()
    {
        return (double) (Math.random() * 10) + 1;
    }

    public void printMatrix(){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiplyMatrixInt(int multiplier){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                twoDimArray[i][j] *= multiplier;
            }
        }
    }

    public void sumMatrix(Matrix matrix){
        if (this.row == matrix.row && this.column == matrix.column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    twoDimArray[i][j] += matrix.twoDimArray[i][j];
                }
            }
        }
        else{
            System.out.println("Error: matrixes have different dimensions");
        }
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Matrix Neo = new Matrix(3, 3);
        Neo.generateMatrixInts();
        System.out.println("Initial matrix: ");
        Neo.printMatrix();
        System.out.println("\n");
        Neo.multiplyMatrixInt(3);
        System.out.println("Multiplying: ");
        Neo.printMatrix();
        System.out.println();
        Matrix Trinity = new Matrix(3, 3);
        Trinity.generateMatrixInts();
        Trinity.printMatrix();
        System.out.println("Sum: ");
        Neo.sumMatrix(Trinity);
        Neo.printMatrix();

    }
}
