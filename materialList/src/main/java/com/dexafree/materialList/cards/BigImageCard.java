package com.dexafree.materialList.cards;

import android.content.Context;
import com.dexafree.materialList.R;
import com.dexafree.materialList.cards.base.BaseSimpleCard;

public class BigImageCard extends BaseSimpleCard {
    public BigImageCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.material_big_image_card_layout;
    }
}
