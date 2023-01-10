package cn.zewade.business.dubbo;


import cn.zewade.common.api.BusinessDubboService;
import cn.zewade.common.api.OrderDubboService;
import cn.zewade.common.api.StockDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author wade
 * @date 2023/01/10 10:31
 **/
@DubboService
public class BusinessDubboServiceImpl implements BusinessDubboService {

    @DubboReference
    private OrderDubboService orderDubboService;

    @DubboReference
    private StockDubboService stockDubboService;

    @Override
    public String handleBusinessNormal(String request) {
        String stockResult = stockDubboService.decreaseStock("decreaseStock:some item");
        String orderResult = orderDubboService.createOrder("createOrder:order info");
        if (stockResult.equals("Success") && orderResult.equals("Success")) {
            return "Success";
        } else {
            return "Fail";
        }
    }
}
