package io.openapiprocessor.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openapiprocessor.openapi.support.Generated;
import java.util.UUID;

@Generated(value = "openapi-processor-spring", version = "2023.3")
public record Foo(
    @JsonProperty("foo")
    String foo,

    @JsonProperty("id")
    UUID id
) {}
