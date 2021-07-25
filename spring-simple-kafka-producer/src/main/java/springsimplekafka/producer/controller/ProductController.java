package springsimplekafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springsimplekafka.producer.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final KafkaTemplate<String, Product> kafkaTemplate;
    private static final String TOPIC = "product-topic";

    public ProductController(KafkaTemplate<String, Product> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createProduct(@RequestBody Product productRequest){

        Product product = new Product();

        product.setProductId(productRequest.getProductId());
        product.setProductName(productRequest.getProductName());
        product.setProductSku(productRequest.getProductSku());
        product.setProductBarcode(productRequest.getProductBarcode());

        kafkaTemplate.send(TOPIC, product);

        return new ResponseEntity("SUCCESS CREATE PRODUCT", HttpStatus.OK);
    }
}
