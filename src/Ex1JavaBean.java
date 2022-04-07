class PhoneJB{
    private long number;
    private double weight;
    private String model;

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setNumber(long number){
        this.number = number;
    }

    public long getNumber(){
        return number;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }
}

public class Ex1JavaBean {
    public static void main(String[] args){
        PhoneJB phone = new PhoneJB();
        phone.setModel("Samsung");
        phone.setNumber(8760202);
        phone.setWeight(0.7);
        System.out.println("Model: " + phone.getModel());
        System.out.println("Number: " + phone.getNumber());
        System.out.println("Weight: " + phone.getWeight() + " kg");
    }
}

