package org.springframework.social.salesforce.api;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Umut Utkan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SalesforceProfile implements Serializable {
    /**
   *
   */
  private static final long serialVersionUID = -4875364772403869048L;

    protected String id;

    protected String email;

    protected String firstName;

    protected String lastName;

    protected Photo photo;

    protected String name;


    /*public SalesforceProfile(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }*/


    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Photo getPhoto() {
        return this.photo;
    }

    public String getName() {
        return this.name;
    }

    public String getUsername() {
        return this.id;
    }
}
