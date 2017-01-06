package org.springframework.social.salesforce.api.impl;

import org.springframework.social.ApiBinding;
import org.springframework.social.MissingAuthorizationException;

/**
 * @author Umut Utkan
 */
public class AbstractSalesForceOperations<T extends ApiBinding> {
  private static final String SALESFORCE_PROVIDER_ID = "salesforce";

    public static final String API_VERSION = "v26.0";

    protected T api;


    public AbstractSalesForceOperations(T api) {
        this.api = api;
    }

    protected void requireAuthorization() {
        if (!api.isAuthorized()) {
            throw new MissingAuthorizationException(SALESFORCE_PROVIDER_ID);
        }
    }

    protected static String BASE_URL = "https://na7.salesforce.com/services/data";

}
