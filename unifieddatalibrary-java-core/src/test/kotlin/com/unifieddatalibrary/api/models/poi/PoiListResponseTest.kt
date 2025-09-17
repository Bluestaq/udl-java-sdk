// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.poi

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PoiListResponseTest {

    @Test
    fun create() {
        val poiListResponse =
            PoiListResponse.builder()
                .classificationMarking("U")
                .dataMode(PoiListResponse.DataMode.TEST)
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
                .origNetwork("OPS1")
                .plat("COMBAT_VEHICLE")
                .pps("BDA")
                .pri(2)
                .sourceDl("AXE")
                .spec("LIGHT_TANK")
                .stale(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .start(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .transactionId("TRANSACTION-ID")
                .trkid("TRK-ID")
                .type("a-h-G")
                .addUrl("URL1")
                .addUrl("URL2")
                .build()

        assertThat(poiListResponse.classificationMarking()).isEqualTo("U")
        assertThat(poiListResponse.dataMode()).isEqualTo(PoiListResponse.DataMode.TEST)
        assertThat(poiListResponse.name()).isEqualTo("POI_NAME")
        assertThat(poiListResponse.poiid()).isEqualTo("POI-ID")
        assertThat(poiListResponse.source()).isEqualTo("Bluestaq")
        assertThat(poiListResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
        assertThat(poiListResponse.id()).contains("POI-ID")
        assertThat(poiListResponse.activity()).contains("TRAINING")
        assertThat(poiListResponse.agjson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(poiListResponse.alt()).contains(5.23)
        assertThat(poiListResponse.andims()).contains(3)
        assertThat(poiListResponse.asrid()).contains(3)
        assertThat(poiListResponse.asset()).contains("PLATFORM_NAME")
        assertThat(poiListResponse.atext())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(poiListResponse.atype()).contains("Type1")
        assertThat(poiListResponse.az()).contains(45.23)
        assertThat(poiListResponse.beNumber()).contains("0427RT1030")
        assertThat(poiListResponse.ce()).contains(10.23)
        assertThat(poiListResponse.cntct()).contains("Contact Info")
        assertThat(poiListResponse.conf()).contains(0.5)
        assertThat(poiListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(poiListResponse.createdBy()).contains("some.user")
        assertThat(poiListResponse.desc()).contains("Description of the object")
        assertThat(poiListResponse.el()).contains(45.23)
        assertThat(poiListResponse.elle().getOrNull()).containsExactly(125.5, 85.1, 125.75)
        assertThat(poiListResponse.env()).contains("SURFACE")
        assertThat(poiListResponse.groups().getOrNull()).containsExactly("GROUP1", "GROUP2")
        assertThat(poiListResponse.how()).contains("h-g-i-g-o")
        assertThat(poiListResponse.ident()).contains("FRIEND")
        assertThat(poiListResponse.idWeatherReport().getOrNull())
            .containsExactly("WEATHER-EVENT-ID1", "WEATHER-EVENT-ID2")
        assertThat(poiListResponse.lat()).contains(45.23)
        assertThat(poiListResponse.le()).contains(10.23)
        assertThat(poiListResponse.lon()).contains(45.23)
        assertThat(poiListResponse.msnid()).contains("MSN-ID")
        assertThat(poiListResponse.orientation()).contains(45.23)
        assertThat(poiListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(poiListResponse.origNetwork()).contains("OPS1")
        assertThat(poiListResponse.plat()).contains("COMBAT_VEHICLE")
        assertThat(poiListResponse.pps()).contains("BDA")
        assertThat(poiListResponse.pri()).contains(2)
        assertThat(poiListResponse.sourceDl()).contains("AXE")
        assertThat(poiListResponse.spec()).contains("LIGHT_TANK")
        assertThat(poiListResponse.stale())
            .contains(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
        assertThat(poiListResponse.start())
            .contains(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
        assertThat(poiListResponse.transactionId()).contains("TRANSACTION-ID")
        assertThat(poiListResponse.trkid()).contains("TRK-ID")
        assertThat(poiListResponse.type()).contains("a-h-G")
        assertThat(poiListResponse.urls().getOrNull()).containsExactly("URL1", "URL2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val poiListResponse =
            PoiListResponse.builder()
                .classificationMarking("U")
                .dataMode(PoiListResponse.DataMode.TEST)
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
                .origNetwork("OPS1")
                .plat("COMBAT_VEHICLE")
                .pps("BDA")
                .pri(2)
                .sourceDl("AXE")
                .spec("LIGHT_TANK")
                .stale(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .start(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .transactionId("TRANSACTION-ID")
                .trkid("TRK-ID")
                .type("a-h-G")
                .addUrl("URL1")
                .addUrl("URL2")
                .build()

        val roundtrippedPoiListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(poiListResponse),
                jacksonTypeRef<PoiListResponse>(),
            )

        assertThat(roundtrippedPoiListResponse).isEqualTo(poiListResponse)
    }
}
