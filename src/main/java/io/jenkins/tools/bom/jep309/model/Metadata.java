package io.jenkins.tools.bom.jep309.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/**
 *
 * @author Oleg Nenashev
 * @since TODO
 */
public class Metadata {

    @CheckForNull
    @JsonProperty
    Map<String, String> labels;

    @CheckForNull
    @JsonProperty
    Map<String, String> annotations;

    public void setAnnotations(@CheckForNull Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public void setLabels(@CheckForNull Map<String, String> labels) {
        this.labels = labels;
    }

    @NonNull
    public Map<String, String> getAnnotations() {
        return annotations != null ? annotations : Collections.emptyMap();
    }

    @NonNull
    public Map<String, String> getLabels() {
        return labels != null ? labels : Collections.emptyMap();
    }
}
