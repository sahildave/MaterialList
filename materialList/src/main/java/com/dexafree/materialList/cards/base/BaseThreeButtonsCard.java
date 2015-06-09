package com.dexafree.materialList.cards.base;

import android.content.Context;

import com.dexafree.materialList.events.BusProvider;
import com.dexafree.materialList.interfaces.OnButtonPressListener;

/**
 * The BaseThreeButtonsCard set thre Buttons (right, middle and left).
 */
public abstract class BaseThreeButtonsCard extends BaseSimpleCard {
    protected String leftButtonText="";
    protected String middleButtonText="";
    protected String rightButtonText="";
    protected int mRightButtonTextColor = -1;
    protected int mLeftButtonTextColor = -1;
    protected int mMiddleButtonTextColor = -1;
    protected OnButtonPressListener onLeftButtonPressedListener;
    protected OnButtonPressListener onRightButtonPressedListener;
    protected OnButtonPressListener onMiddleButtonPressedListener;
    protected boolean dividerVisible = false;
    protected boolean fullWidthDivider = false;

    public BaseThreeButtonsCard(final Context context) {
        super(context);
    }

    // Left
    public String getLeftButtonText() {
        return leftButtonText;
    }

    public void setLeftButtonText(int leftButtonTextId) {
        setLeftButtonText(getString(leftButtonTextId));
    }

    public void setLeftButtonText(String leftButtonText) {
        this.leftButtonText = leftButtonText;
        BusProvider.dataSetChanged();
    }


    public int getLeftButtonTextColor() {
        return mLeftButtonTextColor;
    }

    public void setLeftButtonTextColor(int color) {
        this.mLeftButtonTextColor = color;
        BusProvider.dataSetChanged();
    }

    public void setLeftButtonTextColorRes(int colorId) {
        setLeftButtonTextColor(getResources().getColor(colorId));
    }

    public OnButtonPressListener getOnLeftButtonPressedListener() {
        return onLeftButtonPressedListener;
    }

    public void setOnLeftButtonPressedListener(OnButtonPressListener onLeftButtonPressedListener) {
        this.onLeftButtonPressedListener = onLeftButtonPressedListener;
    }

    // Middle
    public String getMiddleButtonText() {
        return middleButtonText;
    }

    public void setMiddleButtonText(int middleButtonTextId) {
        setMiddleButtonText(getString(middleButtonTextId));
    }

    public void setMiddleButtonText(String middleButtonText) {
        this.middleButtonText = middleButtonText;
        BusProvider.dataSetChanged();
    }
    public int getMiddleButtonTextColor() {
        return mMiddleButtonTextColor;
    }

    public void setMiddleButtonTextColor(int color) {
        this.mMiddleButtonTextColor = color;
        BusProvider.dataSetChanged();
    }

    public void setMiddleButtonTextColorRes(int colorId) {
        setMiddleButtonTextColor(getResources().getColor(colorId));
    }

    public OnButtonPressListener getOnMiddleButtonPressedListener() {
        return onMiddleButtonPressedListener;
    }

    public void setOnMiddleButtonPressedListener(OnButtonPressListener onMiddleButtonPressedListener) {
        this.onMiddleButtonPressedListener = onMiddleButtonPressedListener;
    }

    // Right
    public String getRightButtonText() {
        return rightButtonText;
    }

    public void setRightButtonText(int rightButtonTextId) {
        setRightButtonText(getString(rightButtonTextId));
    }

    public void setRightButtonText(String rightButtonText) {
        this.rightButtonText = rightButtonText;
        BusProvider.dataSetChanged();
    }

    public int getRightButtonTextColor() {
        return mRightButtonTextColor;
    }

    public void setRightButtonTextColor(int color) {
        this.mRightButtonTextColor = color;
        BusProvider.dataSetChanged();
    }

    public void setRightButtonTextColorRes(int colorId) {
        setRightButtonTextColor(getResources().getColor(colorId));
    }

    public OnButtonPressListener getOnRightButtonPressedListener() {
        return onRightButtonPressedListener;
    }

    public void setOnRightButtonPressedListener(OnButtonPressListener onRightButtonPressedListener) {
        this.onRightButtonPressedListener = onRightButtonPressedListener;
    }

    // Others

    public boolean isDividerVisible() {
        return dividerVisible;
    }

    public boolean isFullWidthDivider() {
        return fullWidthDivider;
    }

    public void setFullWidthDivider(boolean fullWidthDivider) {
        this.fullWidthDivider = fullWidthDivider;
        BusProvider.dataSetChanged();
    }

    public void setDividerVisible(boolean visible) {
        this.dividerVisible = visible;
        BusProvider.dataSetChanged();
    }
}
