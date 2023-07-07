package io.openapiprocessor.openapi.api;

import io.openapiprocessor.openapi.model.Foo;
import io.openapiprocessor.openapi.support.Generated;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Generated(value = "openapi-processor-spring", version = "2023.3")
public interface FooApi {

    /**
     * echo a Foo.
     *
     * simple sample endpoint
     *
     * @return foo
     */
    @PostMapping(path = "/foo", consumes = {"application/json"}, produces = {"application/json"})
    Foo postFoo(@RequestBody(required = false) @Valid Foo body);

}
