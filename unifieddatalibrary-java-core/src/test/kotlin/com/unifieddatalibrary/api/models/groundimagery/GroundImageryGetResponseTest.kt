// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.groundimagery

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroundImageryGetResponseTest {

    @Test
    fun create() {
        val groundImageryGetResponse =
            GroundImageryGetResponse.builder()
                .classificationMarking("U")
                .dataMode(GroundImageryGetResponse.DataMode.TEST)
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
                .origNetwork("ORIG")
                .origSensorId("ORIGSENSOR-ID")
                .region(
                    "POLYGON((26.156175339112 67.3291113966927,26.0910220642717 67.2580009640721,26.6637992964562 67.1795862381682,26.730115808233 67.2501237475598,26.156175339112 67.3291113966927))"
                )
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

        assertThat(groundImageryGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(groundImageryGetResponse.dataMode())
            .isEqualTo(GroundImageryGetResponse.DataMode.TEST)
        assertThat(groundImageryGetResponse.filename()).isEqualTo("Example file name")
        assertThat(groundImageryGetResponse.imageTime())
            .isEqualTo(OffsetDateTime.parse("2021-01-01T01:01:01.123456Z"))
        assertThat(groundImageryGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(groundImageryGetResponse.id()).contains("GROUNDIMAGERY-ID")
        assertThat(groundImageryGetResponse.checksumValue())
            .contains("120EA8A25E5D487BF68B5F7096440019")
        assertThat(groundImageryGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(groundImageryGetResponse.createdBy()).contains("some.user")
        assertThat(groundImageryGetResponse.filesize()).contains(0L)
        assertThat(groundImageryGetResponse.format()).contains("PNG")
        assertThat(groundImageryGetResponse.idSensor()).contains("SENSOR-ID")
        assertThat(groundImageryGetResponse.keywords().getOrNull())
            .containsExactly("KEYWORD1", "KEYWORD2")
        assertThat(groundImageryGetResponse.name()).contains("Example name")
        assertThat(groundImageryGetResponse.notes()).contains("Example notes")
        assertThat(groundImageryGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(groundImageryGetResponse.origNetwork()).contains("ORIG")
        assertThat(groundImageryGetResponse.origSensorId()).contains("ORIGSENSOR-ID")
        assertThat(groundImageryGetResponse.region())
            .contains(
                "POLYGON((26.156175339112 67.3291113966927,26.0910220642717 67.2580009640721,26.6637992964562 67.1795862381682,26.730115808233 67.2501237475598,26.156175339112 67.3291113966927))"
            )
        assertThat(groundImageryGetResponse.regionGeoJson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(groundImageryGetResponse.regionNDims()).contains(2)
        assertThat(groundImageryGetResponse.regionSRid()).contains(4326)
        assertThat(groundImageryGetResponse.regionText())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(groundImageryGetResponse.regionType()).contains("Polygon")
        assertThat(groundImageryGetResponse.sourceDl()).contains("AXE")
        assertThat(groundImageryGetResponse.subjectId()).contains("SUBJECT-ID")
        assertThat(groundImageryGetResponse.tags().getOrNull())
            .containsExactly("PROVIDER_TAG1", "PROVIDER_TAG2")
        assertThat(groundImageryGetResponse.transactionId())
            .contains("37bdef1f-5a4f-4776-bee4-7a1e0ec7d35a")
        assertThat(groundImageryGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-02T16:00:00.123Z"))
        assertThat(groundImageryGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val groundImageryGetResponse =
            GroundImageryGetResponse.builder()
                .classificationMarking("U")
                .dataMode(GroundImageryGetResponse.DataMode.TEST)
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
                .origNetwork("ORIG")
                .origSensorId("ORIGSENSOR-ID")
                .region(
                    "POLYGON((26.156175339112 67.3291113966927,26.0910220642717 67.2580009640721,26.6637992964562 67.1795862381682,26.730115808233 67.2501237475598,26.156175339112 67.3291113966927))"
                )
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

        val roundtrippedGroundImageryGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(groundImageryGetResponse),
                jacksonTypeRef<GroundImageryGetResponse>(),
            )

        assertThat(roundtrippedGroundImageryGetResponse).isEqualTo(groundImageryGetResponse)
    }
}
