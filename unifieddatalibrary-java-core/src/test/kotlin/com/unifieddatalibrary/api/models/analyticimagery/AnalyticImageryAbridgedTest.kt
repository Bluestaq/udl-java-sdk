// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.analyticimagery

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AnalyticImageryAbridgedTest {

    @Test
    fun create() {
        val analyticImageryAbridged =
            AnalyticImageryAbridged.builder()
                .classificationMarking("U")
                .content("CONTOUR")
                .dataMode(AnalyticImageryAbridged.DataMode.TEST)
                .description("Image description")
                .filename("IMAGE-NAME")
                .filesize(7654321L)
                .imageType("JPG")
                .msgTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .source("Bluestaq")
                .id("ANALYTIC-IMAGERY-ID")
                .agjson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .andims(2)
                .annLims(listOf(listOf(1, 1), listOf(1, 2), listOf(1, 3), listOf(1, 4)))
                .addAnnText("rec1")
                .addAnnText("rec2")
                .asrid(4326)
                .atext(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .atype("POLYGON")
                .checksumValue("123")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .dataStart(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .dataStop(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .idSensor("SENSOR-ID")
                .imageSetId("IMAGE-IDS")
                .imageSetLength(123)
                .imgHeight(123)
                .imgWidth(123)
                .addKeyword("Key1")
                .addKeyword("Key2")
                .origin("ORIGIN")
                .origNetwork("OPS1")
                .origSensorId("ORIG-SENSOR-ID")
                .addSatId("12004")
                .addSatId("12005")
                .addSatIdConf(0.98)
                .addSatIdConf(0.22)
                .sequenceId(123)
                .sourceDl("AXE")
                .addSrcId("DOA_ID")
                .addSrcId("DWELL_ID")
                .addSrcTyp("MTI")
                .addSrcTyp("POI")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("a7bdef1f-5a4f-4716-bee4-7a1e0ec7d35a")
                .xUnits("pixels")
                .yUnits("pixels")
                .zUnits("pixels")
                .build()

        assertThat(analyticImageryAbridged.classificationMarking()).isEqualTo("U")
        assertThat(analyticImageryAbridged.content()).isEqualTo("CONTOUR")
        assertThat(analyticImageryAbridged.dataMode())
            .isEqualTo(AnalyticImageryAbridged.DataMode.TEST)
        assertThat(analyticImageryAbridged.description()).isEqualTo("Image description")
        assertThat(analyticImageryAbridged.filename()).isEqualTo("IMAGE-NAME")
        assertThat(analyticImageryAbridged.filesize()).isEqualTo(7654321L)
        assertThat(analyticImageryAbridged.imageType()).isEqualTo("JPG")
        assertThat(analyticImageryAbridged.msgTime())
            .isEqualTo(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(analyticImageryAbridged.source()).isEqualTo("Bluestaq")
        assertThat(analyticImageryAbridged.id()).contains("ANALYTIC-IMAGERY-ID")
        assertThat(analyticImageryAbridged.agjson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(analyticImageryAbridged.andims()).contains(2)
        assertThat(analyticImageryAbridged.annLims().getOrNull())
            .containsExactly(listOf(1, 1), listOf(1, 2), listOf(1, 3), listOf(1, 4))
        assertThat(analyticImageryAbridged.annText().getOrNull()).containsExactly("rec1", "rec2")
        assertThat(analyticImageryAbridged.asrid()).contains(4326)
        assertThat(analyticImageryAbridged.atext())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(analyticImageryAbridged.atype()).contains("POLYGON")
        assertThat(analyticImageryAbridged.checksumValue()).contains("123")
        assertThat(analyticImageryAbridged.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(analyticImageryAbridged.createdBy()).contains("some.user")
        assertThat(analyticImageryAbridged.dataStart())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(analyticImageryAbridged.dataStop())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(analyticImageryAbridged.idSensor()).contains("SENSOR-ID")
        assertThat(analyticImageryAbridged.imageSetId()).contains("IMAGE-IDS")
        assertThat(analyticImageryAbridged.imageSetLength()).contains(123)
        assertThat(analyticImageryAbridged.imgHeight()).contains(123)
        assertThat(analyticImageryAbridged.imgWidth()).contains(123)
        assertThat(analyticImageryAbridged.keywords().getOrNull()).containsExactly("Key1", "Key2")
        assertThat(analyticImageryAbridged.origin()).contains("ORIGIN")
        assertThat(analyticImageryAbridged.origNetwork()).contains("OPS1")
        assertThat(analyticImageryAbridged.origSensorId()).contains("ORIG-SENSOR-ID")
        assertThat(analyticImageryAbridged.satId().getOrNull()).containsExactly("12004", "12005")
        assertThat(analyticImageryAbridged.satIdConf().getOrNull()).containsExactly(0.98, 0.22)
        assertThat(analyticImageryAbridged.sequenceId()).contains(123)
        assertThat(analyticImageryAbridged.sourceDl()).contains("AXE")
        assertThat(analyticImageryAbridged.srcIds().getOrNull())
            .containsExactly("DOA_ID", "DWELL_ID")
        assertThat(analyticImageryAbridged.srcTyps().getOrNull()).containsExactly("MTI", "POI")
        assertThat(analyticImageryAbridged.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(analyticImageryAbridged.transactionId())
            .contains("a7bdef1f-5a4f-4716-bee4-7a1e0ec7d35a")
        assertThat(analyticImageryAbridged.xUnits()).contains("pixels")
        assertThat(analyticImageryAbridged.yUnits()).contains("pixels")
        assertThat(analyticImageryAbridged.zUnits()).contains("pixels")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val analyticImageryAbridged =
            AnalyticImageryAbridged.builder()
                .classificationMarking("U")
                .content("CONTOUR")
                .dataMode(AnalyticImageryAbridged.DataMode.TEST)
                .description("Image description")
                .filename("IMAGE-NAME")
                .filesize(7654321L)
                .imageType("JPG")
                .msgTime(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .source("Bluestaq")
                .id("ANALYTIC-IMAGERY-ID")
                .agjson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .andims(2)
                .annLims(listOf(listOf(1, 1), listOf(1, 2), listOf(1, 3), listOf(1, 4)))
                .addAnnText("rec1")
                .addAnnText("rec2")
                .asrid(4326)
                .atext(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .atype("POLYGON")
                .checksumValue("123")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .dataStart(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .dataStop(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .idSensor("SENSOR-ID")
                .imageSetId("IMAGE-IDS")
                .imageSetLength(123)
                .imgHeight(123)
                .imgWidth(123)
                .addKeyword("Key1")
                .addKeyword("Key2")
                .origin("ORIGIN")
                .origNetwork("OPS1")
                .origSensorId("ORIG-SENSOR-ID")
                .addSatId("12004")
                .addSatId("12005")
                .addSatIdConf(0.98)
                .addSatIdConf(0.22)
                .sequenceId(123)
                .sourceDl("AXE")
                .addSrcId("DOA_ID")
                .addSrcId("DWELL_ID")
                .addSrcTyp("MTI")
                .addSrcTyp("POI")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("a7bdef1f-5a4f-4716-bee4-7a1e0ec7d35a")
                .xUnits("pixels")
                .yUnits("pixels")
                .zUnits("pixels")
                .build()

        val roundtrippedAnalyticImageryAbridged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(analyticImageryAbridged),
                jacksonTypeRef<AnalyticImageryAbridged>(),
            )

        assertThat(roundtrippedAnalyticImageryAbridged).isEqualTo(analyticImageryAbridged)
    }
}
