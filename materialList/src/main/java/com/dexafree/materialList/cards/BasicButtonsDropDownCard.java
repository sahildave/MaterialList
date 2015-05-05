package com.dexafree.materialList.cards;


import android.content.Context;

import com.dexafree.materialList.R;
import com.dexafree.materialList.cards.ExtendedCard;

public class BasicButtonsDropDownCard extends ExtendedCard {
    public BasicButtonsDropDownCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.material_basic_buttons_dropdown_card;
    }
}
