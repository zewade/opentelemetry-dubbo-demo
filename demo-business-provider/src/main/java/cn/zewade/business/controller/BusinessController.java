package cn.zewade.business.controller;

import cn.zewade.common.api.BusinessDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wade
 * @date 2023/01/10 11:06
 **/
@RestController
public class BusinessController {

    @DubboReference
    private BusinessDubboService businessDubboService;

    @GetMapping("/handle-business")
    public String handleBusinessNormal() {
        return businessDubboService.handleBusinessNormal("handleBusinessNormal:from controller");
    }
}
