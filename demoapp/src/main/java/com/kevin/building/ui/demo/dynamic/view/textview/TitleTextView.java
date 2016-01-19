package com.kevin.building.ui.demo.dynamic.view.textview;

import android.content.Context;
import android.view.Gravity;

import com.kevin.building.ui.demo.dynamic.bean.viewbean.item.TextItem;
import com.kevin.building.ui.demo.dynamic.view.base.AbsBaseTextView;

/**
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2016/1/19 15:19
 */
public class TitleTextView extends AbsBaseTextView {

    public TitleTextView(Context context, TextItem textItem) {
        super(context, textItem);
    }

    @Override
    protected int getGravity() {
        return Gravity.CENTER;
    }

    @Override
    protected int getTextSize() {
        return 18;
    }
}
