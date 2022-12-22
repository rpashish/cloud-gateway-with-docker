package com.ashish.spring.demo.enquiry.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ashish.spring.demo.enquiry.beans.ProductEnquiryBean;

//@FeignClient(name="techefx-product-stock-service", url="localhost:8800")
@FeignClient(name="stock-service")
public interface ProductStockClient {

 @GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvailability}")
  public ProductEnquiryBean checkProductStock(@PathVariable String productName,
                                            @PathVariable String productAvailability);

}