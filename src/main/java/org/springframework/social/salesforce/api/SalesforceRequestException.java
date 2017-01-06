package org.springframework.social.salesforce.api;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.social.ApiException;

/**
 * Encapsulates the error response sent by salesforce.
 * <p/>
 *
 * @see <a
 *      href="http://www.salesforce.com/us/developer/docs/api/Content/sforce_api_calls_concepts_core_data_objects.htm">
 *      Salesforce API Core Datatypes</a>
 *
 * @author Umut Utkan
 */
public class SalesforceRequestException extends ApiException implements Serializable {

    /**
   *
   */
  private static final long serialVersionUID = 9151436210150878166L;

    private static final String SALESFORCE_PROVIDER_ID = "salesforce";

    private final List<String> fields;
    private final String code;

    public SalesforceRequestException(String message) {
        super(SALESFORCE_PROVIDER_ID, message);
        this.code = null;
        this.fields = null;
    }

    @SuppressWarnings("unchecked")
    public SalesforceRequestException(Map<String, Object> errorDetails) {
        super(SALESFORCE_PROVIDER_ID, (String)errorDetails.get("message"));

        this.code = StringUtils.defaultString((String)errorDetails.get("errorCode"), "UNKNOWN");
        this.fields = (List<String>) errorDetails.get("fields");
    }

    public List<String> getFields() {
        return fields;
    }

    public String getCode() {
        return code;
    }

}
