package com.dexafree.materialList.cards.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.dexafree.materialList.R;
import com.dexafree.materialList.cards.ExtendedCard;
import com.dexafree.materialList.cards.OnButtonPressListener;

public abstract class BaseButtonsDropDownCardItemView<T extends ExtendedCard> extends BaseTextCardItemView<T> {
    private final static int DIVIDER_MARGIN_DP = 16;

    public BaseButtonsDropDownCardItemView(Context context) {
        super(context);
    }

    public BaseButtonsDropDownCardItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public BaseButtonsDropDownCardItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void build(final T card) {
        super.build(card);

        // Left Button - Text
        final TextView leftText = (TextView) findViewById(R.id.left_text_button);

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

        // Middle Button - Text
        final TextView middleText = (TextView) findViewById(R.id.middle_text_button);

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

        // Right Button - Image
        final ImageButton rightImageButton = (ImageButton) findViewById(R.id.right_image_button);

//        int rightColor = card.getRightButtonTextColor();
//
//        if(rightColor != -1){
//            rightImageButton.setTextColor(rightColor);
//        }
//
//        rightImageButton.setText(card.getRightButtonText().toUpperCase());
//        if (card.getRightButtonTextColor() > -1) {
//            rightImageButton.setTextColor(card.getRightButtonTextColor());
//        }
        rightImageButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                OnButtonPressListener listener = card.getOnRightButtonPressedListener();
                if (listener != null) {
                    listener.onButtonPressedListener(rightImageButton, card);
                }
            }
        });

        // Divider
        int visibility = card.isDividerVisible() ? VISIBLE : INVISIBLE;

        View divider = findViewById(R.id.cardDivider);

        divider.setVisibility(visibility);

        // After setting the visibility, we prepare the divider params according to the preferences
        if (card.isDividerVisible()) {

            // If the divider has to be from side to side, the margin will be 0
            if (card.isFullWidthDivider()) {
                ((MarginLayoutParams) divider.getLayoutParams()).setMargins(0, 0, 0, 0);
            } else {
                int dividerMarginPx = (int) dpToPx(DIVIDER_MARGIN_DP);
                // Set the margin
                ((MarginLayoutParams) divider.getLayoutParams()).setMargins(
                        dividerMarginPx,
                        0,
                        dividerMarginPx,
                        0
                );
            }
        }
    }
}
