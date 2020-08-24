package com.darkkinglucifer.mvvmdemo.util;

import android.os.Handler;

import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.ToastUtils;

/**
 * Function: 双击退出Util
 * Author: ShiJingFeng
 * Date: 2019/11/14 14:21
 * Description:
 */
public class DoubleClickExitUtil {

    /** 退出应用 */
    private static boolean mExitApp = false;

    public static void execute() {
        if (mExitApp) {
            //关闭所有的Activity
            ActivityUtils.finishAllActivities();
        } else {
            mExitApp = true;
            ToastUtils.showShort("再按一次退出应用");
            //超过两秒没有再次点击，则不退出App
            new Handler().postDelayed(() -> mExitApp = false, 2000);
        }
    }

}
