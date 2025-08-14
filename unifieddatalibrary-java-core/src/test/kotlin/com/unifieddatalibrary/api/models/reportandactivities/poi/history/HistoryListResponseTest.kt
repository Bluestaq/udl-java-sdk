// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.reportandactivities.poi.history

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoryListResponseTest {

    @Test
    fun create() {
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
                .name("POI_NAME")
                .poiid("POI-ID")
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .id("POI-ID")
                .activity("TRAINING")
                .agjson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .alt(5.23)
                .andims(3)
                .area(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .asrid(3)
                .asset("PLATFORM_NAME")
                .atext(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .atype("Type1")
                .az(45.23)
                .beNumber("0427RT1030")
                .ce(10.23)
                .cntct("Contact Info")
                .conf(0.5)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .desc("Description of the object")
                .el(45.23)
                .elle(listOf(125.5, 85.1, 125.75))
                .env("SURFACE")
                .addGroup("GROUP1")
                .addGroup("GROUP2")
                .how("h-g-i-g-o")
                .ident("FRIEND")
                .addIdWeatherReport("WEATHER-EVENT-ID1")
                .addIdWeatherReport("WEATHER-EVENT-ID2")
                .lat(45.23)
                .le(10.23)
                .lon(45.23)
                .msnid("MSN-ID")
                .orientation(45.23)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .plat("COMBAT_VEHICLE")
                .pps("BDA")
                .pri(2)
                .sourceDl("AXE")
                .spec("LIGHT_TANK")
                .addSrcId("ID1")
                .addSrcId("ID2")
                .addSrcTyp("TYPE1")
                .addSrcTyp("TYPE2")
                .stale(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .start(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .trkid("TRK-ID")
                .type("a-h-G")
                .addUrl("URL1")
                .addUrl("URL2")
                .build()

        assertThat(historyListResponse.classificationMarking()).isEqualTo("U")
        assertThat(historyListResponse.dataMode()).isEqualTo(HistoryListResponse.DataMode.TEST)
        assertThat(historyListResponse.name()).isEqualTo("POI_NAME")
        assertThat(historyListResponse.poiid()).isEqualTo("POI-ID")
        assertThat(historyListResponse.source()).isEqualTo("Bluestaq")
        assertThat(historyListResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
        assertThat(historyListResponse.id()).contains("POI-ID")
        assertThat(historyListResponse.activity()).contains("TRAINING")
        assertThat(historyListResponse.agjson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(historyListResponse.alt()).contains(5.23)
        assertThat(historyListResponse.andims()).contains(3)
        assertThat(historyListResponse.area())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(historyListResponse.asrid()).contains(3)
        assertThat(historyListResponse.asset()).contains("PLATFORM_NAME")
        assertThat(historyListResponse.atext())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(historyListResponse.atype()).contains("Type1")
        assertThat(historyListResponse.az()).contains(45.23)
        assertThat(historyListResponse.beNumber()).contains("0427RT1030")
        assertThat(historyListResponse.ce()).contains(10.23)
        assertThat(historyListResponse.cntct()).contains("Contact Info")
        assertThat(historyListResponse.conf()).contains(0.5)
        assertThat(historyListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(historyListResponse.createdBy()).contains("some.user")
        assertThat(historyListResponse.desc()).contains("Description of the object")
        assertThat(historyListResponse.el()).contains(45.23)
        assertThat(historyListResponse.elle().getOrNull()).containsExactly(125.5, 85.1, 125.75)
        assertThat(historyListResponse.env()).contains("SURFACE")
        assertThat(historyListResponse.groups().getOrNull()).containsExactly("GROUP1", "GROUP2")
        assertThat(historyListResponse.how()).contains("h-g-i-g-o")
        assertThat(historyListResponse.ident()).contains("FRIEND")
        assertThat(historyListResponse.idWeatherReport().getOrNull())
            .containsExactly("WEATHER-EVENT-ID1", "WEATHER-EVENT-ID2")
        assertThat(historyListResponse.lat()).contains(45.23)
        assertThat(historyListResponse.le()).contains(10.23)
        assertThat(historyListResponse.lon()).contains(45.23)
        assertThat(historyListResponse.msnid()).contains("MSN-ID")
        assertThat(historyListResponse.orientation()).contains(45.23)
        assertThat(historyListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(historyListResponse.origNetwork()).contains("ORIG")
        assertThat(historyListResponse.plat()).contains("COMBAT_VEHICLE")
        assertThat(historyListResponse.pps()).contains("BDA")
        assertThat(historyListResponse.pri()).contains(2)
        assertThat(historyListResponse.sourceDl()).contains("AXE")
        assertThat(historyListResponse.spec()).contains("LIGHT_TANK")
        assertThat(historyListResponse.srcIds().getOrNull()).containsExactly("ID1", "ID2")
        assertThat(historyListResponse.srcTyps().getOrNull()).containsExactly("TYPE1", "TYPE2")
        assertThat(historyListResponse.stale())
            .contains(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
        assertThat(historyListResponse.start())
            .contains(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
        assertThat(historyListResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(historyListResponse.transactionId()).contains("TRANSACTION-ID")
        assertThat(historyListResponse.trkid()).contains("TRK-ID")
        assertThat(historyListResponse.type()).contains("a-h-G")
        assertThat(historyListResponse.urls().getOrNull()).containsExactly("URL1", "URL2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val historyListResponse =
            HistoryListResponse.builder()
                .classificationMarking("U")
                .dataMode(HistoryListResponse.DataMode.TEST)
                .name("POI_NAME")
                .poiid("POI-ID")
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .id("POI-ID")
                .activity("TRAINING")
                .agjson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .alt(5.23)
                .andims(3)
                .area(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .asrid(3)
                .asset("PLATFORM_NAME")
                .atext(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .atype("Type1")
                .az(45.23)
                .beNumber("0427RT1030")
                .ce(10.23)
                .cntct("Contact Info")
                .conf(0.5)
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .desc("Description of the object")
                .el(45.23)
                .elle(listOf(125.5, 85.1, 125.75))
                .env("SURFACE")
                .addGroup("GROUP1")
                .addGroup("GROUP2")
                .how("h-g-i-g-o")
                .ident("FRIEND")
                .addIdWeatherReport("WEATHER-EVENT-ID1")
                .addIdWeatherReport("WEATHER-EVENT-ID2")
                .lat(45.23)
                .le(10.23)
                .lon(45.23)
                .msnid("MSN-ID")
                .orientation(45.23)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .plat("COMBAT_VEHICLE")
                .pps("BDA")
                .pri(2)
                .sourceDl("AXE")
                .spec("LIGHT_TANK")
                .addSrcId("ID1")
                .addSrcId("ID2")
                .addSrcTyp("TYPE1")
                .addSrcTyp("TYPE2")
                .stale(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .start(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .trkid("TRK-ID")
                .type("a-h-G")
                .addUrl("URL1")
                .addUrl("URL2")
                .build()

        val roundtrippedHistoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(historyListResponse),
                jacksonTypeRef<HistoryListResponse>(),
            )

        assertThat(roundtrippedHistoryListResponse).isEqualTo(historyListResponse)
    }
}
