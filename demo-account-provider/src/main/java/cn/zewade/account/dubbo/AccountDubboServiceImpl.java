package cn.zewade.account.dubbo;

import cn.zewade.common.api.AccountDubboService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author wade
 * @date 2023/01/10 10:31
 **/
@DubboService
public class AccountDubboServiceImpl implements AccountDubboService {
    @Override
    public String decreaseAccount(String request) {
        System.out.println("decreaseAccount:" + request);
        return "Success";
    }
}
