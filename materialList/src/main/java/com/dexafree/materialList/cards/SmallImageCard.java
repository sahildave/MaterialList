package com.dexafree.materialList.cards;

import android.content.Context;
import com.dexafree.materialList.R;
import com.dexafree.materialList.cards.base.BaseSimpleCard;

public class SmallImageCard extends BaseSimpleCard {
    public SmallImageCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.material_small_image_card;
    }
}
