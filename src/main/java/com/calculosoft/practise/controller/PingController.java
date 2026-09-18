package com.calculosoft.practise.controller;

import com.calculosoft.practise.service.IPingService;
import com.calculosoft.practise.service.impl.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * Created By   : Hassan Sohail
 * Email        : hassan.sohail@seamless.se
 * Created Date : 18/09/2026
 * Time         : 20:20
 * <p>
 * Copyright(c) 2026. Seamless Distribution Systems AB - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited. It is proprietary and confidential.
 * </p>
 ***/
@RestController
@RequestMapping("/ping")
public class PingController {


    @Autowired
    private IPingService pingService;


//    PingController() {
//        this.pingService = new PingService();
//    }


    // BASE_URL/ping/checkPing
    @GetMapping("/checkPing")
    public String checkPing() {
        return pingService.checkPingFromService();
    }





}
