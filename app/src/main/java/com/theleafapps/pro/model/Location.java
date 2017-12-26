package com.theleafapps.pro.model;

/**
 * Created by aviator on 26/12/17.
 */

/**
 * {@link Location} represents the address of the place in the list
 * It contains a address line 1, address line 2
 */
public class Location {

    /**
     * String that contains address line 1
     */
    private String address1;

    /**
     * String that contains address line 2
     */
    private String address2;

    /**
     * Create a new Location object
     *
     * @param address1 address line 1 of the place in the list
     * @param address2 address line 2 of the place in the list
     */
    public Location(String address1, String address2) {
        this.address1 = address1;
        this.address2 = address2;
    }

    /**
     * Get the address line 1 in String data-type
     *
     * @return address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Set the address line 1 in String data-type
     *
     * @param address1 address line 1 in String
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * Get the address line 2 in String data-type
     *
     * @return address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Set the address line 2 in String data-type
     *
     * @param address2 address line 2 in String
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * Returns the string representation of the {@link Location} object.
     *
     * @return String
     */
    @Override
    public String toString() {
        return address1 + " " + address2;
    }
}
