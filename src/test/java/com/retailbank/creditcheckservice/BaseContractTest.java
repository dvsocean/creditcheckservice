package com.retailbank.creditcheckservice;

import static com.retailbank.creditcheckservice.Score.HIGH;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class BaseContractTest {

  @Before
  public void setup(){
    final CreditCheckService creditCheckService = mock(CreditCheckService.class);
    when(creditCheckService.doCreditCheck(1234)).thenReturn(new CreditCheckResponse(HIGH));
    RestAssuredMockMvc.standaloneSetup(new CreditCheckController(creditCheckService));
  }



}
