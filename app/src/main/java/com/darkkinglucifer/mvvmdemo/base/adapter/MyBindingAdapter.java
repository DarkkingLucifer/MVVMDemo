package com.darkkinglucifer.mvvmdemo.base.adapter;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.darkkinglucifer.mvvmdemo.R;
import com.darkkinglucifer.mvvmdemo.util.ImageLoaderUtil;

public class MyBindingAdapter {

    @BindingAdapter("android:src")
    public static void setSrc(ImageView view, Bitmap bitmap) {
        view.setImageBitmap(bitmap);
    }

    @BindingAdapter("android:src")
    public static void setSrc(ImageView view, int resId) {
        view.setImageResource(resId);
    }

    @BindingAdapter("android:src")
    public static void setSrc(ImageView view, Uri uri) {
        view.setImageURI(uri);
    }

    @BindingAdapter("setSrc")
    public static void setSrc(ImageView view, Object object) {
        if (object instanceof Integer) {
            view.setImageResource(((Integer) object).intValue());
        } else if (object instanceof Uri) {
            view.setImageURI((Uri) object);
        }
    }

    @BindingAdapter(value = "backgroundColor", requireAll = false)
    public static void setBackgroundColor(View view, int color) {
//        if (color instanceof Integer) {
        view.setBackgroundColor(view.getContext().getColor(color));
//        }else if (color instanceof String){
//            view.setBackgroundColor(Color.parseColor((String) color));
//        }
    }

    @BindingAdapter(value = "backgroundColor", requireAll = false)
    public static void setBackgroundColor(View view, String color) {
//        if (color instanceof Integer) {
//        view.setBackgroundColor(view.getContext().getColor((Integer) color));
//        }else if (color instanceof String){
        view.setBackgroundColor(Color.parseColor((String) color));
//        }
    }

    @BindingAdapter(value = "backgroundDrawable", requireAll = false)
    public static void setBackgroundDrawable(ImageView view, int drawable) {
        view.setBackgroundResource(drawable);
    }

    @BindingAdapter(value = "setTintColor", requireAll = false)
    public static void setTintColor(ImageView imageView, int colorId) {
        imageView.setColorFilter(imageView.getContext().getColor(colorId));
    }

    @BindingAdapter(value = "setTextColor", requireAll = false)
    public static void setTintColor(TextView textView, int colorId) {
        textView.setTextColor(textView.getContext().getColor(colorId));
    }

    @BindingAdapter(value = "imageUrl", requireAll = true)
    public static void setSrc(ImageView imageView, String url) {
//        Glide.with(imageView.getContext()).load(url)
//                .placeholder(R.mipmap.ic_launcher)
//                .into(imageView);
        ImageLoaderUtil.getInstance().display(imageView.getContext(), imageView, url, R.mipmap.ic_launcher, R.mipmap.ic_launcher, ImageLoaderUtil.ImageType.DEFAULT);
    }

//    @BindingAdapter(value = {"imageUrl", "placeHolder", "error"}, requireAll = false)
//    public static void loadImage(ImageView imageView, String url, Drawable holderDrawable, Drawable errorDrawable) {
//        Glide.with(imageView.getContext())
//                .load(url)
//                .placeholder(holderDrawable)
//                .error(errorDrawable)
//                .into(imageView);
//    }

//    @BindingAdapter("setDatas")
//    public static void setDatas(RecyclerView recyclerView, List<BaseEntity> datas) {
//        CommonRecycleViewAdapter commonRecycleViewAdapter=new CommonRecycleViewAdapter()
//    }

}
