package com.dexafree.materialList.interfaces;

import com.dexafree.materialList.model.Card;

public interface OnDismissCallback {
    void onDismiss(Card card, int position);
}
