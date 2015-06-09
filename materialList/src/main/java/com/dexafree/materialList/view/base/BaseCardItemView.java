package com.dexafree.materialList.view.base;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

import com.dexafree.materialList.R;
import com.dexafree.materialList.cards.base.BasicCard;
import com.dexafree.materialList.model.CardItemView;

public abstract class BaseCardItemView<T extends BasicCard> extends CardItemView<T> {

    public BaseCardItemView(Context context) {
        super(context);
    }

    public BaseCardItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseCardItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void build(T card) {
        super.build(card);
        // Background Color
        CardView cardView = (CardView) findViewById(R.id.cardView);

        if (cardView != null) {
                cardView.setBackgroundColor(card.getBackgroundColor());
                cardView.setCardElevation(dpToPx(6));
        }
    }

    public float dpToPx(int dp) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }

    public float spToPx(int sp) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        return Math.round(sp * (displayMetrics.scaledDensity / DisplayMetrics.DENSITY_DEFAULT));
    }
}
