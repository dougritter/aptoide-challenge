package com.ritterdouglas.aptoidechallenge.networking.app_detail;

import com.ritterdouglas.aptoidechallenge.networking.NetworkingConstants;
import com.ritterdouglas.aptoidechallenge.networking.list_apps.ListAppsResponse;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface AppDetailAPI {

    String ID = "id";

    @GET(NetworkingConstants.APP_DETAIL)
    Observable<Response<DetailResponse>> getAppDetail(@Query(ID) int id);

}
