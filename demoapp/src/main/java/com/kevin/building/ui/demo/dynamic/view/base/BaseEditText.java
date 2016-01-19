package com.kevin.building.ui.demo.dynamic.view.base;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;

import com.kevin.building.R;
import com.kevin.building.ui.demo.dynamic.bean.viewbean.base.BaseItem;
import com.kevin.building.ui.demo.dynamic.bean.viewbean.item.EditTextItem;

/**
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2015/12/29 15:32
 */
public class BaseEditText extends BaseView {

    private TextView tv_index;
    private EditText editText;

    private EditTextItem editTextItem;


    public BaseEditText(Context context, BaseItem baseItem) {
        super(context, baseItem);
    }


    @Override
    protected int getLayoutId() {
        return R.layout.ctn_edittext;
    }

    @Override
    protected void initBase(BaseItem baseItem) {

        editTextItem = (EditTextItem) baseItem;
    }

    @Override
    protected void initView() {
        tv_index = (TextView) findViewById(R.id.tv_index);
        editText = (EditText) findViewById(R.id.et_input);


        tv_index.setText(editTextItem.getIndex());
        editText.setText(editTextItem.getContent());
        editText.setHint(editTextItem.getHint());
    }

    @Override
    protected void initLogic() {

    }
}
