// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter.staging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StagingRetrieveResponseTest {

    @Test
    fun create() {
        val stagingRetrieveResponse =
            StagingRetrieveResponse.builder()
                .classificationMarking("U")
                .name("RF_NAME")
                .source("Bluestaq")
                .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
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

        assertThat(stagingRetrieveResponse.classificationMarking()).isEqualTo("U")
        assertThat(stagingRetrieveResponse.name()).isEqualTo("RF_NAME")
        assertThat(stagingRetrieveResponse.source()).isEqualTo("Bluestaq")
        assertThat(stagingRetrieveResponse.id()).contains("ad88770b-d824-443f-bdce-5f9e3fa500a9")
        assertThat(stagingRetrieveResponse.altitude()).contains(1.57543)
        assertThat(stagingRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
        assertThat(stagingRetrieveResponse.createdBy()).contains("some.user")
        assertThat(stagingRetrieveResponse.extSysId()).contains("EXTSYS-ID")
        assertThat(stagingRetrieveResponse.lat()).contains(48.6732)
        assertThat(stagingRetrieveResponse.locationCountry()).contains("US")
        assertThat(stagingRetrieveResponse.lon()).contains(22.8455)
        assertThat(stagingRetrieveResponse.ownerCountry()).contains("US")
        assertThat(stagingRetrieveResponse.subtype()).contains("BLOCK_1")
        assertThat(stagingRetrieveResponse.type()).contains("TYPE_OF_EMITTER")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stagingRetrieveResponse =
            StagingRetrieveResponse.builder()
                .classificationMarking("U")
                .name("RF_NAME")
                .source("Bluestaq")
                .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
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

        val roundtrippedStagingRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stagingRetrieveResponse),
                jacksonTypeRef<StagingRetrieveResponse>(),
            )

        assertThat(roundtrippedStagingRetrieveResponse).isEqualTo(stagingRetrieveResponse)
    }
}
