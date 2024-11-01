package seminars.five;

import org.junit.jupiter.api.Test;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;
import seminars.five.order.OrderService;
import seminars.five.order.PaymentService;
import seminars.five.user.UserRepository;
import seminars.five.user.UserService;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    @Test
    public void testGenerateRandomNumbers() {
        RandomNumberModule generator = new RandomNumberModule();
        int[] numbers = generator.generateRandomNumbers(10);

        assertEquals(10, numbers.length);
    }

    @Test
    public void testFindMaxNumber() {
        MaxNumberModule finder = new MaxNumberModule();
        int[] numbers = {1,2,3,4,5};

        assertEquals(5, finder.findMaxNumber(numbers));
    }

    @Test
    public void testFindMaxInGeneratedNumbers() {
        RandomNumberModule generator = new RandomNumberModule();
        MaxNumberModule finder = new MaxNumberModule();

        int[] numbers = generator.generateRandomNumbers(10);
        int maxNumber = finder.findMaxNumber(numbers);
        Arrays.sort(numbers);

        assertEquals(numbers[numbers.length - 1], maxNumber);
    }

    @Test
    public void testGetUserName() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String result = userService.getUserName(1);

        assertEquals("User 1", result);
    }

    @Test
    public void testPlaceOrder() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        boolean result = orderService.placeOrder("order1", 100);

        assertTrue(result);
    }
}