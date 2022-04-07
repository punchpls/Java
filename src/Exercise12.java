class Product{
    String productName;
    int productPrice;
    int productRate;
}

class Category{
    String categoryName;
    Product[] productArray = new Product[3];

    /*@Override
    public String toString(){
        return "Product: " + this.productArray[i].productName + "\nPrice: "  +
                productArray[i].productPrice + "\nRate: " + productArray[i].productRate;
    }*/
}

class Basket {
    Product[] boughtProducts = new Product[2];
}

class User{
    String login;
    String password;
    Basket userBasket;
}

public class Exercise12{
    public static void main(String[] args){
        Category Cat1 = new Category();
        Cat1.categoryName = "Food";
        for (int i = 0; i < 3; i++){
            Cat1.productArray[i] = new Product();
            Cat1.productArray[i].productName = "Product" + i;
            Cat1.productArray[i].productPrice = i + 1;
            Cat1.productArray[i].productRate = i * 2;
        }

        Category Cat2 = new Category();
        Cat2.categoryName = "Beverage";
        for (int i = 0; i < 3; i++){
            Cat2.productArray[i] = new Product();
            Cat2.productArray[i].productName = "Product" + i;
            Cat2.productArray[i].productPrice = i + 2;
            Cat2.productArray[i].productRate = i * 3;
        }

        for (int i = 0; i <Cat1.productArray.length; i++) {
            System.out.println(Cat1.productArray[i]);
        }

        Basket BuyerBasket = new Basket();
        BuyerBasket.boughtProducts[0] = new Product();
        BuyerBasket.boughtProducts[1] = new Product();
        for (int i = 0; i < 2; i++){
            BuyerBasket.boughtProducts[i] = Cat1.productArray[i];
        }
        User buyer = new User();
        buyer.login = "qwerty";
        buyer.password = "12345";
        buyer.userBasket = BuyerBasket;
    }
}

