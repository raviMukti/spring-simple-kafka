package springsimplekafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @KafkaListener(topics = "product-topic", groupId = "product_string")
    public void consumeProduct(String product){
        System.out.println("Consumed String Product Message : " + product);
    }

}
