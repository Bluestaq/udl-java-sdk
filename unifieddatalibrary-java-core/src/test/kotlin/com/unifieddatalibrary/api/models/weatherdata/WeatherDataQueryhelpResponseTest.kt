// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.weatherdata

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WeatherDataQueryhelpResponseTest {

    @Test
    fun create() {
        val weatherDataQueryhelpResponse =
            WeatherDataQueryhelpResponse.builder()
                .aodrSupported(true)
                .classificationMarking("classificationMarking")
                .description("description")
                .historySupported(true)
                .name("name")
                .addParameter(
                    ParamDescriptor.builder()
                        .classificationMarking("classificationMarking")
                        .derived(true)
                        .description("description")
                        .elemMatch(true)
                        .format("format")
                        .histQuerySupported(true)
                        .histTupleSupported(true)
                        .name("name")
                        .required(true)
                        .restQuerySupported(true)
                        .restTupleSupported(true)
                        .type("type")
                        .unitOfMeasure("unitOfMeasure")
                        .utcDate(true)
                        .build()
                )
                .addRequiredRole("string")
                .restSupported(true)
                .sortSupported(true)
                .typeName("typeName")
                .uri("uri")
                .build()

        assertThat(weatherDataQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(weatherDataQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(weatherDataQueryhelpResponse.description()).contains("description")
        assertThat(weatherDataQueryhelpResponse.historySupported()).contains(true)
        assertThat(weatherDataQueryhelpResponse.name()).contains("name")
        assertThat(weatherDataQueryhelpResponse.parameters().getOrNull())
            .containsExactly(
                ParamDescriptor.builder()
                    .classificationMarking("classificationMarking")
                    .derived(true)
                    .description("description")
                    .elemMatch(true)
                    .format("format")
                    .histQuerySupported(true)
                    .histTupleSupported(true)
                    .name("name")
                    .required(true)
                    .restQuerySupported(true)
                    .restTupleSupported(true)
                    .type("type")
                    .unitOfMeasure("unitOfMeasure")
                    .utcDate(true)
                    .build()
            )
        assertThat(weatherDataQueryhelpResponse.requiredRoles().getOrNull())
            .containsExactly("string")
        assertThat(weatherDataQueryhelpResponse.restSupported()).contains(true)
        assertThat(weatherDataQueryhelpResponse.sortSupported()).contains(true)
        assertThat(weatherDataQueryhelpResponse.typeName()).contains("typeName")
        assertThat(weatherDataQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val weatherDataQueryhelpResponse =
            WeatherDataQueryhelpResponse.builder()
                .aodrSupported(true)
                .classificationMarking("classificationMarking")
                .description("description")
                .historySupported(true)
                .name("name")
                .addParameter(
                    ParamDescriptor.builder()
                        .classificationMarking("classificationMarking")
                        .derived(true)
                        .description("description")
                        .elemMatch(true)
                        .format("format")
                        .histQuerySupported(true)
                        .histTupleSupported(true)
                        .name("name")
                        .required(true)
                        .restQuerySupported(true)
                        .restTupleSupported(true)
                        .type("type")
                        .unitOfMeasure("unitOfMeasure")
                        .utcDate(true)
                        .build()
                )
                .addRequiredRole("string")
                .restSupported(true)
                .sortSupported(true)
                .typeName("typeName")
                .uri("uri")
                .build()

        val roundtrippedWeatherDataQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(weatherDataQueryhelpResponse),
                jacksonTypeRef<WeatherDataQueryhelpResponse>(),
            )

        assertThat(roundtrippedWeatherDataQueryhelpResponse).isEqualTo(weatherDataQueryhelpResponse)
    }
}
