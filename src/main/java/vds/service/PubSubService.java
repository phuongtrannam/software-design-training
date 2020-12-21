package vds.service;

import vds.infrastructure.producer.ProducerFactory;
import vds.infrastructure.producer.ProducerStrategyInterface;
import vds.spi.PubSub;

public class PubSubService implements PubSub {
    private ProducerFactory producerFactory = new ProducerFactory();
    @Override
    public Object send(Object event) {
        ProducerStrategyInterface producerStrategy = producerFactory.getProducerStrategy("SQL");
        return producerStrategy.sendEvent(event);
    }
}
