// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.eventevolution

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventEvolutionListResponseTest {

    @Test
    fun create() {
        val eventEvolutionListResponse =
            EventEvolutionListResponse.builder()
                .classificationMarking("U")
                .dataMode(EventEvolutionListResponse.DataMode.TEST)
                .eventId("EVENT_ID")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
                .summary("Example summary of the event.")
                .id("EVENT_EVOL_ID")
                .agjson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .andims(2)
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

        assertThat(eventEvolutionListResponse.classificationMarking()).isEqualTo("U")
        assertThat(eventEvolutionListResponse.dataMode())
            .isEqualTo(EventEvolutionListResponse.DataMode.TEST)
        assertThat(eventEvolutionListResponse.eventId()).isEqualTo("EVENT_ID")
        assertThat(eventEvolutionListResponse.source()).isEqualTo("Bluestaq")
        assertThat(eventEvolutionListResponse.startTime())
            .isEqualTo(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
        assertThat(eventEvolutionListResponse.summary()).isEqualTo("Example summary of the event.")
        assertThat(eventEvolutionListResponse.id()).contains("EVENT_EVOL_ID")
        assertThat(eventEvolutionListResponse.agjson())
            .contains(
                "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
            )
        assertThat(eventEvolutionListResponse.andims()).contains(2)
        assertThat(eventEvolutionListResponse.asrid()).contains(4326)
        assertThat(eventEvolutionListResponse.atext())
            .contains(
                "POLYGON((67.3291113966927 26.156175339112,67.2580009640721 26.091022064271,67.1795862381682 26.6637992964562,67.2501237475598 26.730115808233,67.3291113966927 26.156175339112))"
            )
        assertThat(eventEvolutionListResponse.atype()).contains("POLYGON")
        assertThat(eventEvolutionListResponse.category()).contains("PROTEST")
        assertThat(eventEvolutionListResponse.countryCode()).contains("US")
        assertThat(eventEvolutionListResponse.createdAt())
            .contains(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
        assertThat(eventEvolutionListResponse.createdBy()).contains("some.user")
        assertThat(eventEvolutionListResponse.dataDescription())
            .contains("Description of relationship between srcTyps and srcIds")
        assertThat(eventEvolutionListResponse.endTime())
            .contains(OffsetDateTime.parse("2021-12-03T16:00:00.123Z"))
        assertThat(eventEvolutionListResponse.geoAdminLevel1()).contains("Colorado")
        assertThat(eventEvolutionListResponse.geoAdminLevel2()).contains("El Paso County")
        assertThat(eventEvolutionListResponse.geoAdminLevel3()).contains("Colorado Springs")
        assertThat(eventEvolutionListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(eventEvolutionListResponse.origNetwork()).contains("ORIG")
        assertThat(eventEvolutionListResponse.redact()).contains(false)
        assertThat(eventEvolutionListResponse.srcIds().getOrNull())
            .containsExactly("SRC_ID_1", "SRC_ID_2")
        assertThat(eventEvolutionListResponse.srcTyps().getOrNull())
            .containsExactly("AIS", "CONJUNCTION")
        assertThat(eventEvolutionListResponse.status()).contains("UNKNOWN")
        assertThat(eventEvolutionListResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(eventEvolutionListResponse.url().getOrNull()).containsExactly("URL1", "URL2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventEvolutionListResponse =
            EventEvolutionListResponse.builder()
                .classificationMarking("U")
                .dataMode(EventEvolutionListResponse.DataMode.TEST)
                .eventId("EVENT_ID")
                .source("Bluestaq")
                .startTime(OffsetDateTime.parse("2021-12-02T16:00:00.123Z"))
                .summary("Example summary of the event.")
                .id("EVENT_EVOL_ID")
                .agjson(
                    "{\"type\":\"Polygon\",\"coordinates\":[ [ [ 67.3291113966927, 26.156175339112 ], [ 67.2580009640721, 26.091022064271 ], [ 67.1795862381682, 26.6637992964562 ], [ 67.2501237475598, 26.730115808233 ], [ 67.3291113966927, 26.156175339112 ] ] ] }"
                )
                .andims(2)
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

        val roundtrippedEventEvolutionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventEvolutionListResponse),
                jacksonTypeRef<EventEvolutionListResponse>(),
            )

        assertThat(roundtrippedEventEvolutionListResponse).isEqualTo(eventEvolutionListResponse)
    }
}
