// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitlist

import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitlistCreateParamsTest {

    @Test
    fun create() {
        OnorbitlistCreateParams.builder()
            .classificationMarking("U")
            .dataMode(OnorbitlistCreateParams.DataMode.TEST)
            .name("HRR-SATELLITES")
            .addOnOrbitListItem(
                OnorbitlistCreateParams.OnOrbitListItem.builder()
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
    }

    @Test
    fun body() {
        val params =
            OnorbitlistCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistCreateParams.DataMode.TEST)
                .name("HRR-SATELLITES")
                .addOnOrbitListItem(
                    OnorbitlistCreateParams.OnOrbitListItem.builder()
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

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitlistCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("HRR-SATELLITES")
        assertThat(body.onOrbitListItems())
            .containsExactly(
                OnorbitlistCreateParams.OnOrbitListItem.builder()
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
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("ONORBITLIST-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.defaultRevisitRateMins()).contains(15.3)
        assertThat(body.description()).contains("DESCRIPTION_OF_LIST")
        assertThat(body.listPriority()).contains(1.1)
        assertThat(body.namespace()).contains("18SDS")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.sourceDl()).contains("AXE")
        assertThat(body.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(body.transactionId()).contains("TRANSACTION-ID")
        assertThat(body.updatedAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.updatedBy()).contains("some.user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OnorbitlistCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistCreateParams.DataMode.TEST)
                .name("HRR-SATELLITES")
                .addOnOrbitListItem(OnorbitlistCreateParams.OnOrbitListItem.builder().build())
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitlistCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("HRR-SATELLITES")
        assertThat(body.onOrbitListItems())
            .containsExactly(OnorbitlistCreateParams.OnOrbitListItem.builder().build())
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
