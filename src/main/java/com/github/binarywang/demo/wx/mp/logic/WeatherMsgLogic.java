package com.github.binarywang.demo.wx.mp.logic;

import com.github.binarywang.demo.wx.mp.builder.TextBuilder;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

import java.util.Map;

/**
 * @program: myself
 * @description: 天气预报
 * @author: wangtongxing
 * @create: 2023-04-07 10:49
 **/
public class WeatherMsgLogic extends AMsgProcessLogic implements IMsgProcessLogic{
    WeatherMsgLogic(){
        super("天气");
    }
    @Override
    public WxMpXmlOutMessage process(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService weixinService, WxSessionManager sessionManager) {
        //调用国家气象局的接口，获取天气预报

        return new TextBuilder().build("晴空万里", wxMessage, weixinService);
    }
}
