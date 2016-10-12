package com.ritterdouglas.aptoidechallenge.view_model;

import com.ritterdouglas.aptoidechallenge.view_model.custom_data.DetailsLeanData;

public class FragmentDetailViewModel {

    private DetailsLeanData model;

    public FragmentDetailViewModel(DetailsLeanData model) {
        this.model = model;
    }

    public DetailsLeanData getModel() {
        return model;
    }

    public void setModel(DetailsLeanData model) {
        this.model = model;
    }
}
