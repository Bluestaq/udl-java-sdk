// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectresponses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectResponseAbridgedTest {

    @Test
    fun create() {
        val collectResponseAbridged =
            CollectResponseAbridged.builder()
                .classificationMarking("U")
                .dataMode(CollectResponseAbridged.DataMode.TEST)
                .idRequest("REF-REQUEST-ID")
                .source("Bluestaq")
                .id("COLLECTRESPONSE-ID")
                .actualEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
                .actualStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .altEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
                .altStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .errCode("ERROR CODE")
                .externalId("EXTERNAL-ID")
                .idOnOrbit("REF-ONORBIT-ID")
                .idPlan("REF-PLAN-ID")
                .idSensor("REF-SENSOR-ID")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ORIGOBJECT-ID")
                .origSensorId("ORIGSENSOR-ID")
                .satNo(101)
                .addSrcId("DOA_ID")
                .addSrcId("DWELL_ID")
                .addSrcTyp("DOA")
                .addSrcTyp("DWELL")
                .status("ACCEPTED")
                .taskId("TASK-ID")
                .build()

        assertThat(collectResponseAbridged.classificationMarking()).isEqualTo("U")
        assertThat(collectResponseAbridged.dataMode())
            .isEqualTo(CollectResponseAbridged.DataMode.TEST)
        assertThat(collectResponseAbridged.idRequest()).isEqualTo("REF-REQUEST-ID")
        assertThat(collectResponseAbridged.source()).isEqualTo("Bluestaq")
        assertThat(collectResponseAbridged.id()).contains("COLLECTRESPONSE-ID")
        assertThat(collectResponseAbridged.actualEndTime())
            .contains(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
        assertThat(collectResponseAbridged.actualStartTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(collectResponseAbridged.altEndTime())
            .contains(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
        assertThat(collectResponseAbridged.altStartTime())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
        assertThat(collectResponseAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(collectResponseAbridged.createdBy()).contains("some.user")
        assertThat(collectResponseAbridged.errCode()).contains("ERROR CODE")
        assertThat(collectResponseAbridged.externalId()).contains("EXTERNAL-ID")
        assertThat(collectResponseAbridged.idOnOrbit()).contains("REF-ONORBIT-ID")
        assertThat(collectResponseAbridged.idPlan()).contains("REF-PLAN-ID")
        assertThat(collectResponseAbridged.idSensor()).contains("REF-SENSOR-ID")
        assertThat(collectResponseAbridged.notes()).contains("Example notes")
        assertThat(collectResponseAbridged.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(collectResponseAbridged.origNetwork()).contains("OPS1")
        assertThat(collectResponseAbridged.origObjectId()).contains("ORIGOBJECT-ID")
        assertThat(collectResponseAbridged.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(collectResponseAbridged.satNo()).contains(101)
        assertThat(collectResponseAbridged.srcIds().getOrNull())
            .containsExactly("DOA_ID", "DWELL_ID")
        assertThat(collectResponseAbridged.srcTyps().getOrNull()).containsExactly("DOA", "DWELL")
        assertThat(collectResponseAbridged.status()).contains("ACCEPTED")
        assertThat(collectResponseAbridged.taskId()).contains("TASK-ID")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectResponseAbridged =
            CollectResponseAbridged.builder()
                .classificationMarking("U")
                .dataMode(CollectResponseAbridged.DataMode.TEST)
                .idRequest("REF-REQUEST-ID")
                .source("Bluestaq")
                .id("COLLECTRESPONSE-ID")
                .actualEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
                .actualStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .altEndTime(OffsetDateTime.parse("2018-01-01T18:00:00.123456Z"))
                .altStartTime(OffsetDateTime.parse("2018-01-01T16:00:00.123456Z"))
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .errCode("ERROR CODE")
                .externalId("EXTERNAL-ID")
                .idOnOrbit("REF-ONORBIT-ID")
                .idPlan("REF-PLAN-ID")
                .idSensor("REF-SENSOR-ID")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origObjectId("ORIGOBJECT-ID")
                .origSensorId("ORIGSENSOR-ID")
                .satNo(101)
                .addSrcId("DOA_ID")
                .addSrcId("DWELL_ID")
                .addSrcTyp("DOA")
                .addSrcTyp("DWELL")
                .status("ACCEPTED")
                .taskId("TASK-ID")
                .build()

        val roundtrippedCollectResponseAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectResponseAbridged),
                jacksonTypeRef<CollectResponseAbridged>(),
            )

        assertThat(roundtrippedCollectResponseAbridged).isEqualTo(collectResponseAbridged)
    }
}
