package com.google.android.glass.sample.compass;

import com.google.android.glass.sample.compass.model.Place;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by conner on 11/22/13.
 */
public class PlacesService {

    private String mPlacesJSON;
    private OrientationManager orientationManager;
    private List<Place> mNearbyPlaces;


    public PlacesService(OrientationManager orientationManager){
        this.orientationManager = orientationManager;
    }

    public List<Place> getNearByPlaces(double lat, double lng){


        return mNearbyPlaces;
    }

    public void getPlacesJSON(double lat, double lng){

        double lat;
        double lng;
        //&types=food  &name=harbour
        RestClient.get("location="+lat+","+lng+"&radius=500&sensor=true&key=AIzaSyB7ZcaAbyw33ZGWy4P-2K3_fhhUimPA9uc", null, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(JSONObject itemObject) {
                mPlacesJSON = itemObject.toString();
                //Parses JSON String with GSON
                //parseItemList(mCacheJSONString);

            }
        });
    }
}
