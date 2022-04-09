class Phone{
    // почему protected?
    protected int number, model, weight;
    // где отступы между методами?
    public void receiveCall(String name){
        System.out.println(name + " is calling");
    }
    public void receiveCall(String name, String callnumber){
        System.out.println(name + " is calling" + "\nnumber: " + callnumber);
    }
    // этот метод вообще не понял зачем, а главное нахуя
    public String getNumber(String callnumber){
        // зачем callingNumber?
        String callingNumber = callnumber;
        System.out.println("Calling number: " + callingNumber);
        return callingNumber;
    }

    public void sendMessage(String... numbers){
        //send the message to these numbers
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public Phone(int number, int model, int weight){
        this(number, model);
        this.weight = weight;
    }
    public Phone(int number, int model){
        this.number = number;
        this.model = model;
    }
    public Phone(){}
}

public class Exercise1{
    public static void main(String[] args){
        Phone Ph1 = new Phone();
        Phone Ph2 = new Phone();
        Phone Ph3 = new Phone();
        System.out.println(Ph1.number);
        System.out.println(Ph1.model);
        System.out.println(Ph1.weight);
        Ph1.receiveCall("Steve", "375298760202");
        Ph1.sendMessage("375298760202", "375297776431");
        System.out.println(Ph2.number);
        System.out.println(Ph2.model);
        System.out.println(Ph2.weight);
        Ph2.receiveCall("Bob", "375291119988");
        System.out.println(Ph3.number);
        System.out.println(Ph3.model);
        System.out.println(Ph3.weight);
        Ph3.receiveCall("Jack", "375299990066");
        // последний пункт (про JavaBean) не сделан
    }
}
