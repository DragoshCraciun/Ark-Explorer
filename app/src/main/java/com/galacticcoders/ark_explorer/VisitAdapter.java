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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link VisitAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Visit} objects.
 */
public class VisitAdapter extends ArrayAdapter<Visit> {
    /**
     * Create a new {@link VisitAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param visits  is the list of {@link Visit}s to be displayed.
     */
    public VisitAdapter(Context context, ArrayList<Visit> visits) {
        super(context, 0, visits);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Visit} object located at this position in the list
        Visit currentVisit = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title_text_view.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the title from the currentVisit object and set this text on
        // the title TextView.
        titleTextView.setText(currentVisit.getTitle());

        // Find the TextView in the list_item.xml layout with the ID summary_text_view.
        TextView summaryTextView = (TextView) listItemView.findViewById(R.id.summary_text_view);
        // Get the summary from the currentVisit object and set this text on
        // the summary TextView.
        summaryTextView.setText(currentVisit.getSummary());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentVisit.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentVisit.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}