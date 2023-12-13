package com.poja.prime.endpoint.rest.controller;

import java.math.BigInteger;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/preprod")
public class PrimeNumberController {

  @GetMapping("/new-prime")
  public BigInteger generatePrime() {
    int bitLength = 10_000;
    return BigInteger.probablePrime(bitLength, new Random());
  }
}
