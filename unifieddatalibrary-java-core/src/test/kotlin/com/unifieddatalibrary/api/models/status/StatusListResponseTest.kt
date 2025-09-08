// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.status

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusListResponseTest {

    @Test
    fun create() {
        val statusListResponse =
            StatusListResponse.builder()
                .classificationMarking("U")
                .dataMode(StatusListResponse.DataMode.TEST)
                .idEntity("ENTITY-ID")
                .source("Bluestaq")
                .id("STATUS-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                .declassificationString("U")
                .derivedFrom("SOME_SOURCE")
                .notes("Example Notes")
                .opsCap(StatusListResponse.OpsCap.FMC)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .state(StatusListResponse.State.ACTIVE)
                .addSubStatusCollection(
                    StatusListResponse.SubStatusCollection.builder()
                        .classificationMarking("U")
                        .dataMode(StatusListResponse.SubStatusCollection.DataMode.TEST)
                        .notes("Sample Notes")
                        .source("Bluestaq")
                        .status(StatusListResponse.SubStatusCollection.Status.FMC)
                        .statusId("REF-STATUS-ID")
                        .type(StatusListResponse.SubStatusCollection.Type.MD_CAP)
                        .id("SUBSTATUS-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .build()
                )
                .sysCap(StatusListResponse.SysCap.FMC)
                .build()

        assertThat(statusListResponse.classificationMarking()).isEqualTo("U")
        assertThat(statusListResponse.dataMode()).isEqualTo(StatusListResponse.DataMode.TEST)
        assertThat(statusListResponse.idEntity()).isEqualTo("ENTITY-ID")
        assertThat(statusListResponse.source()).isEqualTo("Bluestaq")
        assertThat(statusListResponse.id()).contains("STATUS-ID")
        assertThat(statusListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(statusListResponse.createdBy()).contains("some.user")
        assertThat(statusListResponse.declassificationDate())
            .contains(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
        assertThat(statusListResponse.declassificationString()).contains("U")
        assertThat(statusListResponse.derivedFrom()).contains("SOME_SOURCE")
        assertThat(statusListResponse.notes()).contains("Example Notes")
        assertThat(statusListResponse.opsCap()).contains(StatusListResponse.OpsCap.FMC)
        assertThat(statusListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(statusListResponse.origNetwork()).contains("OPS1")
        assertThat(statusListResponse.state()).contains(StatusListResponse.State.ACTIVE)
        assertThat(statusListResponse.subStatusCollection().getOrNull())
            .containsExactly(
                StatusListResponse.SubStatusCollection.builder()
                    .classificationMarking("U")
                    .dataMode(StatusListResponse.SubStatusCollection.DataMode.TEST)
                    .notes("Sample Notes")
                    .source("Bluestaq")
                    .status(StatusListResponse.SubStatusCollection.Status.FMC)
                    .statusId("REF-STATUS-ID")
                    .type(StatusListResponse.SubStatusCollection.Type.MD_CAP)
                    .id("SUBSTATUS-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .build()
            )
        assertThat(statusListResponse.sysCap()).contains(StatusListResponse.SysCap.FMC)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statusListResponse =
            StatusListResponse.builder()
                .classificationMarking("U")
                .dataMode(StatusListResponse.DataMode.TEST)
                .idEntity("ENTITY-ID")
                .source("Bluestaq")
                .id("STATUS-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                .declassificationString("U")
                .derivedFrom("SOME_SOURCE")
                .notes("Example Notes")
                .opsCap(StatusListResponse.OpsCap.FMC)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .state(StatusListResponse.State.ACTIVE)
                .addSubStatusCollection(
                    StatusListResponse.SubStatusCollection.builder()
                        .classificationMarking("U")
                        .dataMode(StatusListResponse.SubStatusCollection.DataMode.TEST)
                        .notes("Sample Notes")
                        .source("Bluestaq")
                        .status(StatusListResponse.SubStatusCollection.Status.FMC)
                        .statusId("REF-STATUS-ID")
                        .type(StatusListResponse.SubStatusCollection.Type.MD_CAP)
                        .id("SUBSTATUS-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .build()
                )
                .sysCap(StatusListResponse.SysCap.FMC)
                .build()

        val roundtrippedStatusListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statusListResponse),
                jacksonTypeRef<StatusListResponse>(),
            )

        assertThat(roundtrippedStatusListResponse).isEqualTo(statusListResponse)
    }
}
