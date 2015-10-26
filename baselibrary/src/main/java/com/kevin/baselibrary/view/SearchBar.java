package com.kevin.baselibrary.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.kevin.baselibrary.R;

/**
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2015/10/26 11:06
 */
abstract public class SearchBar extends FrameLayout {

    private EditText et_search;
    private ImageView iv_clear;
    private Button btn_cancel;


    public SearchBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.search_bar_base_view, this);
        et_search = (EditText) findViewById(R.id.et_search);
        iv_clear = (ImageView) findViewById(R.id.iv_clear);
        btn_cancel = (Button) findViewById(R.id.btn_cancel);

        //添加点击监听 清理输入框文字
        iv_clear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                clearET();
            }
        });

        //搜索框添加 搜索键监听
        et_search.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String searchKey = v.getText().toString();
                return onSearch(searchKey);
            }
        });

        //搜索框添加 文字变化监听
        et_search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String textString = et_search.getText().toString();
                onEditTextChange(textString);
            }
        });

        //添加 取消按钮点击事件监听
        btn_cancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                onCancelClicked();
            }
        });


    }


    /**
     * 设置输入框 hint 内容
     *
     * @param hintStr
     */
    public void setHint(String hintStr) {
        if (!TextUtils.isEmpty(hintStr)) {
            et_search.setHint(hintStr);
        }
    }

    /**
     * 设置 取消按钮显示状态
     * @param visibility
     */
    public void setCancelBtnVisibility(int visibility) {
        btn_cancel.setVisibility(visibility);
    }

    /**
     * 清空 输入框
     */
    public void clearET() {
        et_search.setText("");
    }


    /**
     * 搜索回调
     *
     * @param searchKey
     * @return
     */
    abstract public boolean onSearch(String searchKey);

    /**
     * 输入框 文字变化监听 回调
     *
     * @param searchKey
     */
    abstract public void onEditTextChange(String searchKey);


    /**
     * 取消按钮点击事件 回调
     */
    abstract public void onCancelClicked();


}
