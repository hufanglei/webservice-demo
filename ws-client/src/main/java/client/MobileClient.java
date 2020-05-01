package client;

import cn.cad.mobile.MobileCodeWS;
import cn.cad.mobile.MobileCodeWSSoap;

/**
 * Title: MobileClient
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-01
 */
public class MobileClient {

    public static void main(String[] args) {
            //创建服务视图
            MobileCodeWS mobileCodeWS=new MobileCodeWS();
            //获取服务实现类
            MobileCodeWSSoap mobileCodeWSSoap= mobileCodeWS.getPort(MobileCodeWSSoap.class);
            //调用查询方法
            String message=mobileCodeWSSoap.getMobileCodeInfo("15166195973", null);
            System.out.println(message);



    }
}
