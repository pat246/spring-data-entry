package com.me.dataentry.dto;

public class CustomLink {

    public static class Countries {
        public String href;
        public boolean templated;

        public Countries(String href, boolean templated) {
            super();
            this.href = href;
            this.templated = templated;
        }

    }

    public static class Persons {
        public String href;
        public Persons(String href, boolean templated) {
            super();
            this.href = href;
            this.templated = templated;
        }
        public boolean templated;
    }

    public static class Links {
        public Countries countries;
        public Persons persons;


    }

    public Links _links;

    public Links get_links() {
        return _links;
    }

    public void set_links(Links _links) {
        this._links = _links;
    }

}
