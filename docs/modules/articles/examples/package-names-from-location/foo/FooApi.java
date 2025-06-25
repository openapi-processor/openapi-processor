package io.openapiprocessor.samples.foo; // <1>

import io.openapiprocessor.openapi.support.Generated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Generated(value = "openapi-processor-spring", version = "2025.3")
public interface FooApi {

  /**
   * echo a Foo. simple sample endpoint
   *
   * @return foo
   */
  @PostMapping(
      path = "/foo",
      consumes = {"application/json"},
      produces = {"application/json"})
  Foo postFoo(@RequestBody(required = false) Foo body);

}
