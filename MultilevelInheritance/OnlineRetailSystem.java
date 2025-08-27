package Inheritance.MultilevelInheritance;

// Base class: Order
class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void getOrderStatus() {
        System.out.println("Order Status: Order placed.");
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Order Status: Shipped.");
    }
}

// Subclass of ShippedOrder: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Order Status: Delivered.");
    }
}

// Test class
public class OnlineRetailSystem {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder("ORD123", "2025-08-20", "TRK456", "2025-08-25");
        order.getOrderStatus();
    }
}
