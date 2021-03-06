package com.darkkinglucifer.mvvmdemo.base.source;


import com.darkkinglucifer.mvvmdemo.base.util.CastUtil;

/**
 * 文件名: BaseLocalSource
 * 作者: yin
 * 日期: 2020/4/16 23:42
 * 描述: 本地资源基类
 */
public abstract class BaseLocalSource {

    /**
     * 获取子类类型实例
     *
     * @param <T> 泛型
     * @return 子类类型实例
     */
    public <T extends BaseLocalSource> T get() {
        return CastUtil.cast(this);
    }

    /**
     * 销毁回调
     */
    public void onCleared() {
    }

}
