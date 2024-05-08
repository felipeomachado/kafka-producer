package com.felipeomachado.kafka.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    private final SalesService salesService;


    public ProducerController(SalesService salesService) {
        this.salesService = salesService;
    }



    @GetMapping
    public void process() {
        //this.salesService.processSale();
    }
}
