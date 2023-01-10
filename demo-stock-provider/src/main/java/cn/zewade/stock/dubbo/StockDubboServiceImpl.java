package cn.zewade.stock.dubbo;

import cn.zewade.common.api.StockDubboService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author wade
 * @date 2023/01/10 10:31
 **/
@DubboService
public class StockDubboServiceImpl implements StockDubboService {

    @Override
    public String decreaseStock(String request) {
        System.out.println("decreaseStock:" + request);
        return "Success";
    }
}
