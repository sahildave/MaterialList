package com.dexafree.materialList.cards;

import android.content.Context;
import com.dexafree.materialList.R;
import com.dexafree.materialList.cards.base.ThreeButtonsCard;

public class BasicImageButtonsCard extends ThreeButtonsCard {
    public BasicImageButtonsCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.material_basic_image_buttons_card_layout;
    }

}
