// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfemitter

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfEmitterListResponseTest {

    @Test
    fun create() {
        val rfEmitterListResponse =
            RfEmitterListResponse.builder()
                .classificationMarking("U")
                .dataMode(RfEmitterListResponse.DataMode.TEST)
                .name("RF_NAME")
                .source("Bluestaq")
                .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                .createdBy("some.user")
                .extSysId("EXTSYS-ID")
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .subtype("BLOCK_1")
                .type("TYPE_OF_EMITTER")
                .build()

        assertThat(rfEmitterListResponse.classificationMarking()).isEqualTo("U")
        assertThat(rfEmitterListResponse.dataMode()).isEqualTo(RfEmitterListResponse.DataMode.TEST)
        assertThat(rfEmitterListResponse.name()).isEqualTo("RF_NAME")
        assertThat(rfEmitterListResponse.source()).isEqualTo("Bluestaq")
        assertThat(rfEmitterListResponse.id()).contains("ad88770b-d824-443f-bdce-5f9e3fa500a9")
        assertThat(rfEmitterListResponse.createdAt())
            .contains(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
        assertThat(rfEmitterListResponse.createdBy()).contains("some.user")
        assertThat(rfEmitterListResponse.extSysId()).contains("EXTSYS-ID")
        assertThat(rfEmitterListResponse.idEntity())
            .contains("0167f577-e06c-358e-85aa-0a07a730bdd0")
        assertThat(rfEmitterListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(rfEmitterListResponse.origNetwork()).contains("OPS1")
        assertThat(rfEmitterListResponse.subtype()).contains("BLOCK_1")
        assertThat(rfEmitterListResponse.type()).contains("TYPE_OF_EMITTER")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rfEmitterListResponse =
            RfEmitterListResponse.builder()
                .classificationMarking("U")
                .dataMode(RfEmitterListResponse.DataMode.TEST)
                .name("RF_NAME")
                .source("Bluestaq")
                .id("ad88770b-d824-443f-bdce-5f9e3fa500a9")
                .createdAt(OffsetDateTime.parse("2025-03-05T16:00:00.123Z"))
                .createdBy("some.user")
                .extSysId("EXTSYS-ID")
                .idEntity("0167f577-e06c-358e-85aa-0a07a730bdd0")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .subtype("BLOCK_1")
                .type("TYPE_OF_EMITTER")
                .build()

        val roundtrippedRfEmitterListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rfEmitterListResponse),
                jacksonTypeRef<RfEmitterListResponse>(),
            )

        assertThat(roundtrippedRfEmitterListResponse).isEqualTo(rfEmitterListResponse)
    }
}
