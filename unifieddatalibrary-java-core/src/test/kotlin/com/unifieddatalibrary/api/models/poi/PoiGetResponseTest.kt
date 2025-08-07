// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.poi

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PoiGetResponseTest {

    @Test
    fun create() {
        val poiGetResponse =
            PoiGetResponse.builder()
                .classificationMarking("U")
                .dataMode(PoiGetResponse.DataMode.TEST)
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

        assertThat(poiGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(poiGetResponse.dataMode()).isEqualTo(PoiGetResponse.DataMode.TEST)
        assertThat(poiGetResponse.name()).isEqualTo("POI_NAME")
        assertThat(poiGetResponse.poiid()).isEqualTo("POI-ID")
        assertThat(poiGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(poiGetResponse.ts())
            .isEqualTo(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
        assertThat(poiGetResponse.id()).contains("POI-ID")
        assertThat(poiGetResponse.activity()).contains("TRAINING")
        assertThat(poiGetResponse.agjson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(poiGetResponse.alt()).contains(5.23)
        assertThat(poiGetResponse.andims()).contains(3)
        assertThat(poiGetResponse.area())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(poiGetResponse.asrid()).contains(3)
        assertThat(poiGetResponse.asset()).contains("PLATFORM_NAME")
        assertThat(poiGetResponse.atext())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(poiGetResponse.atype()).contains("Type1")
        assertThat(poiGetResponse.az()).contains(45.23)
        assertThat(poiGetResponse.beNumber()).contains("0427RT1030")
        assertThat(poiGetResponse.ce()).contains(10.23)
        assertThat(poiGetResponse.cntct()).contains("Contact Info")
        assertThat(poiGetResponse.conf()).contains(0.5)
        assertThat(poiGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(poiGetResponse.createdBy()).contains("some.user")
        assertThat(poiGetResponse.desc()).contains("Description of the object")
        assertThat(poiGetResponse.el()).contains(45.23)
        assertThat(poiGetResponse.elle().getOrNull()).containsExactly(125.5, 85.1, 125.75)
        assertThat(poiGetResponse.env()).contains("SURFACE")
        assertThat(poiGetResponse.groups().getOrNull()).containsExactly("GROUP1", "GROUP2")
        assertThat(poiGetResponse.how()).contains("h-g-i-g-o")
        assertThat(poiGetResponse.ident()).contains("FRIEND")
        assertThat(poiGetResponse.idWeatherReport().getOrNull())
            .containsExactly("WEATHER-EVENT-ID1", "WEATHER-EVENT-ID2")
        assertThat(poiGetResponse.lat()).contains(45.23)
        assertThat(poiGetResponse.le()).contains(10.23)
        assertThat(poiGetResponse.lon()).contains(45.23)
        assertThat(poiGetResponse.msnid()).contains("MSN-ID")
        assertThat(poiGetResponse.orientation()).contains(45.23)
        assertThat(poiGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(poiGetResponse.origNetwork()).contains("ORIG")
        assertThat(poiGetResponse.plat()).contains("COMBAT_VEHICLE")
        assertThat(poiGetResponse.pps()).contains("BDA")
        assertThat(poiGetResponse.pri()).contains(2)
        assertThat(poiGetResponse.sourceDl()).contains("AXE")
        assertThat(poiGetResponse.spec()).contains("LIGHT_TANK")
        assertThat(poiGetResponse.srcIds().getOrNull()).containsExactly("ID1", "ID2")
        assertThat(poiGetResponse.srcTyps().getOrNull()).containsExactly("TYPE1", "TYPE2")
        assertThat(poiGetResponse.stale())
            .contains(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
        assertThat(poiGetResponse.start())
            .contains(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
        assertThat(poiGetResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(poiGetResponse.transactionId()).contains("TRANSACTION-ID")
        assertThat(poiGetResponse.trkid()).contains("TRK-ID")
        assertThat(poiGetResponse.type()).contains("a-h-G")
        assertThat(poiGetResponse.urls().getOrNull()).containsExactly("URL1", "URL2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val poiGetResponse =
            PoiGetResponse.builder()
                .classificationMarking("U")
                .dataMode(PoiGetResponse.DataMode.TEST)
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

        val roundtrippedPoiGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(poiGetResponse),
                jacksonTypeRef<PoiGetResponse>(),
            )

        assertThat(roundtrippedPoiGetResponse).isEqualTo(poiGetResponse)
    }
}
