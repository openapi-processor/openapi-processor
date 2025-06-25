package io.openapiprocessor.samples.foo; // <1>

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openapiprocessor.openapi.support.Generated;
import java.util.UUID;

/**
 * Foo object description
 *
 * @param foo foo property description
 * @param id id property description
 */
@Generated(value = "openapi-processor-spring", version = "2025.3")
public record Foo(@JsonProperty("foo") String foo, @JsonProperty("id") UUID id) {
}
