/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.galacticcoders.ark_explorer;

/**
 * {@link Visit} represents two text views about what a user can do in nepal.
 * It contains a title, a summary, and an image for that visit.
 */
public class Visit {

    /**
     * Constant value that represents no image was provided for this visit
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Summary for the visit
     */
    private int mSummary;
    /**
     * Title for the visit
     */
    private int mTitle;
    /**
     * Image resource ID for the visit
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    /**
     * Create a new Visit object.
     *
     * @param summary         is the summary of the visit
     * @param title           is the title of the visit
     * @param imageResourceId is the drawable resource ID for the image associated with the visit
     */
    public Visit(int summary, int title, int imageResourceId) {
        mSummary = summary;
        mTitle = title;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the summary of the visit.
     */
    public int getSummary() {
        return mSummary;
    }

    /**
     * Get the title of the visit.
     */
    public int getTitle() {
        return mTitle;
    }

    /**
     * Return the image resource ID of the visit.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this visit.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
