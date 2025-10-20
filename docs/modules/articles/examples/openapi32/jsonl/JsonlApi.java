package io.openapiprocessor.samples.jsonl;

import io.openapiprocessor.openapi.support.Generated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@Generated(value = "openapi-processor-spring", version = "2025.5")
public interface JsonlApi {

  /**
   * stream objects endpoint has a stream response
   *
   * @return jsonl stream
   */
  @GetMapping(path = "/jsonl", produces = {"application/jsonl"})
  StreamingResponseBody getJsonl(@RequestParam(name = "source", required = false) String source); // <1>

}
