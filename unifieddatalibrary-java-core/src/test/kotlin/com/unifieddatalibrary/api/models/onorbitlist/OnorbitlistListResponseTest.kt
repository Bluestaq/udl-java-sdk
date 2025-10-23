// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitlist

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnorbitlistListResponseTest {

    @Test
    fun create() {
        val onorbitlistListResponse =
            OnorbitlistListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistListResponse.DataMode.TEST)
                .name("HRR-SATELLITES")
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

        assertThat(onorbitlistListResponse.classificationMarking()).isEqualTo("U")
        assertThat(onorbitlistListResponse.dataMode())
            .isEqualTo(OnorbitlistListResponse.DataMode.TEST)
        assertThat(onorbitlistListResponse.name()).isEqualTo("HRR-SATELLITES")
        assertThat(onorbitlistListResponse.source()).isEqualTo("Bluestaq")
        assertThat(onorbitlistListResponse.id()).contains("ONORBITLIST-ID")
        assertThat(onorbitlistListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitlistListResponse.createdBy()).contains("some.user")
        assertThat(onorbitlistListResponse.defaultRevisitRateMins()).contains(15.3)
        assertThat(onorbitlistListResponse.description()).contains("DESCRIPTION_OF_LIST")
        assertThat(onorbitlistListResponse.listPriority()).contains(1.1)
        assertThat(onorbitlistListResponse.namespace()).contains("18SDS")
        assertThat(onorbitlistListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(onorbitlistListResponse.sourceDl()).contains("AXE")
        assertThat(onorbitlistListResponse.tags().getOrNull()).containsExactly("TAG1", "TAG2")
        assertThat(onorbitlistListResponse.transactionId()).contains("TRANSACTION-ID")
        assertThat(onorbitlistListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(onorbitlistListResponse.updatedBy()).contains("some.user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val onorbitlistListResponse =
            OnorbitlistListResponse.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistListResponse.DataMode.TEST)
                .name("HRR-SATELLITES")
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

        val roundtrippedOnorbitlistListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(onorbitlistListResponse),
                jacksonTypeRef<OnorbitlistListResponse>(),
            )

        assertThat(roundtrippedOnorbitlistListResponse).isEqualTo(onorbitlistListResponse)
    }
}
