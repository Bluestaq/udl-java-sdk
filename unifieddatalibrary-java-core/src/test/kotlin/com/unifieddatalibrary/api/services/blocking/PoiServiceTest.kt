// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.poi.PoiCountParams
import com.unifieddatalibrary.api.models.poi.PoiCreateBulkParams
import com.unifieddatalibrary.api.models.poi.PoiCreateParams
import com.unifieddatalibrary.api.models.poi.PoiGetParams
import com.unifieddatalibrary.api.models.poi.PoiListParams
import com.unifieddatalibrary.api.models.poi.PoiTupleParams
import com.unifieddatalibrary.api.models.poi.PoiUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PoiServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val poiService = client.poi()

        poiService.create(
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
        )
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val poiService = client.poi()

        val page =
            poiService.list(
                PoiListParams.builder().ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z")).build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val poiService = client.poi()

        poiService.count(
            PoiCountParams.builder()
                .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun createBulk() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val poiService = client.poi()

        poiService.createBulk(
            PoiCreateBulkParams.builder()
                .addBody(
                    PoiCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(PoiCreateBulkParams.Body.DataMode.TEST)
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
                )
                .build()
        )
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val poiService = client.poi()

        val poi =
            poiService.get(PoiGetParams.builder().id("id").firstResult(0L).maxResults(0L).build())

        poi.validate()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val poiService = client.poi()

        val response = poiService.queryhelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val poiService = client.poi()

        val response =
            poiService.tuple(
                PoiTupleParams.builder()
                    .columns("columns")
                    .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val poiService = client.poi()

        poiService.unvalidatedPublish(
            PoiUnvalidatedPublishParams.builder()
                .addBody(
                    PoiUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(PoiUnvalidatedPublishParams.Body.DataMode.TEST)
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
                )
                .build()
        )
    }
}
