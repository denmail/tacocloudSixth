package tacos.tacocloud.data;

import tacos.tacocloud.Order;

public interface OrderRepository {
    Order save(Order order);
}
