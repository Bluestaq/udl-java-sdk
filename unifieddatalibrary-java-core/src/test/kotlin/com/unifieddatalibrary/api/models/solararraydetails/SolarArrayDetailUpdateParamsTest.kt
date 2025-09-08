// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.solararraydetails

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolarArrayDetailUpdateParamsTest {

    @Test
    fun create() {
        SolarArrayDetailUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(SolarArrayDetailUpdateParams.DataMode.TEST)
            .idSolarArray("SOLARARRAY-ID")
            .source("Bluestaq")
            .bodyId("SOLARARRAYDETAILS-ID")
            .area(123.4)
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .description("Example notes")
            .junctionTechnology("Triple")
            .manufacturerOrgId("MANUFACTURERORG-ID")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("OPS1")
            .span(123.4)
            .addTag("TAG1")
            .addTag("TAG2")
            .technology("Ga-As")
            .type("U Shaped")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SolarArrayDetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SolarArrayDetailUpdateParams.DataMode.TEST)
                .idSolarArray("SOLARARRAY-ID")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SolarArrayDetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SolarArrayDetailUpdateParams.DataMode.TEST)
                .idSolarArray("SOLARARRAY-ID")
                .source("Bluestaq")
                .bodyId("SOLARARRAYDETAILS-ID")
                .area(123.4)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Example notes")
                .junctionTechnology("Triple")
                .manufacturerOrgId("MANUFACTURERORG-ID")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .span(123.4)
                .addTag("TAG1")
                .addTag("TAG2")
                .technology("Ga-As")
                .type("U Shaped")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SolarArrayDetailUpdateParams.DataMode.TEST)
        assertThat(body.idSolarArray()).isEqualTo("SOLARARRAY-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("SOLARARRAYDETAILS-ID")
        assertThat(body.area()).contains(123.4)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.description()).contains("Example notes")
        assertThat(body.junctionTechnology()).contains("Triple")
        assertThat(body.manufacturerOrgId()).contains("MANUFACTURERORG-ID")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.span()).contains(123.4)
        assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(body.technology()).contains("Ga-As")
        assertThat(body.type()).contains("U Shaped")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SolarArrayDetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(SolarArrayDetailUpdateParams.DataMode.TEST)
                .idSolarArray("SOLARARRAY-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SolarArrayDetailUpdateParams.DataMode.TEST)
        assertThat(body.idSolarArray()).isEqualTo("SOLARARRAY-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
