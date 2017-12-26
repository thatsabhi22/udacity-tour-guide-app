package com.theleafapps.pro.model;

/**
 * Created by aviator on 25/12/17.
 */

/**
 * {@link Element} represents an element which represents any event, restaurant, or historical sites etc..
 * It contains a Image resource Id, element title and element description.
 */
public class Element {

    /**
     * List Item supporting image for the word
     */
    private int mImageResourceId;

    /**
     * List Item supporting title for the element
     */
    private String elementTitle;

    /**
     * List Item supporting description for the element
     */
    private String elementDescription;

    /**
     * List Item supporting location for the element
     * with Location Class
     */
    private Location location;

    /**
     * Create a new Element object.
     *
     * @param elementTitle       title of the element in the element list
     * @param elementDescription description of the element in the element list
     * @param mImageResourceId   image Resource id for the image on the elementList
     * @param location           location object for storing address of a place
     */
    public Element(String elementTitle, String elementDescription, int mImageResourceId, Location location) {
        this.elementTitle = elementTitle;
        this.elementDescription = elementDescription;
        this.mImageResourceId = mImageResourceId;
        this.location = location;
    }

    /**
     * Get List Item supporting image for the word
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Set List Item supporting image for the word
     */
    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    /**
     * Get the Title of the List Item Element
     */
    public String getElementTitle() {
        return elementTitle;
    }

    /**
     * Set List Item supporting image for the word
     */
    public void setElementTitle(String elementTitle) {
        this.elementTitle = elementTitle;
    }

    /**
     * Get the Description of the List Item Element
     */
    public String getElementDescription() {
        return elementDescription;
    }

    /**
     * Set the Description of the List Item Element
     */
    public void setElementDescription(String elementDescription) {
        this.elementDescription = elementDescription;
    }

    /**
     * Get the Location of the List Item Element
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Set the Location of the List Item Element
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Returns the string representation of the {@link Element} object.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "Element{" +
                "mImageResourceId=" + mImageResourceId +
                ", elementTitle='" + elementTitle + '\'' +
                ", elementDescription='" + elementDescription + '\'' +
                '}';
    }
}
