package it.uniba.api.gateway;

/**
 * An interface used to communicate with the Price microservice.
 */
public interface PriceClient {
  String getPrice();
}
