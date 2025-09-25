// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter.staging

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StagingUpdateParamsTest {

    @Test
    fun create() {
        StagingUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .name("RF_NAME")
            .source("Bluestaq")
            .bodyId("ad88770b-d824-443f-bdce-5f9e3fa500a9")
            .altitude(1.57543)
            .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
            .createdBy("some.user")
            .extSysId("EXTSYS-ID")
            .lat(48.6732)
            .locationCountry("US")
            .lon(22.8455)
            .ownerCountry("US")
            .subtype("BLOCK_1")
            .type("TYPE_OF_EMITTER")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            StagingUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .name("RF_NAME")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            StagingUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .name("RF_NAME")
                .source("Bluestaq")
                .bodyId("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .altitude(1.57543)
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                .createdBy("some.user")
                .extSysId("EXTSYS-ID")
                .lat(48.6732)
                .locationCountry("US")
                .lon(22.8455)
                .ownerCountry("US")
                .subtype("BLOCK_1")
                .type("TYPE_OF_EMITTER")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.name()).isEqualTo("RF_NAME")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("ad88770b-d824-443f-bdce-5f9e3fa500a9")
        assertThat(body.altitude()).contains(1.57543)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.extSysId()).contains("EXTSYS-ID")
        assertThat(body.lat()).contains(48.6732)
        assertThat(body.locationCountry()).contains("US")
        assertThat(body.lon()).contains(22.8455)
        assertThat(body.ownerCountry()).contains("US")
        assertThat(body.subtype()).contains("BLOCK_1")
        assertThat(body.type()).contains("TYPE_OF_EMITTER")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StagingUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .name("RF_NAME")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.name()).isEqualTo("RF_NAME")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
