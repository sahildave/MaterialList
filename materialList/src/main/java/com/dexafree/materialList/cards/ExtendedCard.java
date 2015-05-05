package com.dexafree.materialList.cards;

import android.content.Context;
import com.dexafree.materialList.events.BusProvider;

/**
 * The ExtendedCard set thre Buttons (right, middle and left).
 */
public abstract class ExtendedCard extends SimpleCard {
    protected String leftButtonText;
    protected String middleButtonText;
    protected String rightButtonText;
    protected int mRightButtonTextColor = -1;
    protected int mLeftButtonTextColor = -1;
    protected int mMiddleButtonTextColor = -1;
    protected OnButtonPressListener onLeftButtonPressedListener;
    protected OnButtonPressListener onRightButtonPressedListener;
    protected OnButtonPressListener onMiddleButtonPressedListener;
    protected boolean dividerVisible = false;
    protected boolean fullWidthDivider = false;

    public ExtendedCard(final Context context) {
        super(context);
    }

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

    public OnButtonPressListener getOnLeftButtonPressedListener() {
        return onLeftButtonPressedListener;
    }

    public void setOnLeftButtonPressedListener(OnButtonPressListener onLeftButtonPressedListener) {
        this.onLeftButtonPressedListener = onLeftButtonPressedListener;
    }

    public OnButtonPressListener getOnRightButtonPressedListener() {
        return onRightButtonPressedListener;
    }

    public void setOnRightButtonPressedListener(OnButtonPressListener onRightButtonPressedListener) {
        this.onRightButtonPressedListener = onRightButtonPressedListener;
    }

    public OnButtonPressListener getOnMiddleButtonPressedListener() {
        return onMiddleButtonPressedListener;
    }

    public void setOnMiddleButtonPressedListener(OnButtonPressListener onMiddleButtonPressedListener) {
        this.onMiddleButtonPressedListener = onMiddleButtonPressedListener;
    }
}
