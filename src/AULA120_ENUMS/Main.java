package AULA120_ENUMS;

import java.util.Date;

import AULA120_ENUMS.entities.Order;
import AULA120_ENUMS.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		Order order = new Order(123, new Date(), OrderStatus.PENDING_ORDER);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
