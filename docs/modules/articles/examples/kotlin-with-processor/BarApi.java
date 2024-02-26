package io.openapiprocessor.openapi.api;

import io.openapiprocessor.openapi.support.Generated;
import io.openapiprocessor.samples.Bar;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Generated(value = "openapi-processor-spring", version = "2024.1")
public interface BarApi {

    /**
     * echo a Bar.
     * simple sample endpoint.
     *
     * @return the echoed Bar
     */
    @PostMapping(path = "/bar", consumes = {"application/json"}, produces = {"application/json"})
    Bar echoBar(@RequestBody @Valid @NotNull Bar body); // <1>

    /**
     * get Bar pages.
     * simple sample endpoint.
     *
     * @return a pages of Bar
     */
    @GetMapping(path = "/bars", produces = {"application/json"})
    Page<Bar> getBars(@Valid Pageable pageable); // <2>

}
