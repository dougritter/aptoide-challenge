package com.ritterdouglas.aptoidechallenge.view_model;

import com.ritterdouglas.aptoidechallenge.networking.list_apps.List;

public class AppItemViewModel {

    private List model;

    public AppItemViewModel(List model) {
        this.model = model;
    }

    public List getModel() {
        return model;
    }

    public void setModel(List model) {
        this.model = model;
    }
}
