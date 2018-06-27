package com.yu.pojo;

/**
 * Created by dayu on 2018/6/27
 */
public class Person {

    /**
     * name : wangjinyang
     * address : {"city":"beijing","street":"dongcheng","postcode":"123456"}
     */

    private String name;
    private AddressBean address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public static class AddressBean {
        /**
         * city : beijing
         * street : dongcheng
         * postcode : 123456
         */

        private String city;
        private String street;
        private String postcode;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        @Override
        public String toString() {
            return "AddressBean{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", postcode='" + postcode + '\'' +
                    '}';
        }
    }
}
