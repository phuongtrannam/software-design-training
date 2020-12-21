package vds.infrastructure.producer;

public class ProducerFactory {
    private ProducerStrategyInterface sqlProducer = new SQLProducer();
    private ProducerStrategyInterface kafkaProducer = new KafkaProducer();

    public ProducerStrategyInterface getProducerStrategy(String type){
        switch(type){
            case "SQL":
                return sqlProducer;
            default:
                return kafkaProducer;
        }
    }
}
