package SpingKafka.SpingKafka;

import SpingKafka.SpingKafka.kafka.Producer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpingKafkaApplicationTests {
	@Autowired
	Producer producer;

	@Test
	void contextLoads() throws JsonProcessingException {
		producer.sendCustomer();
	}

}
