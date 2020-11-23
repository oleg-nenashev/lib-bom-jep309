package io.jenkins.tools.bom.jep309.model;

import edu.umd.cs.findbugs.annotations.CheckForNull;
import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.Map;

/**
 * @author Oleg Nenashev
 * @since TODO
 */
@SuppressFBWarnings(value = "NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR", justification = "Fields come from JSON")
public class ComponentReference extends Reference {

    //TODO: properties are not required for the core

    @NonNull
  //  @JsonProperty(required = true)
    String groupId;

    @NonNull
  //  @JsonProperty(required = true)
    String artifactId;

    @NonNull
    public String getArtifactId() {
        return artifactId;
    }

    @NonNull
    public String getGroupId() {
        return groupId;
    }

    public void setArtifactId(@NonNull String artifactId) {
        this.artifactId = artifactId;
    }

    public void setGroupId(@NonNull String groupId) {
        this.groupId = groupId;
    }
}
