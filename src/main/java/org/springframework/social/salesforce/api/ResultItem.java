package org.springframework.social.salesforce.api;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Umut Utkan
 */
public class ResultItem implements Serializable {

    /**
   *
   */
  private static final long serialVersionUID = 2973927389127719383L;

    private String type;

    private String url;

    private Map<String, Object> attributes;


    public ResultItem(String type, String url) {
        this.type = type;
        this.url = url;
        this.attributes = new HashMap<String, Object>();
    }


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

}
