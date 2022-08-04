# question1

How to run: 

-execute jar file
- make a get request to localhost:8080/getOrderDetails?orderId=Order1

you should get {
    "order": {
        "orderId": "Order1",
        "productId": "Prod1",
        "qty": 2.0
    },
    "shipment": {
        "orderId": "Order1",
        "shipmentId": "Ship1",
        "productId": "Prod1",
        "shipmentDate": "1970-01-01T00:00:02.000+00:00",
        "qty": 2.0
    }
}

-everything should be good

dependecies are Spring web and Lombok
