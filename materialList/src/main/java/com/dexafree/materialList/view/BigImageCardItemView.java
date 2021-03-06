package com.dexafree.materialList.view;

import android.content.Context;
import android.util.AttributeSet;
import com.dexafree.materialList.cards.BigImageCard;
import com.dexafree.materialList.view.base.BaseTextCardItemView;

public class BigImageCardItemView<T extends BigImageCard> extends BaseTextCardItemView<T> {
    public BigImageCardItemView(Context context) {
        super(context);
    }

    public BigImageCardItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BigImageCardItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
