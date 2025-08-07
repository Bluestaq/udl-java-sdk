// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.poi

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PoiCreateParamsTest {

    @Test
    fun create() {
        PoiCreateParams.builder()
            .classificationMarking("U")
            .dataMode(PoiCreateParams.DataMode.TEST)
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
    }

    @Test
    fun body() {
        val params =
            PoiCreateParams.builder()
                .classificationMarking("U")
                .dataMode(PoiCreateParams.DataMode.TEST)
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(PoiCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("POI_NAME")
        assertThat(body.poiid()).isEqualTo("POI-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.ts()).isEqualTo(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
        assertThat(body.id()).contains("POI-ID")
        assertThat(body.activity()).contains("TRAINING")
        assertThat(body.agjson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(body.alt()).contains(5.23)
        assertThat(body.andims()).contains(3)
        assertThat(body.area())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(body.asrid()).contains(3)
        assertThat(body.asset()).contains("PLATFORM_NAME")
        assertThat(body.atext())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(body.atype()).contains("Type1")
        assertThat(body.az()).contains(45.23)
        assertThat(body.beNumber()).contains("0427RT1030")
        assertThat(body.ce()).contains(10.23)
        assertThat(body.cntct()).contains("Contact Info")
        assertThat(body.conf()).contains(0.5)
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.desc()).contains("Description of the object")
        assertThat(body.el()).contains(45.23)
        assertThat(body.elle().getOrNull()).containsExactly(125.5, 85.1, 125.75)
        assertThat(body.env()).contains("SURFACE")
        assertThat(body.groups().getOrNull()).containsExactly("GROUP1", "GROUP2")
        assertThat(body.how()).contains("h-g-i-g-o")
        assertThat(body.ident()).contains("FRIEND")
        assertThat(body.idWeatherReport().getOrNull())
            .containsExactly("WEATHER-EVENT-ID1", "WEATHER-EVENT-ID2")
        assertThat(body.lat()).contains(45.23)
        assertThat(body.le()).contains(10.23)
        assertThat(body.lon()).contains(45.23)
        assertThat(body.msnid()).contains("MSN-ID")
        assertThat(body.orientation()).contains(45.23)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.plat()).contains("COMBAT_VEHICLE")
        assertThat(body.pps()).contains("BDA")
        assertThat(body.pri()).contains(2)
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.spec()).contains("LIGHT_TANK")
        assertThat(body.srcIds().getOrNull()).containsExactly("ID1", "ID2")
        assertThat(body.srcTyps().getOrNull()).containsExactly("TYPE1", "TYPE2")
        assertThat(body.stale()).contains(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
        assertThat(body.start()).contains(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
        assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(body.transactionId()).contains("TRANSACTION-ID")
        assertThat(body.trkid()).contains("TRK-ID")
        assertThat(body.type()).contains("a-h-G")
        assertThat(body.urls().getOrNull()).containsExactly("URL1", "URL2")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PoiCreateParams.builder()
                .classificationMarking("U")
                .dataMode(PoiCreateParams.DataMode.TEST)
                .name("POI_NAME")
                .poiid("POI-ID")
                .source("Bluestaq")
                .ts(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(PoiCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("POI_NAME")
        assertThat(body.poiid()).isEqualTo("POI-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.ts()).isEqualTo(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
    }
}
