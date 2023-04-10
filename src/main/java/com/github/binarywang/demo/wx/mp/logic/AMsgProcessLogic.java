package com.github.binarywang.demo.wx.mp.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: myself
 * @description: 消息处理抽象类
 * @author: wangtongxing
 * @create: 2023-04-07 09:54
 **/
@Component
public class AMsgProcessLogic {
    @Autowired
    TransferStation transferStation;

    private AMsgProcessLogic(){
    }

    AMsgProcessLogic(String prompt){
        transferStation.register(prompt, this.getClass().getName());
    }
}
