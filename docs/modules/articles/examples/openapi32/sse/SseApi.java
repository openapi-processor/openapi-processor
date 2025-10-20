package io.openapiprocessor.samples.sse;

import io.openapiprocessor.openapi.support.Generated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@Generated(value = "openapi-processor-spring", version = "2025.5")
public interface SseApi {

  /**
   * stream objects endpoint has a stream response
   *
   * @return sse
   */
  @GetMapping(path = "/sse", produces = {"application/json"})
  SseEmitter getSse(@RequestParam(name = "source", required = false) String source); // <1>

}
