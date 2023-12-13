package com.poja.prime.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Random;

@RestController
@RequestMapping("/preprod")
public class PrimeNumberController {

  @GetMapping("/new-prime")
  public BigInteger generatePrime() {
    int bitLength = 10_000;
    return BigInteger.probablePrime(bitLength, new Random());
  }
}
