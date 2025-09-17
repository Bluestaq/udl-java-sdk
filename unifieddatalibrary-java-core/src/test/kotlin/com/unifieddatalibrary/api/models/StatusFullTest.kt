// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusFullTest {

    @Test
    fun create() {
        val statusFull =
            StatusFull.builder()
                .classificationMarking("U")
                .dataMode(StatusFull.DataMode.TEST)
                .idEntity("ENTITY-ID")
                .source("Bluestaq")
                .id("STATUS-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                .declassificationString("U")
                .derivedFrom("SOME_SOURCE")
                .notes("Example Notes")
                .opsCap(StatusFull.OpsCap.FMC)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .state(StatusFull.State.ACTIVE)
                .addSubStatusCollection(
                    SubStatusFull.builder()
                        .classificationMarking("U")
                        .dataMode(SubStatusFull.DataMode.TEST)
                        .notes("Sample Notes")
                        .source("Bluestaq")
                        .status(SubStatusFull.Status.FMC)
                        .statusId("REF-STATUS-ID")
                        .type(SubStatusFull.Type.MD_CAP)
                        .id("SUBSTATUS-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .build()
                )
                .sysCap(StatusFull.SysCap.FMC)
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(statusFull.classificationMarking()).isEqualTo("U")
        assertThat(statusFull.dataMode()).isEqualTo(StatusFull.DataMode.TEST)
        assertThat(statusFull.idEntity()).isEqualTo("ENTITY-ID")
        assertThat(statusFull.source()).isEqualTo("Bluestaq")
        assertThat(statusFull.id()).contains("STATUS-ID")
        assertThat(statusFull.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(statusFull.createdBy()).contains("some.user")
        assertThat(statusFull.declassificationDate())
            .contains(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
        assertThat(statusFull.declassificationString()).contains("U")
        assertThat(statusFull.derivedFrom()).contains("SOME_SOURCE")
        assertThat(statusFull.notes()).contains("Example Notes")
        assertThat(statusFull.opsCap()).contains(StatusFull.OpsCap.FMC)
        assertThat(statusFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(statusFull.origNetwork()).contains("OPS1")
        assertThat(statusFull.state()).contains(StatusFull.State.ACTIVE)
        assertThat(statusFull.subStatusCollection().getOrNull())
            .containsExactly(
                SubStatusFull.builder()
                    .classificationMarking("U")
                    .dataMode(SubStatusFull.DataMode.TEST)
                    .notes("Sample Notes")
                    .source("Bluestaq")
                    .status(SubStatusFull.Status.FMC)
                    .statusId("REF-STATUS-ID")
                    .type(SubStatusFull.Type.MD_CAP)
                    .id("SUBSTATUS-ID")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .origin("THIRD_PARTY_DATASOURCE")
                    .origNetwork("OPS1")
                    .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .updatedBy("some.user")
                    .build()
            )
        assertThat(statusFull.sysCap()).contains(StatusFull.SysCap.FMC)
        assertThat(statusFull.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(statusFull.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statusFull =
            StatusFull.builder()
                .classificationMarking("U")
                .dataMode(StatusFull.DataMode.TEST)
                .idEntity("ENTITY-ID")
                .source("Bluestaq")
                .id("STATUS-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .declassificationDate(OffsetDateTime.parse("2021-01-01T01:02:02.123Z"))
                .declassificationString("U")
                .derivedFrom("SOME_SOURCE")
                .notes("Example Notes")
                .opsCap(StatusFull.OpsCap.FMC)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .state(StatusFull.State.ACTIVE)
                .addSubStatusCollection(
                    SubStatusFull.builder()
                        .classificationMarking("U")
                        .dataMode(SubStatusFull.DataMode.TEST)
                        .notes("Sample Notes")
                        .source("Bluestaq")
                        .status(SubStatusFull.Status.FMC)
                        .statusId("REF-STATUS-ID")
                        .type(SubStatusFull.Type.MD_CAP)
                        .id("SUBSTATUS-ID")
                        .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .createdBy("some.user")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("OPS1")
                        .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                        .updatedBy("some.user")
                        .build()
                )
                .sysCap(StatusFull.SysCap.FMC)
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedStatusFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statusFull),
                jacksonTypeRef<StatusFull>(),
            )

        assertThat(roundtrippedStatusFull).isEqualTo(statusFull)
    }
}
