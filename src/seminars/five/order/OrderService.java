package seminars.five.order;

public class OrderService {
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public boolean placeOrder(String orderId, double amount) {

        return paymentService.processPayment(orderId, amount);
    }
}
