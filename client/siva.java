package client;

import model.Orderitem;
import service.Deliveryservice;
import service.Kitchenservice;

public class siva  {
    public static void Main(String args[]){

        Kitchenservice orDer=new Kitchenservice();
        System.out.println(orDer.getOrderitems("birayani",2));



    }


}
