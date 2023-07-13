package io.openapiprocessor.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openapiprocessor.openapi.support.Generated;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.EqualsAndHashCode;

@Builder // <1>
@EqualsAndHashCode // <1>
@Generated(value = "openapi-processor-spring", version = "2023.3")
public class Bar {

    @Size(max = 20)
    @JsonProperty("bar")
    private String bar;

    // getter and setter
}
