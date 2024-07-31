package com.doingjava.doing.Practice;

public class Exceptions {
    public void GeekforGeeks(){
        throw new Greeks();
    }

    public static void main(String[] args) {
        {
            try{
                new Exceptions().GeekforGeeks();
            }
            catch (Exception x){
                System.out.println("example of runtimeExceptions");
            }
        }
    }
    class Greeks extends RuntimeException{
        public Greeks(){
            super();
        }
    }
}
