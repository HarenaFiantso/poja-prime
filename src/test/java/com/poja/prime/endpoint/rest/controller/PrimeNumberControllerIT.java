package com.poja.prime.endpoint.rest.controller;

import com.poja.prime.conf.FacadeIT;
import java.math.BigInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PrimeNumberControllerIT extends FacadeIT {
  @Autowired PrimeNumberController primeNumberController;

  @Test
  void new_prime_ok() {
    BigInteger actual = primeNumberController.generatePrime();
    int certainly = (int) (99.99 * 100);

    Assertions.assertTrue(actual.isProbablePrime(certainly));
  }
}
