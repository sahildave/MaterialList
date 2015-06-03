package com.dexafree.materialList.cards;


import android.content.Context;

import com.dexafree.materialList.R;

public class BasicButtonsDropDownCard extends ExtendedCard {
    public BasicButtonsDropDownCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.material_basic_buttons_dropdown_card;
    }
}
