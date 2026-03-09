class Car{
    String color;
    String transmission;
    int make;
    int tyres=4;
    int doors=4;


    public Car(int make,String color,String transmission){
        this.make=make;
        this.color=color;
        this.transmission=transmission;
    
    }

    public void displayCharacteristics(){
        System.out.println("Car Color:" + color);
        System.out.println("Car Transmissoin" + transmission);
        System.out.println("Car Make:" + make);
        System.out.println("Car tyre:" + tyres);
        System.out.println("Car Door:" + doors);

    }
    public void accelerate(){
        System.out.println("The car is moving fast");
    }
    public void brake(){
        System.out.println("Car has stopped");
    }
}




class Activity1{
    public static void main(String []args){
    Car car=new Car(2014,"Black","Manual");
    car.accelerate();
    car.brake();

    }

}


