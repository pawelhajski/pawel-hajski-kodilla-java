package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrdersRepository ordersRepository;

    public ProductOrderService(final InformationService informationService,
                           final OrderService orderService,
                           final OrdersRepository ordersRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.ordersRepository = ordersRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProductName(),
                orderRequest.getQuantity());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser(), orderRequest.getProductName(), orderRequest.getQuantity());
            ordersRepository.createOrder(orderRequest.getUser(), orderRequest.getProductName(), orderRequest.getQuantity());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}