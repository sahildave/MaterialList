package com.dexafree.materialList.view.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dexafree.materialList.R;
import com.dexafree.materialList.cards.base.BaseThreeButtonsCard;
import com.dexafree.materialList.interfaces.OnButtonPressListener;

public abstract class BaseButtonsCardItemView<T extends BaseThreeButtonsCard> extends BaseTextCardItemView<T> {
    private final static int DIVIDER_MARGIN_DP = 16;

    public BaseButtonsCardItemView(Context context) {
        super(context);
    }

    public BaseButtonsCardItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseButtonsCardItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void build(final T card) {
        super.build(card);

        // Left Button - Text
        final TextView leftText = (TextView) findViewById(R.id.left_text_button);
        if(leftText!=null) {
            int leftColor = card.getLeftButtonTextColor();

            if(leftColor != -1){
                leftText.setTextColor(leftColor);
            }

            leftText.setText(card.getLeftButtonText().toUpperCase());
            leftText.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {

                    OnButtonPressListener listener = card.getOnLeftButtonPressedListener();
                    if (listener != null) {
                        listener.onButtonPressedListener(leftText, card);
                    }
                }
            });
        }

        // Middle Button - Text
        final TextView middleText = (TextView) findViewById(R.id.middle_text_button);

        if (middleText!=null) {
            int middleColor = card.getMiddleButtonTextColor();

            if(middleColor != -1){
                middleText.setTextColor(middleColor);
            }

            middleText.setText(card.getMiddleButtonText().toUpperCase());
            if (card.getMiddleButtonTextColor() > -1) {
                middleText.setTextColor(card.getMiddleButtonTextColor());
            }
            middleText.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    OnButtonPressListener listener = card.getOnMiddleButtonPressedListener();
                    if(listener != null) {
                        listener.onButtonPressedListener(middleText, card);
                    }
                }
            });
        }

        // Right Button - Text
        final TextView rightText = (TextView) findViewById(R.id.right_text_button);
        if (rightText!=null) {
            int rightColor = card.getRightButtonTextColor();

            if(rightColor != -1){
                rightText.setTextColor(rightColor);
            }

            rightText.setText(card.getRightButtonText().toUpperCase());
            if (card.getRightButtonTextColor() > -1) {
                rightText.setTextColor(card.getRightButtonTextColor());
            }
            rightText.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    OnButtonPressListener listener = card.getOnRightButtonPressedListener();
                    if(listener != null) {
                        listener.onButtonPressedListener(rightText, card);
                    }
                }
            });
        }

        // Divider
        int visibility = card.isDividerVisible() ? VISIBLE : INVISIBLE;

        View divider = findViewById(R.id.cardDivider);

        divider.setVisibility(visibility);

        // After setting the visibility, we prepare the divider params according to the preferences
        if (card.isDividerVisible()) {

            // If the divider has to be from side to side, the margin will be 0
            if (card.isFullWidthDivider()) {
                ((ViewGroup.MarginLayoutParams) divider.getLayoutParams()).setMargins(0, 0, 0, 0);
            } else {
                int dividerMarginPx = (int) dpToPx(DIVIDER_MARGIN_DP);
                // Set the margin
                ((ViewGroup.MarginLayoutParams) divider.getLayoutParams()).setMargins(
                        dividerMarginPx,
                        0,
                        dividerMarginPx,
                        0
                );
            }
        }
    }
}
