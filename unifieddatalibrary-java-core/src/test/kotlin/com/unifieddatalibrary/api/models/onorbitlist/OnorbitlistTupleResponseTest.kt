// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitlist

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitlistTupleResponseTest {

    @Test
    fun create() {
        val onorbitlistTupleResponse =
            OnorbitlistTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistTupleResponse.DataMode.TEST)
                .name("HRR-SATELLITES")
                .addOnOrbitListItem(
                    OnorbitlistTupleResponse.OnOrbitListItem.builder()
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

        assertThat(onorbitlistTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(onorbitlistTupleResponse.dataMode())
            .isEqualTo(OnorbitlistTupleResponse.DataMode.TEST)
        assertThat(onorbitlistTupleResponse.name()).isEqualTo("HRR-SATELLITES")
        assertThat(onorbitlistTupleResponse.onOrbitListItems())
            .containsExactly(
                OnorbitlistTupleResponse.OnOrbitListItem.builder()
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
        assertThat(onorbitlistTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(onorbitlistTupleResponse.id()).contains("ONORBITLIST-ID")
        assertThat(onorbitlistTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitlistTupleResponse.createdBy()).contains("some.user")
        assertThat(onorbitlistTupleResponse.defaultRevisitRateMins()).contains(15.3)
        assertThat(onorbitlistTupleResponse.description()).contains("DESCRIPTION_OF_LIST")
        assertThat(onorbitlistTupleResponse.listPriority()).contains(1.1)
        assertThat(onorbitlistTupleResponse.namespace()).contains("18SDS")
        assertThat(onorbitlistTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onorbitlistTupleResponse.sourceDl()).contains("AXE")
        assertThat(onorbitlistTupleResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(onorbitlistTupleResponse.transactionId()).contains("TRANSACTION-ID")
        assertThat(onorbitlistTupleResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitlistTupleResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitlistTupleResponse =
            OnorbitlistTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistTupleResponse.DataMode.TEST)
                .name("HRR-SATELLITES")
                .addOnOrbitListItem(
                    OnorbitlistTupleResponse.OnOrbitListItem.builder()
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

        val roundtrippedOnorbitlistTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitlistTupleResponse),
                jacksonTypeRef<OnorbitlistTupleResponse>(),
            )

        assertThat(roundtrippedOnorbitlistTupleResponse).isEqualTo(onorbitlistTupleResponse)
    }
}
