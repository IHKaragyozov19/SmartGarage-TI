package com.telerikacademy.web.smartgarageti.services.contracts;

import com.telerikacademy.web.smartgarageti.models.Order;
import com.telerikacademy.web.smartgarageti.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

public interface OrderService {

    void updateOrderStatus(int orderId, String newStatus, User user);

    Order getOrderById(int orderId, User user);

    List<Order> getAllOrders(User user);

    List<Order> getOrdersByUserId(User orderOwner, User loggedInUser);

    double calculateOrderTotalInCurrency(Order order, String currency);

    List<Order> getOrdersByClientCarIdExcludingNotStarted(int clientCarId, User user);

    double calculateOrderTotalInBgn(Order order);

    Page<Order> findAllOrdersByCriteria(Integer orderId,
                                        String ownerUsername,
                                        String licensePlate,
                                        String status,
                                        LocalDate visitedBefore,
                                        LocalDate visitedAfter,
                                        Pageable pageable);
}
