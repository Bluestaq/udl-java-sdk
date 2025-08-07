// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.countries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import com.unifieddatalibrary.api.models.ParamDescriptor
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CountryQueryhelpResponseTest {

    @Test
    fun create() {
        val countryQueryhelpResponse =
            CountryQueryhelpResponse.builder()
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

        assertThat(countryQueryhelpResponse.aodrSupported()).contains(true)
        assertThat(countryQueryhelpResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(countryQueryhelpResponse.description()).contains("description")
        assertThat(countryQueryhelpResponse.historySupported()).contains(true)
        assertThat(countryQueryhelpResponse.name()).contains("name")
        assertThat(countryQueryhelpResponse.parameters().getOrNull())
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
        assertThat(countryQueryhelpResponse.requiredRoles().getOrNull()).containsExactly("string")
        assertThat(countryQueryhelpResponse.restSupported()).contains(true)
        assertThat(countryQueryhelpResponse.sortSupported()).contains(true)
        assertThat(countryQueryhelpResponse.typeName()).contains("typeName")
        assertThat(countryQueryhelpResponse.uri()).contains("uri")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val countryQueryhelpResponse =
            CountryQueryhelpResponse.builder()
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

        val roundtrippedCountryQueryhelpResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(countryQueryhelpResponse),
                jacksonTypeRef<CountryQueryhelpResponse>(),
            )

        assertThat(roundtrippedCountryQueryhelpResponse).isEqualTo(countryQueryhelpResponse)
    }
}
