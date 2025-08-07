// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventEvolutionFullTest {

    @Test
    fun create() {
        val eventEvolutionFull =
            EventEvolutionFull.builder()
                .classificationMarking("U")
                .dataMode(EventEvolutionFull.DataMode.TEST)
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

        assertThat(eventEvolutionFull.classificationMarking()).isEqualTo("U")
        assertThat(eventEvolutionFull.dataMode()).isEqualTo(EventEvolutionFull.DataMode.TEST)
        assertThat(eventEvolutionFull.eventId()).isEqualTo("EVENT_ID")
        assertThat(eventEvolutionFull.source()).isEqualTo("Bluestaq")
        assertThat(eventEvolutionFull.startTime())
            .isEqualTo(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
        assertThat(eventEvolutionFull.summary()).isEqualTo("Example summary of the event.")
        assertThat(eventEvolutionFull.id()).contains("EVENT_EVOL_ID")
        assertThat(eventEvolutionFull.agjson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(eventEvolutionFull.andims()).contains(2)
        assertThat(eventEvolutionFull.area())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(eventEvolutionFull.asrid()).contains(4326)
        assertThat(eventEvolutionFull.atext())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(eventEvolutionFull.atype()).contains("POLYGON")
        assertThat(eventEvolutionFull.category()).contains("PROTEST")
        assertThat(eventEvolutionFull.countryCode()).contains("US")
        assertThat(eventEvolutionFull.createdAt())
            .contains(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
        assertThat(eventEvolutionFull.createdBy()).contains("some.user")
        assertThat(eventEvolutionFull.dataDescription())
            .contains("Description of relationship between srcTyps and srcIds")
        assertThat(eventEvolutionFull.endTime())
            .contains(OffsetDateTime.parse("2021-12-03T16:00:00.123Z"))
        assertThat(eventEvolutionFull.geoAdminLevel1()).contains("Colorado")
        assertThat(eventEvolutionFull.geoAdminLevel2()).contains("El Paso County")
        assertThat(eventEvolutionFull.geoAdminLevel3()).contains("Colorado Springs")
        assertThat(eventEvolutionFull.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(eventEvolutionFull.origNetwork()).contains("ORIG")
        assertThat(eventEvolutionFull.redact()).contains(false)
        assertThat(eventEvolutionFull.srcIds().getOrNull()).containsExactly("SRC_ID_1", "SRC_ID_2")
        assertThat(eventEvolutionFull.srcTyps().getOrNull()).containsExactly("AIS", "CONJUNCTION")
        assertThat(eventEvolutionFull.status()).contains("UNKNOWN")
        assertThat(eventEvolutionFull.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(eventEvolutionFull.url().getOrNull()).containsExactly("URL1", "URL2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventEvolutionFull =
            EventEvolutionFull.builder()
                .classificationMarking("U")
                .dataMode(EventEvolutionFull.DataMode.TEST)
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

        val roundtrippedEventEvolutionFull =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventEvolutionFull),
                jacksonTypeRef<EventEvolutionFull>(),
            )

        assertThat(roundtrippedEventEvolutionFull).isEqualTo(eventEvolutionFull)
    }
}
