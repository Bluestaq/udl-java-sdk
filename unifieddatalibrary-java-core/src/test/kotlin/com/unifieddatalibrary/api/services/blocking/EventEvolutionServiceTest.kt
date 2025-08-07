// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionCountParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionCreateBulkParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionCreateParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionRetrieveParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionTupleParams
import com.unifieddatalibrary.api.models.eventevolution.EventEvolutionUnvalidatedPublishParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventEvolutionServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val eventEvolutionService = client.eventEvolution()

        eventEvolutionService.create(
            EventEvolutionCreateParams.builder()
                .classificationMarking("U")
                .dataMode(EventEvolutionCreateParams.DataMode.TEST)
                .eventId("EVENT_ID")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
                .summary("Example summary of the event.")
                .id("EVENT_EVOL_ID")
                .agjson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .andims(2)
                .area(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .asrid(4326)
                .atext(
                    "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                )
                .atype("POLYGON")
                .category("PROTEST")
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
                .createdBy("some.user")
                .dataDescription("Description of relationship between srcTyps and srcIds")
                .endTime(OffsetDateTime.parse("2021-12-03T16:00:00.123Z"))
                .geoAdminLevel1("Colorado")
                .geoAdminLevel2("El Paso County")
                .geoAdminLevel3("Colorado Springs")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .redact(false)
                .addSrcId("SRC_ID_1")
                .addSrcId("SRC_ID_2")
                .addSrcTyp("AIS")
                .addSrcTyp("CONJUNCTION")
                .status("UNKNOWN")
                .addTag("TAG1")
                .addTag("TAG2")
                .addUrl("URL1")
                .addUrl("URL2")
                .build()
        )
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val eventEvolutionService = client.eventEvolution()

        val eventEvolutionFull =
            eventEvolutionService.retrieve(
                EventEvolutionRetrieveParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        eventEvolutionFull.validate()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val eventEvolutionService = client.eventEvolution()

        val page = eventEvolutionService.list()

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
        val eventEvolutionService = client.eventEvolution()

        eventEvolutionService.count(
            EventEvolutionCountParams.builder()
                .eventId("eventId")
                .firstResult(0L)
                .maxResults(0L)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        val eventEvolutionService = client.eventEvolution()

        eventEvolutionService.createBulk(
            EventEvolutionCreateBulkParams.builder()
                .addBody(
                    EventEvolutionCreateBulkParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(EventEvolutionCreateBulkParams.Body.DataMode.TEST)
                        .eventId("EVENT_ID")
                        .source("Bluestaq")
                        .startTime(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
                        .summary("Example summary of the event.")
                        .id("EVENT_EVOL_ID")
                        .agjson(
                            "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                        )
                        .andims(2)
                        .area(
                            "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                        )
                        .asrid(4326)
                        .atext(
                            "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                        )
                        .atype("POLYGON")
                        .category("PROTEST")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
                        .createdBy("some.user")
                        .dataDescription("Description of relationship between srcTyps and srcIds")
                        .endTime(OffsetDateTime.parse("2021-12-03T16:00:00.123Z"))
                        .geoAdminLevel1("Colorado")
                        .geoAdminLevel2("El Paso County")
                        .geoAdminLevel3("Colorado Springs")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .redact(false)
                        .addSrcId("SRC_ID_1")
                        .addSrcId("SRC_ID_2")
                        .addSrcTyp("AIS")
                        .addSrcTyp("CONJUNCTION")
                        .status("UNKNOWN")
                        .addTag("TAG1")
                        .addTag("TAG2")
                        .addUrl("URL1")
                        .addUrl("URL2")
                        .build()
                )
                .build()
        )
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val eventEvolutionService = client.eventEvolution()

        val response = eventEvolutionService.queryhelp()

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
        val eventEvolutionService = client.eventEvolution()

        val eventEvolutionFulls =
            eventEvolutionService.tuple(
                EventEvolutionTupleParams.builder()
                    .columns("columns")
                    .eventId("eventId")
                    .firstResult(0L)
                    .maxResults(0L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        eventEvolutionFulls.forEach { it.validate() }
    }

    @Test
    fun unvalidatedPublish() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val eventEvolutionService = client.eventEvolution()

        eventEvolutionService.unvalidatedPublish(
            EventEvolutionUnvalidatedPublishParams.builder()
                .addBody(
                    EventEvolutionUnvalidatedPublishParams.Body.builder()
                        .classificationMarking("U")
                        .dataMode(EventEvolutionUnvalidatedPublishParams.Body.DataMode.TEST)
                        .eventId("EVENT_ID")
                        .source("Bluestaq")
                        .startTime(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
                        .summary("Example summary of the event.")
                        .id("EVENT_EVOL_ID")
                        .agjson(
                            "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                        )
                        .andims(2)
                        .area(
                            "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                        )
                        .asrid(4326)
                        .atext(
                            "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
                        )
                        .atype("POLYGON")
                        .category("PROTEST")
                        .countryCode("US")
                        .createdAt(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
                        .createdBy("some.user")
                        .dataDescription("Description of relationship between srcTyps and srcIds")
                        .endTime(OffsetDateTime.parse("2021-12-03T16:00:00.123Z"))
                        .geoAdminLevel1("Colorado")
                        .geoAdminLevel2("El Paso County")
                        .geoAdminLevel3("Colorado Springs")
                        .origin("THIRD_PARTY_DATASOURCE")
                        .origNetwork("ORIG")
                        .redact(false)
                        .addSrcId("SRC_ID_1")
                        .addSrcId("SRC_ID_2")
                        .addSrcTyp("AIS")
                        .addSrcTyp("CONJUNCTION")
                        .status("UNKNOWN")
                        .addTag("TAG1")
                        .addTag("TAG2")
                        .addUrl("URL1")
                        .addUrl("URL2")
                        .build()
                )
                .build()
        )
    }
}
