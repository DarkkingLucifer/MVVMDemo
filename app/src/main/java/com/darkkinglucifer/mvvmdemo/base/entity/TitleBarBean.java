package com.darkkinglucifer.mvvmdemo.base.entity;

import android.view.View;

import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.darkkinglucifer.mvvmdemo.R;


/**
 * @作者：Administrator
 * @时间：2020/5/25 11:37
 * @描述：
 **/
public class TitleBarBean {

    public interface OnItemEventListener {
        void onClick();
    }

    public interface OnRightTextClickListener {
        void onClick();
    }

    private OnItemEventListener mOnItemEventListener;

    private OnRightTextClickListener mOnRightTextClickListener;

    public ObservableInt titlebarVisibility = new ObservableInt(View.VISIBLE);

    public ObservableInt titlebarColor = new ObservableInt(R.color._FFFFFF);

    public ObservableInt ivLeft = new ObservableInt(R.mipmap.back);

    public ObservableInt ivLeftColor = new ObservableInt(R.color._000000);

    public ObservableInt tvCenterColor = new ObservableInt(R.color._000000);


    public View.OnClickListener ivLeftOnClick = v -> {
        if (mOnItemEventListener != null) {
            mOnItemEventListener.onClick();
        }
    };

    public View.OnClickListener tvRightOnClick = v -> {
        if (mOnRightTextClickListener != null) {
            mOnRightTextClickListener.onClick();
        }
    };

    public ObservableField<String> tvCenter = new ObservableField<>("");

    public ObservableInt tvRightVisibility = new ObservableInt(View.GONE);
    public ObservableField<String> tvRight = new ObservableField<>("");

    public ObservableInt ivRightVisibility = new ObservableInt(View.GONE);
    public ObservableInt ivRight = new ObservableInt(R.mipmap.ic_launcher);

    public void onBack(OnItemEventListener onItemEventListener) {
        mOnItemEventListener = onItemEventListener;
    }

    public void onRightTextClick(OnRightTextClickListener onRightTextClickListener) {
        mOnRightTextClickListener = onRightTextClickListener;
    }

}
