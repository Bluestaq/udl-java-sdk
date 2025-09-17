// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eventevolution

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventEvolutionCreateParamsTest {

    @Test
    fun create() {
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
            .origNetwork("OPS1")
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
    }

    @Test
    fun body() {
        val params =
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
                .origNetwork("OPS1")
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EventEvolutionCreateParams.DataMode.TEST)
        assertThat(body.eventId()).isEqualTo("EVENT_ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
        assertThat(body.summary()).isEqualTo("Example summary of the event.")
        assertThat(body.id()).contains("EVENT_EVOL_ID")
        assertThat(body.agjson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(body.andims()).contains(2)
        assertThat(body.area())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(body.asrid()).contains(4326)
        assertThat(body.atext())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(body.atype()).contains("POLYGON")
        assertThat(body.category()).contains("PROTEST")
        assertThat(body.countryCode()).contains("US")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.dataDescription())
            .contains("Description of relationship between srcTyps and srcIds")
        assertThat(body.endTime()).contains(OffsetDateTime.parse("2021-12-03T16:00:00.123Z"))
        assertThat(body.geoAdminLevel1()).contains("Colorado")
        assertThat(body.geoAdminLevel2()).contains("El Paso County")
        assertThat(body.geoAdminLevel3()).contains("Colorado Springs")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.redact()).contains(false)
        assertThat(body.srcIds().getOrNull()).containsExactly("SRC_ID_1", "SRC_ID_2")
        assertThat(body.srcTyps().getOrNull()).containsExactly("AIS", "CONJUNCTION")
        assertThat(body.status()).contains("UNKNOWN")
        assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(body.url().getOrNull()).containsExactly("URL1", "URL2")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventEvolutionCreateParams.builder()
                .classificationMarking("U")
                .dataMode(EventEvolutionCreateParams.DataMode.TEST)
                .eventId("EVENT_ID")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
                .summary("Example summary of the event.")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(EventEvolutionCreateParams.DataMode.TEST)
        assertThat(body.eventId()).isEqualTo("EVENT_ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.startTime()).isEqualTo(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
        assertThat(body.summary()).isEqualTo("Example summary of the event.")
    }
}
