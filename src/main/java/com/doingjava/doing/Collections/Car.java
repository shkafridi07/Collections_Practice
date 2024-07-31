package com.doingjava.doing.Collections;
interface In1{
    void diplay();
}
interface  IN2{
     void AWD();
}
 class Car  implements  In1,IN2{
    int age;
    String Brand;
@Override
    public void AWD(){
        System.out.println(" All wheel drive "+Brand);
    }
    public  void charging (){
        System.out.println("Electric car");
    }
     @Override
     public void diplay() {
         System.out.println("price"+Brand);
     }

     public Car(int age,String Brand) {
            this.age =age;
            this.Brand =Brand;
     }
 }
