package cn.zewade.order.dubbo;

import cn.zewade.common.api.AccountDubboService;
import cn.zewade.common.api.OrderDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author wade
 * @date 2023/01/10 10:31
 **/
@DubboService
public class OrderDubboServiceImpl implements OrderDubboService {

    @DubboReference
    private AccountDubboService accountDubboService;

    @Override
    public String createOrder(String request) {
        System.out.println("createOrder:" + request);
        if(accountDubboService.decreaseAccount("decrease:balance amount").equals("Success")) {
            return "Success";
        } else {
            return "Fail";
        }
    }
}
