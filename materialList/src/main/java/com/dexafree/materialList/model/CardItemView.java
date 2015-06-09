package com.dexafree.materialList.model;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;


public abstract class CardItemView<T extends Card> extends LinearLayout {

    private T card;

    public CardItemView(Context context) {
        super(context);
    }

    public CardItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CardItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void build(T card){
        this.card = card;
    }

    public Object getTag(){
        return card.getTag();
    }

}