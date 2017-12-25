package com.theleafapps.pro.Adpater;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.theleafapps.pro.Helper.StringEllipsizehHelper;
import com.theleafapps.pro.R;
import com.theleafapps.pro.model.Element;

import java.util.List;

/**
 * Created by aviator on 25/12/17.
 */

public class ElementAdapter extends ArrayAdapter<Element> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context  The current context. Used to inflate the layout file.
     * @param elements A List of Word objects to display in a list
     */
    public ElementAdapter(Context context, List<Element> elements) {
        super(context, 0, elements);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.list_item, parent, false);
        }

        Element currentElement = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID element_title that
        // represents title of the listview element
        TextView elementTitle = (TextView) listItemView.findViewById(R.id.element_title);

        // Get the element title from current Element object and
        // set this text on the elementTitle TextView
        elementTitle.setText(currentElement.getElementTitle());

        // Find the TextView in the list_item.xml layout with the ID element_description that
        // represents detail text of the listview element
        TextView elementDescription = (TextView) listItemView.findViewById(R.id.element_description);

        // Get the element title from current Element object and
        // set this text on the elementTitle TextView
        elementDescription.setText(StringEllipsizehHelper.ellipsize(currentElement.getElementDescription(),100));

        // Find the ImageView in the list_item.xml layout with the ID list_image
        ImageView wordImage = (ImageView) listItemView.findViewById(R.id.element_image);

        //If image resource not found visibility of the ImageView set to GONE
        if (currentElement.getmImageResourceId() == 0)
            wordImage.setVisibility(View.GONE);
        else
            wordImage.setImageResource(currentElement.getmImageResourceId());

        return listItemView;
    }
}
