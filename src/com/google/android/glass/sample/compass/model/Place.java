/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.glass.sample.compass.model;

/**
 * This class represents a point of interest that has geographical coordinates (latitude and
 * longitude) and a name that is displayed to the user.
 */
public class Place {

    private final double mLatitude;
    private final double mLongitude;
    private final String mName;
    private String mIcon;
    private String[] mTypes;
    private boolean mOpenNow;
    private double mRating;
    private String mVicinity;

    /**
     * Initializes a new place with the specified coordinates and name.
     *
     * @param latitude the latitude of the place
     * @param longitude the longitude of the place
     * @param name the name of the place
     */
    public Place(double latitude, double longitude, String name) {
        mLatitude = latitude;
        mLongitude = longitude;
        mName = name;
    }

    public Place(double latitude, double longitude, String name, String icon, String[] types, boolean openNow, double rating, String vicinity){
        mLatitude = latitude;
        mLongitude = longitude;
        mName = name;
        mIcon = icon;
        mTypes = types;
        mOpenNow = openNow;
        mRating = rating;
        mVicinity = vicinity;

    }

    /**
     * Gets the latitude of the place.
     *
     * @return the latitude of the place
     */
    public double getLatitude() {
        return mLatitude;
    }

    /**
     * Gets the longitude of the place.
     *
     * @return the longitude of the place
     */
    public double getLongitude() {
        return mLongitude;
    }

    /**
     * Gets the name of the place.
     *
     * @return the name of the place
     */
    public String getName() {
        return mName;
    }
}
