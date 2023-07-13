package io.openapiprocessor.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openapiprocessor.openapi.support.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

@Generated(value = "openapi-processor-spring", version = "2023.3")
public class Foo {

    @Size(max = 10)
    @JsonProperty("foo")
    private String foo;

    @JsonProperty("id")
    private String id;

    @Valid
    @JsonProperty("bar")
    private Bar bar;

    // getter and setter
}
