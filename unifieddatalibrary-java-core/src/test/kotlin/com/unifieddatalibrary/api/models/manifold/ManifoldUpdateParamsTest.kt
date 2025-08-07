// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.manifold

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ManifoldUpdateParamsTest {

    @Test
    fun create() {
        ManifoldUpdateParams.builder()
            .pathId("id")
            .classificationMarking("U")
            .dataMode(ManifoldUpdateParams.DataMode.TEST)
            .idObjectOfInterest("OBJECTOFINTEREST-ID")
            .source("Bluestaq")
            .bodyId("MANIFOLD-ID")
            .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .deltaT(10.23)
            .deltaV(10.23)
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("ORIG")
            .status("PENDING")
            .weight(0.3)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ManifoldUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(ManifoldUpdateParams.DataMode.TEST)
                .idObjectOfInterest("OBJECTOFINTEREST-ID")
                .source("Bluestaq")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ManifoldUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(ManifoldUpdateParams.DataMode.TEST)
                .idObjectOfInterest("OBJECTOFINTEREST-ID")
                .source("Bluestaq")
                .bodyId("MANIFOLD-ID")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .deltaT(10.23)
                .deltaV(10.23)
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("ORIG")
                .status("PENDING")
                .weight(0.3)
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(ManifoldUpdateParams.DataMode.TEST)
        assertThat(body.idObjectOfInterest()).isEqualTo("OBJECTOFINTEREST-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.bodyId()).contains("MANIFOLD-ID")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.deltaT()).contains(10.23)
        assertThat(body.deltaV()).contains(10.23)
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("ORIG")
        assertThat(body.status()).contains("PENDING")
        assertThat(body.weight()).contains(0.3)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ManifoldUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(ManifoldUpdateParams.DataMode.TEST)
                .idObjectOfInterest("OBJECTOFINTEREST-ID")
                .source("Bluestaq")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(ManifoldUpdateParams.DataMode.TEST)
        assertThat(body.idObjectOfInterest()).isEqualTo("OBJECTOFINTEREST-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
    }
}
