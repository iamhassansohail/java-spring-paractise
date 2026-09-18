package com.calculosoft.practise.service.impl;

import com.calculosoft.practise.service.IPingService;
import org.springframework.stereotype.Service;

/***
 * Created By   : Hassan Sohail
 * Email        : hassan.sohail@seamless.se
 * Created Date : 18/09/2026
 * Time         : 20:33
 * <p>
 * Copyright(c) 2026. Seamless Distribution Systems AB - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited. It is proprietary and confidential.
 * </p>
 ***/
@Service
public class PingService implements IPingService {


    @Override
    public String checkPingFromService (){
        return "API IS WORKING";
    }
}
