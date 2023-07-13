package io.openapiprocessor.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openapiprocessor.openapi.support.Generated;
import java.util.UUID;

@Generated(value = "openapi-processor-spring", version = "2023.3")
public class Foo {

    @JsonProperty("foo")
    private String foo;

    @JsonProperty("id")
    private UUID id;

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
