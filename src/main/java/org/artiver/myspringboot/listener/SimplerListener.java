package org.artiver.myspringboot.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SimplerListener implements ServletRequestListener {

    Logger logger = LoggerFactory.getLogger(SimplerListener.class);
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        logger.info("[SimpleListener] 监听器销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        logger.info("[SimpleListener] 监听器初始化");
    }
}
