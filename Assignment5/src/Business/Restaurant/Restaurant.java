/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author harold
 */
import Business.Order.Order;
import java.util.ArrayList;

public class Restaurant {
    
    private String adminUserName;
    private ArrayList<Menu> Menu;
    private ArrayList<Order> orderList;
    int id=1;
    private String name;
    private String address;
    private String number;
    
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
        public Restaurant(String UName) {
        this.adminUserName=UName;
        Menu=new ArrayList<Menu>();
        orderList=new ArrayList<Order>();
    }
    
    
    public void addOrder(String restaurentName, String customerName, String deliverMan, ArrayList<Menu> Order, String cost, String deliveryAddress) {
        Order order=new Order();
        order.setOrder_id(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurentName(restaurentName);
        order.setDeliverMan(deliverMan);
        order.setOrder(Order);
        order.setCost(cost);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatus("New Order");
        orderList.add(order);
        id++;
    }
    public ArrayList<Menu> getMenu() {
        return Menu;
    }
    public void addDishes(Menu menu){
        
        Menu.add(menu);
    }
    public void removeDishes(Menu menu){
        Menu.remove(menu);
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAdminUName() {
        return adminUserName;
    }

    public void setAdminUName(String adminUserName) {
        this.adminUserName = adminUserName;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
