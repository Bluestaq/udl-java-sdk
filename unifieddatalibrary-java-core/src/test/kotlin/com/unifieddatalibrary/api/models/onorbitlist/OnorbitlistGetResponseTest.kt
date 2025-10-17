// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitlist

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitlistGetResponseTest {

    @Test
    fun create() {
        val onorbitlistGetResponse =
            OnorbitlistGetResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistGetResponse.DataMode.TEST)
                .name("HRR-SATELLITES")
                .addOnOrbitListItem(
                    OnorbitlistGetResponse.OnOrbitListItem.builder()
                        .clearingBoxCrossTrack(1.25)
                        .clearingBoxInTrack(1.25)
                        .clearingRadius(1.25)
                        .commonName("VANGUARD 1")
                        .countryCode("USA")
                        .expiredOn(OffsetDateTime.parse("2024-07-12T00:00:00.000Z"))
                        .freqMins(300.25)
                        .monitoringType("REVISIT_RATE")
                        .objectId("5")
                        .orbitRegime("LEO")
                        .origObjectId("ORIGOBJECT-ID")
                        .payloadPriority(2.5)
                        .rank(3)
                        .urgency(5.1)
                        .build()
                )
                .source("Bluestaq")
                .id("ONORBITLIST-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .defaultRevisitRateMins(15.3)
                .description("DESCRIPTION_OF_LIST")
                .listPriority(1.1)
                .namespace("18SDS")
                .origin("THIRD_PARTY_DATASOURCE")
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        assertThat(onorbitlistGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(onorbitlistGetResponse.dataMode())
            .isEqualTo(OnorbitlistGetResponse.DataMode.TEST)
        assertThat(onorbitlistGetResponse.name()).isEqualTo("HRR-SATELLITES")
        assertThat(onorbitlistGetResponse.onOrbitListItems())
            .containsExactly(
                OnorbitlistGetResponse.OnOrbitListItem.builder()
                    .clearingBoxCrossTrack(1.25)
                    .clearingBoxInTrack(1.25)
                    .clearingRadius(1.25)
                    .commonName("VANGUARD 1")
                    .countryCode("USA")
                    .expiredOn(OffsetDateTime.parse("2024-07-12T00:00:00.000Z"))
                    .freqMins(300.25)
                    .monitoringType("REVISIT_RATE")
                    .objectId("5")
                    .orbitRegime("LEO")
                    .origObjectId("ORIGOBJECT-ID")
                    .payloadPriority(2.5)
                    .rank(3)
                    .urgency(5.1)
                    .build()
            )
        assertThat(onorbitlistGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(onorbitlistGetResponse.id()).contains("ONORBITLIST-ID")
        assertThat(onorbitlistGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitlistGetResponse.createdBy()).contains("some.user")
        assertThat(onorbitlistGetResponse.defaultRevisitRateMins()).contains(15.3)
        assertThat(onorbitlistGetResponse.description()).contains("DESCRIPTION_OF_LIST")
        assertThat(onorbitlistGetResponse.listPriority()).contains(1.1)
        assertThat(onorbitlistGetResponse.namespace()).contains("18SDS")
        assertThat(onorbitlistGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onorbitlistGetResponse.sourceDl()).contains("AXE")
        assertThat(onorbitlistGetResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(onorbitlistGetResponse.transactionId()).contains("TRANSACTION-ID")
        assertThat(onorbitlistGetResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitlistGetResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitlistGetResponse =
            OnorbitlistGetResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistGetResponse.DataMode.TEST)
                .name("HRR-SATELLITES")
                .addOnOrbitListItem(
                    OnorbitlistGetResponse.OnOrbitListItem.builder()
                        .clearingBoxCrossTrack(1.25)
                        .clearingBoxInTrack(1.25)
                        .clearingRadius(1.25)
                        .commonName("VANGUARD 1")
                        .countryCode("USA")
                        .expiredOn(OffsetDateTime.parse("2024-07-12T00:00:00.000Z"))
                        .freqMins(300.25)
                        .monitoringType("REVISIT_RATE")
                        .objectId("5")
                        .orbitRegime("LEO")
                        .origObjectId("ORIGOBJECT-ID")
                        .payloadPriority(2.5)
                        .rank(3)
                        .urgency(5.1)
                        .build()
                )
                .source("Bluestaq")
                .id("ONORBITLIST-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .defaultRevisitRateMins(15.3)
                .description("DESCRIPTION_OF_LIST")
                .listPriority(1.1)
                .namespace("18SDS")
                .origin("THIRD_PARTY_DATASOURCE")
                .sourceDl("AXE")
                .addTag("TAG1")
                .addTag("TAG2")
                .transactionId("TRANSACTION-ID")
                .updatedAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .updatedBy("some.user")
                .build()

        val roundtrippedOnorbitlistGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitlistGetResponse),
                jacksonTypeRef<OnorbitlistGetResponse>(),
            )

        assertThat(roundtrippedOnorbitlistGetResponse).isEqualTo(onorbitlistGetResponse)
    }
}
