package com.dexafree.materialList.cards;

import android.content.Context;

import com.dexafree.materialList.R;
import com.dexafree.materialList.cards.base.BaseThreeButtonsCard;

public class BasicImageButtonsCard extends BaseThreeButtonsCard {
    public BasicImageButtonsCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.material_basic_image_buttons_card_layout;
    }

}
