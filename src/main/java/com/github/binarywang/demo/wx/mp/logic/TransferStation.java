package com.github.binarywang.demo.wx.mp.logic;

/**
 * @program: myself
 * @description: 实现逻辑中转
 * @author: wangtongxing
 * @create: 2023-04-07 09:40
 **/

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class TransferStation implements ApplicationContextAware {

    /**
     * 用于保存接口实现类名及对应的类
     */
    private Map<String, IMsgProcessLogic> class2InstanceMap;
    private Map<String, String> prompt2ClassMap;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //根据接口类型返回相应的所有bean
        class2InstanceMap = applicationContext.getBeansOfType(IMsgProcessLogic.class);
    }

    public IMsgProcessLogic getInstance(String beanName) {
        return class2InstanceMap.get(beanName);
    }

    public void register(String prompt, String className){
        prompt2ClassMap.put(prompt, className);
    }

}
