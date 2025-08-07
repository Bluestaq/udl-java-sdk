// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.substatus

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubstatusListResponseTest {

    @Test
    fun create() {
        val substatusListResponse =
            SubstatusListResponse.builder()
                .classificationMarking("U")
                .dataMode(SubstatusListResponse.DataMode.TEST)
                .notes("Sample Notes")
                .source("Bluestaq")
                .status(SubstatusListResponse.Status.FMC)
                .statusId("REF-STATUS-ID")
                .type(SubstatusListResponse.Type.MD_CAP)
                .id("SUBSTATUS-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("TST1")
                .build()

        assertThat(substatusListResponse.classificationMarking()).isEqualTo("U")
        assertThat(substatusListResponse.dataMode()).isEqualTo(SubstatusListResponse.DataMode.TEST)
        assertThat(substatusListResponse.notes()).isEqualTo("Sample Notes")
        assertThat(substatusListResponse.source()).isEqualTo("Bluestaq")
        assertThat(substatusListResponse.status()).isEqualTo(SubstatusListResponse.Status.FMC)
        assertThat(substatusListResponse.statusId()).isEqualTo("REF-STATUS-ID")
        assertThat(substatusListResponse.type()).isEqualTo(SubstatusListResponse.Type.MD_CAP)
        assertThat(substatusListResponse.id()).contains("SUBSTATUS-ID")
        assertThat(substatusListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(substatusListResponse.createdBy()).contains("some.user")
        assertThat(substatusListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(substatusListResponse.origNetwork()).contains("TST1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val substatusListResponse =
            SubstatusListResponse.builder()
                .classificationMarking("U")
                .dataMode(SubstatusListResponse.DataMode.TEST)
                .notes("Sample Notes")
                .source("Bluestaq")
                .status(SubstatusListResponse.Status.FMC)
                .statusId("REF-STATUS-ID")
                .type(SubstatusListResponse.Type.MD_CAP)
                .id("SUBSTATUS-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("TST1")
                .build()

        val roundtrippedSubstatusListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(substatusListResponse),
                jacksonTypeRef<SubstatusListResponse>(),
            )

        assertThat(roundtrippedSubstatusListResponse).isEqualTo(substatusListResponse)
    }
}
