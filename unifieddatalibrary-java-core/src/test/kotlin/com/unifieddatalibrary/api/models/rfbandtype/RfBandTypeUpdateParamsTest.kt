// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.rfbandtype

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RfBandTypeUpdateParamsTest {

    @Test
    fun create() {
        RfBandTypeUpdateParams.builder()
            .pathId("id")
            .bodyId("Ku")
            .classificationMarking("U")
            .dataMode(RfBandTypeUpdateParams.DataMode.TEST)
            .description("Example description")
            .source("Bluestaq")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .endFreq(123.4)
            .origin("THIRD_PARTY_DATASOURCE")
            .startFreq(123.4)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RfBandTypeUpdateParams.builder()
                .pathId("id")
                .bodyId("Ku")
                .classificationMarking("U")
                .dataMode(RfBandTypeUpdateParams.DataMode.TEST)
                .description("Example description")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RfBandTypeUpdateParams.builder()
                .pathId("id")
                .bodyId("Ku")
                .classificationMarking("U")
                .dataMode(RfBandTypeUpdateParams.DataMode.TEST)
                .description("Example description")
                .source("Bluestaq")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .endFreq(123.4)
                .origin("THIRD_PARTY_DATASOURCE")
                .startFreq(123.4)
                .build()

        val body = params._body()

        assertThat(body.bodyId()).isEqualTo("Ku")
        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(RfBandTypeUpdateParams.DataMode.TEST)
        assertThat(body.description()).isEqualTo("Example description")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.endFreq()).contains(123.4)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.startFreq()).contains(123.4)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RfBandTypeUpdateParams.builder()
                .pathId("id")
                .bodyId("Ku")
                .classificationMarking("U")
                .dataMode(RfBandTypeUpdateParams.DataMode.TEST)
                .description("Example description")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.bodyId()).isEqualTo("Ku")
        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(RfBandTypeUpdateParams.DataMode.TEST)
        assertThat(body.description()).isEqualTo("Example description")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
