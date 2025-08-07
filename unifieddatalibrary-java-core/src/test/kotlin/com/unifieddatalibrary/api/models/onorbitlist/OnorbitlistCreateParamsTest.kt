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
            .name("People")
            .source("Bluestaq")
            .id("ONORBITLIST-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .description("DESCRIPTION_OF_LIST")
            .addOnorbit("ID1")
            .addOnorbit("ID2")
            .origin("THIRD_PARTY_DATASOURCE")
            .build()
    }

    @Test
    fun body() {
        val params =
            OnorbitlistCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistCreateParams.DataMode.TEST)
                .name("People")
                .source("Bluestaq")
                .id("ONORBITLIST-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("DESCRIPTION_OF_LIST")
                .addOnorbit("ID1")
                .addOnorbit("ID2")
                .origin("THIRD_PARTY_DATASOURCE")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitlistCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("People")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.id()).contains("ONORBITLIST-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.description()).contains("DESCRIPTION_OF_LIST")
        assertThat(body.onorbits().getOrNull()).containsExactly("ID1", "ID2")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OnorbitlistCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OnorbitlistCreateParams.DataMode.TEST)
                .name("People")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(OnorbitlistCreateParams.DataMode.TEST)
        assertThat(body.name()).isEqualTo("People")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
