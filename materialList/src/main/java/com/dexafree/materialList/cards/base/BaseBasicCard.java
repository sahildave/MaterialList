package com.dexafree.materialList.cards.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.dexafree.materialList.events.BusProvider;
import com.dexafree.materialList.model.Card;

public abstract class BaseBasicCard extends Card {
    private final Context mContext;
    private int mBackgroundColor = Color.WHITE;

    public BaseBasicCard(Context context) {
        mContext = context;
    }

    public void setBackgroundColor(int color) {
        mBackgroundColor = color;
        BusProvider.dataSetChanged();
    }

    public void setBackgroundColorRes(int colorId) {
        setBackgroundColor(getResources().getColor(colorId));
    }

    public int getBackgroundColor() {
        return mBackgroundColor;
    }

    protected String getString(int id) {
        return mContext.getString(id);
    }

    protected Resources getResources() {
        return mContext.getResources();
    }
}
