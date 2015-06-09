package com.dexafree.materialList.cards;


import android.content.Context;

import com.dexafree.materialList.R;
import com.dexafree.materialList.cards.base.BaseThreeButtonsCard;

public class BasicButtonsDropDownCard extends BaseThreeButtonsCard {
    public BasicButtonsDropDownCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.material_basic_buttons_dropdown_card;
    }
}
