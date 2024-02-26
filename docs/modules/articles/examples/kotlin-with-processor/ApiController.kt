package io.openapiprocessor.samples

import io.openapiprocessor.openapi.api.BarApi
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class ApiController: BarApi {

    override fun echoBar(bar: Bar): Bar {
        return bar
    }

    override fun getBars(pageable: Pageable?): Page<Bar> {
        return PageImpl(listOf(
            Bar("value 1"),
            Bar("value 2")
        ))
    }
}
