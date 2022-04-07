class Reader{

    int ID;
    String surname, name, patronymic;
    String faculty;
    String birthDate;
    String mobileNumber;

    Reader(int id, String surname, String name, String patronymic,
           String faculty, String birthDate, String mobileNumber){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.mobileNumber = mobileNumber;
    }

    public void takeBook(){}

    public void takeBook(int bookAmount){
        System.out.println(this.surname + " " + this.name +
                " took " + bookAmount + " books.");
    }

    public void takeBook(String... bookList){
        System.out.print(this.surname + " " + this.name +
                " took ");
        for (int i = 0; i < bookList.length; i++){
            System.out.print(bookList[i]);
            if (i != bookList.length-1){
                System.out.print(", ");
            }
            else{
                System.out.println(".");
            }
        }
    }

    public void takeBook(Book... bookList){
        System.out.print(this.surname + " " + this.name +
                " took ");
        for (int i = 0; i < bookList.length; i++){
            System.out.print(bookList[i].name);
            if (i != bookList.length-1){
                System.out.print(", ");
            }
            else{
                System.out.println(".");
            }
        }
    }

    public void returnBook(){}

    public void returnBook(int bookAmount){
        System.out.println(this.surname + " " + this.name +
                " return " + bookAmount + " books.");
    }

    public void returnBook(String... bookList){
        System.out.print(this.surname + " " + this.name +
                " return ");
        for (int i = 0; i < bookList.length; i++){
            System.out.print(bookList[i]);
            if (i != bookList.length-1){
                System.out.print(", ");
            }
            else{
                System.out.println(".");
            }
        }
    }

    public void returnBook(Book... bookList){
        System.out.print(this.surname + " " + this.name +
                " return ");
        for (int i = 0; i < bookList.length; i++){
            System.out.print(bookList[i].name);
            if (i != bookList.length-1){
                System.out.print(", ");
            }
            else{
                System.out.println(".");
            }
        }
    }

}

class Book{
    String author;
    String name;

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}


public class Exercise4 {
    public static void main(String[] args){
        Reader BestReader = new Reader(15189, "Dylan", "Bob", "Jr", "Tech",
                "04.03.95", "375298760202");

        Book Book1 = new Book();
        Book1.setAuthor("Palaniuk");
        Book1.setName("Fight Club");
        Book Book2 = new Book();
        Book2.setAuthor("Marx");
        Book2.setName("Capital");
        Book Book3 = new Book();
        Book3.setAuthor("Nietzsche");
        Book3.setName("Ecce Homo");

        BestReader.takeBook(3);
        BestReader.takeBook("Physics", "War and peace", "1984");
        BestReader.takeBook(Book1, Book2);

        BestReader.returnBook(2);
        BestReader.returnBook("We", "Process");
        BestReader.returnBook(Book3);
    }
}