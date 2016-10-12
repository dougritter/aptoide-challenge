package com.ritterdouglas.aptoidechallenge.view_model;

import com.ritterdouglas.aptoidechallenge.networking.app_detail.DetailResponse;

public class FragmentDetailViewModel {

    private DetailsActivityViewModel.DetailsLeanData model;

    public FragmentDetailViewModel(DetailsActivityViewModel.DetailsLeanData model) {
        this.model = model;
    }

    public DetailsActivityViewModel.DetailsLeanData getModel() {
        return model;
    }

    public void setModel(DetailsActivityViewModel.DetailsLeanData model) {
        this.model = model;
    }
}
