package com.dexafree.materialList.view.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.dexafree.materialList.R;
import com.dexafree.materialList.cards.base.BaseSimpleCard;
import com.squareup.picasso.Picasso;

public abstract class BaseTextCardItemView<T extends BaseSimpleCard> extends BaseCardItemView<T> {
    public BaseTextCardItemView(Context context) {
        super(context);
    }

    public BaseTextCardItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseTextCardItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void build(T card) {
		super.build(card);

        // Title
        TextView title = (TextView) findViewById(R.id.titleTextView);
        title.setText(card.getTitle());
        if (card.getTitleColor() != -1) {
            title.setTextColor(card.getTitleColor());
        }

        // Description
        TextView description = (TextView) findViewById(R.id.descriptionTextView);
        description.setText(card.getDescription());
        if (card.getDescriptionColor() != -1) {
            description.setTextColor(card.getDescriptionColor());
        }

        // Image
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        if (imageView != null) {
            if(card.getUrlImage() == null || card.getUrlImage().isEmpty()) {
                imageView.setImageDrawable(card.getDrawable());
            } else {
                Picasso.with(getContext()).load(card.getUrlImage()).into(imageView);
            }
        }

    }

}
