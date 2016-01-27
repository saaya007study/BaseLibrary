package com.kevin.building.ui.demo.dynamic.bean.viewbean.item;

import com.kevin.building.ui.demo.dynamic.bean.viewbean.base.BaseItem;
import com.kevin.building.ui.demo.dynamic.bean.viewbean.type.ViewType;

/**
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2016/1/6 16:02
 */
public class BtnItem extends BaseItem {

    /**
     * 按钮类型
     */
    private int btnType;

    /**
     * 跳转目的页ID
     */
    private String skipId;

    /**
     * 定位类型
     */
    private int locationType;

    /**
     * 照片压缩方式
     */
    private int compressType;

    /**
     * 是否 开启电子围栏校验
     */
    private boolean useFence;

    /**
     * 是否 校验排重
     */
    private boolean checkDuplicate;

    /**
     * 排重距离
     */
    private int dupDistance;





    public int getLocationType() {
        return locationType;
    }

    public void setLocationType(int locationType) {
        this.locationType = locationType;
    }

    public int getCompressType() {
        return compressType;
    }

    public void setCompressType(int compressType) {
        this.compressType = compressType;
    }


    public String getSkipId() {
        return skipId;
    }

    public void setSkipId(String skipId) {
        this.skipId = skipId;
    }


    @Override
    public void setDefaultViewType() {
        setViewType(ViewType.BTN);
    }

    public int getBtnType() {
        return btnType;
    }

    public void setBtnType(int btnType) {
        this.btnType = btnType;
    }

    public boolean isUseFence() {
        return useFence;
    }

    public void setUseFence(boolean useFence) {
        this.useFence = useFence;
    }

    public boolean isCheckDuplicate() {
        return checkDuplicate;
    }

    public void setCheckDuplicate(boolean checkDuplicate) {
        this.checkDuplicate = checkDuplicate;
    }

    public int getDupDistance() {
        return dupDistance;
    }

    public void setDupDistance(int dupDistance) {
        this.dupDistance = dupDistance;
    }
}
