package Models.Entities;
import Models.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> itemList = new ArrayList<>();

    public Order(){
    }

    public Order(Date moment, OrderStatus status, Client client){
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItemList() {
        return itemList;
    }

    public void addItem(OrderItem item){
        itemList.add(item);
    }

    public void removeItem(OrderItem item){
        itemList.remove(item);
    }

    public Double total(){
        double sum = '\0';
        for (OrderItem item: itemList){
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status:: " + status + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order items;");
        for (OrderItem item: itemList){
            sb.append(item);
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
