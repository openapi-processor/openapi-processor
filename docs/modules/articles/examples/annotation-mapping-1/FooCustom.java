package io.openapiprocessor.openapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.openapiprocessor.openapi.support.Generated;
import javax.validation.constraints.DecimalMin;
import io.openapiprocessor.samples.validations.Sum;

@Sum(24) // <1>
@Generated(value = "openapi-processor-spring", version = "2022.5")
public class Foo {

    @DecimalMin(value = "0")
    @JsonProperty("foo1")
    private Integer foo1;

    @DecimalMin(value = "-10")
    @JsonProperty("foo2")
    private Integer foo2;

    public Integer getFoo1() {
        return foo1;
    }

    public void setFoo1(Integer foo1) {
        this.foo1 = foo1;
    }

    public Integer getFoo2() {
        return foo2;
    }

    public void setFoo2(Integer foo2) {
        this.foo2 = foo2;
    }

}
