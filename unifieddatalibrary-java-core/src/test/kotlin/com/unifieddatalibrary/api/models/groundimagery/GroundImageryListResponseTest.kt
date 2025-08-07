// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.groundimagery

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroundImageryListResponseTest {

    @Test
    fun create() {
        val groundImageryListResponse =
            GroundImageryListResponse.builder()
                .classificationMarking("U")
                .dataMode(GroundImageryListResponse.DataMode.TEST)
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
                .name("Example name")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
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
                .transactionId("37bdef1f-5a4f-4776-bee4-7a1e0ec7d35a")
                .build()

        assertThat(groundImageryListResponse.classificationMarking()).isEqualTo("U")
        assertThat(groundImageryListResponse.dataMode())
            .isEqualTo(GroundImageryListResponse.DataMode.TEST)
        assertThat(groundImageryListResponse.filename()).isEqualTo("Example file name")
        assertThat(groundImageryListResponse.imageTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(groundImageryListResponse.source()).isEqualTo("Bluestaq")
        assertThat(groundImageryListResponse.id()).contains("GROUNDIMAGERY-ID")
        assertThat(groundImageryListResponse.checksumValue())
            .contains("120EA8A25E5D487BF68B5F7096440019")
        assertThat(groundImageryListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(groundImageryListResponse.createdBy()).contains("some.user")
        assertThat(groundImageryListResponse.filesize()).contains(0L)
        assertThat(groundImageryListResponse.format()).contains("PNG")
        assertThat(groundImageryListResponse.idSensor()).contains("SENSOR-ID")
        assertThat(groundImageryListResponse.name()).contains("Example name")
        assertThat(groundImageryListResponse.notes()).contains("Example notes")
        assertThat(groundImageryListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(groundImageryListResponse.origNetwork()).contains("ORIG")
        assertThat(groundImageryListResponse.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(groundImageryListResponse.regionGeoJson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(groundImageryListResponse.regionNDims()).contains(2)
        assertThat(groundImageryListResponse.regionSRid()).contains(4326)
        assertThat(groundImageryListResponse.regionText())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(groundImageryListResponse.regionType()).contains("Polygon")
        assertThat(groundImageryListResponse.sourceDl()).contains("AXE")
        assertThat(groundImageryListResponse.subjectId()).contains("SUBJECT-ID")
        assertThat(groundImageryListResponse.transactionId())
            .contains("37bdef1f-5a4f-4776-bee4-7a1e0ec7d35a")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groundImageryListResponse =
            GroundImageryListResponse.builder()
                .classificationMarking("U")
                .dataMode(GroundImageryListResponse.DataMode.TEST)
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
                .name("Example name")
                .notes("Example notes")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
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
                .transactionId("37bdef1f-5a4f-4776-bee4-7a1e0ec7d35a")
                .build()

        val roundtrippedGroundImageryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groundImageryListResponse),
                jacksonTypeRef<GroundImageryListResponse>(),
            )

        assertThat(roundtrippedGroundImageryListResponse).isEqualTo(groundImageryListResponse)
    }
}
