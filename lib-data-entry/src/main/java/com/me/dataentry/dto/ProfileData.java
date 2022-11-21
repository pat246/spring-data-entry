package com.me.dataentry.dto;

import java.util.List;

public class ProfileData {

    public List<FieldData> fields;

    public static class FieldData {

        String name;
        String type;
        String entityNameForRead;

        public FieldData(String name, String type, String getEntityName) {
            super();
            this.name = name;
            this.type = type;
            this.entityNameForRead = getEntityName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getEntityNameForRead() {
            return entityNameForRead;
        }

        public void setEntityNameForRead(String entityNameForRead) {
            this.entityNameForRead = entityNameForRead;
        }

    }

    public List<FieldData> getFields() {
        return fields;
    }

    public void setFields(List<FieldData> fields) {
        this.fields = fields;
    }

}
