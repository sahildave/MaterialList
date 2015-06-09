package com.dexafree.materialList.cards;

import android.content.Context;
import com.dexafree.materialList.R;
import com.dexafree.materialList.cards.base.ThreeButtonsCard;

public class BigImageButtonsCard extends ThreeButtonsCard {
    public BigImageButtonsCard(final Context context) {
        super(context);
    }

    @Override
    public int getLayout() {
        return R.layout.material_image_with_buttons_card;
    }
}
