package com.dexafree.materialList.cards;


import android.content.Context;
import com.dexafree.materialList.R;
import com.dexafree.materialList.cards.base.ThreeButtonsCard;

public class BasicButtonsCard extends ThreeButtonsCard {
    public BasicButtonsCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.material_basic_buttons_card;
    }
}
