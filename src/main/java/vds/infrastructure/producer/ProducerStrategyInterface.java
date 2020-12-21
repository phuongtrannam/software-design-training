package vds.infrastructure.producer;

public interface ProducerStrategyInterface {
    public Object sendEvent(Object event);
}
