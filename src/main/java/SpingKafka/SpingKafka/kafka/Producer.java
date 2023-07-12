package SpingKafka.SpingKafka.kafka;

import SpingKafka.SpingKafka.domain.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
    @Autowired
    private KafkaTemplate<String,String> kafka;
    @Autowired
    ObjectMapper mapper;

/*    public void sendString(){
        kafka.sendDefault("Hello world");
    }*/
    public void sendCustomer() throws JsonProcessingException {
        Customer customer= new Customer(1,"Daniel",1000);
        String json= mapper.writeValueAsString(customer);
        kafka.sendDefault(json);

    }
}
