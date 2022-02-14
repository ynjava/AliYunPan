package xin.xingk.www.mybatis;


import cn.hutool.aop.aspects.SimpleAspect;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;

/**
 * Author: 陈靖杰
 * Date: 2022/2/14 11:00
 * Description: Mybatis切面用于SQLSession开启和关闭
 */
@Slf4j
public class MybatisAspect extends SimpleAspect {

    @Override
    public boolean before(Object target, Method method, Object[] args) {
        MybatisPlusUtil.initSqlSession();
        log.info(">>> SqlSession进行初始化。。。");
        return true;
    }

    @Override
    public boolean after(Object target, Method method, Object[] args, Object returnVal) {
        MybatisPlusUtil.closeSqlSession();
        log.info(">>> SqlSession关闭。。。");
        return true;
    }
}
