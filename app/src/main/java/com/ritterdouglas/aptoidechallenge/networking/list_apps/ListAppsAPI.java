package com.ritterdouglas.aptoidechallenge.networking.list_apps;

import com.ritterdouglas.aptoidechallenge.networking.NetworkingConstants;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ListAppsAPI {

    @GET(NetworkingConstants.BULK_REQUEST)
    Observable<Response<ListAppsResponse>> listApps();

}
