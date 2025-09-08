// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.groundimagery.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryQueryResponseTest {

    @Test
    fun create() {
        val historyQueryResponse =
            HistoryQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryQueryResponse.DataMode.TEST)
                .filename("Example file name")
                .imageTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .source("Bluestaq")
                .id("GROUNDIMAGERY-ID")
                .checksumValue("120EA8A25E5D487BF68B5F7096440019")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .filesize(0L)
                .format("PNG")
                .idSensor("SENSOR-ID")
                .addKeyword("KEYWORD1")
                .addKeyword("KEYWORD2")
                .name("Example name")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origSensorId("ORIGSENSOR-ID")
                .regionGeoJson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .regionNDims(2)
                .regionSRid(4326)
                .regionText(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .regionType("Polygon")
                .sourceDl("AXE")
                .subjectId("SUBJECT-ID")
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .transactionId("37bdef1f-5a4f-4776-bee4-7a1e0ec7d35a")
                .updatedAt(OffsetDateTime.parse("2018-01-02T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(historyQueryResponse.classificationMarking()).isEqualTo("U")
        assertThat(historyQueryResponse.dataMode()).isEqualTo(HistoryQueryResponse.DataMode.TEST)
        assertThat(historyQueryResponse.filename()).isEqualTo("Example file name")
        assertThat(historyQueryResponse.imageTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(historyQueryResponse.source()).isEqualTo("Bluestaq")
        assertThat(historyQueryResponse.id()).contains("GROUNDIMAGERY-ID")
        assertThat(historyQueryResponse.checksumValue())
            .contains("120EA8A25E5D487BF68B5F7096440019")
        assertThat(historyQueryResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(historyQueryResponse.createdBy()).contains("some.user")
        assertThat(historyQueryResponse.filesize()).contains(0L)
        assertThat(historyQueryResponse.format()).contains("PNG")
        assertThat(historyQueryResponse.idSensor()).contains("SENSOR-ID")
        assertThat(historyQueryResponse.keywords().getOrNull())
            .containsExactly("KEYWORD1", "KEYWORD2")
        assertThat(historyQueryResponse.name()).contains("Example name")
        assertThat(historyQueryResponse.notes()).contains("Example notes")
        assertThat(historyQueryResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(historyQueryResponse.origNetwork()).contains("OPS1")
        assertThat(historyQueryResponse.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(historyQueryResponse.regionGeoJson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(historyQueryResponse.regionNDims()).contains(2)
        assertThat(historyQueryResponse.regionSRid()).contains(4326)
        assertThat(historyQueryResponse.regionText())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(historyQueryResponse.regionType()).contains("Polygon")
        assertThat(historyQueryResponse.sourceDl()).contains("AXE")
        assertThat(historyQueryResponse.subjectId()).contains("SUBJECT-ID")
        assertThat(historyQueryResponse.tags().getOrNull())
            .containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(historyQueryResponse.transactionId())
            .contains("37bdef1f-5a4f-4776-bee4-7a1e0ec7d35a")
        assertThat(historyQueryResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-02T16:00:00.123Z"))
        assertThat(historyQueryResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val historyQueryResponse =
            HistoryQueryResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryQueryResponse.DataMode.TEST)
                .filename("Example file name")
                .imageTime(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
                .source("Bluestaq")
                .id("GROUNDIMAGERY-ID")
                .checksumValue("120EA8A25E5D487BF68B5F7096440019")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .filesize(0L)
                .format("PNG")
                .idSensor("SENSOR-ID")
                .addKeyword("KEYWORD1")
                .addKeyword("KEYWORD2")
                .name("Example name")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origSensorId("ORIGSENSOR-ID")
                .regionGeoJson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .regionNDims(2)
                .regionSRid(4326)
                .regionText(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .regionType("Polygon")
                .sourceDl("AXE")
                .subjectId("SUBJECT-ID")
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .transactionId("37bdef1f-5a4f-4776-bee4-7a1e0ec7d35a")
                .updatedAt(OffsetDateTime.parse("2018-01-02T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedHistoryQueryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(historyQueryResponse),
                jacksonTypeRef<HistoryQueryResponse>(),
            )

        assertThat(roundtrippedHistoryQueryResponse).isEqualTo(historyQueryResponse)
    }
}
