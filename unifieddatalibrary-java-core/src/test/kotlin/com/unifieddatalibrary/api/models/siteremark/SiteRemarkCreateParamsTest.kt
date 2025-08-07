// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.siteremark

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiteRemarkCreateParamsTest {

    @Test
    fun create() {
        SiteRemarkCreateParams.builder()
            .classificationMarking("U")
            .dataMode(SiteRemarkCreateParams.DataMode.TEST)
            .idSite("SITE-ID")
            .source("Bluestaq")
            .text("This is a remark")
            .id("5000a3ef-8e39-2551-80f1-b3cd1895fe7b")
            .code("M")
            .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
            .createdBy("some.user")
            .name("Remark name")
            .origin("THIRD_PARTY_DATASOURCE")
            .origNetwork("OPS1")
            .origRmkId("123456ABC")
            .type("Restriction")
            .build()
    }

    @Test
    fun body() {
        val params =
            SiteRemarkCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SiteRemarkCreateParams.DataMode.TEST)
                .idSite("SITE-ID")
                .source("Bluestaq")
                .text("This is a remark")
                .id("5000a3ef-8e39-2551-80f1-b3cd1895fe7b")
                .code("M")
                .createdAt(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .name("Remark name")
                .origin("THIRD_PARTY_DATASOURCE")
                .origNetwork("OPS1")
                .origRmkId("123456ABC")
                .type("Restriction")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SiteRemarkCreateParams.DataMode.TEST)
        assertThat(body.idSite()).isEqualTo("SITE-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.text()).isEqualTo("This is a remark")
        assertThat(body.id()).contains("5000a3ef-8e39-2551-80f1-b3cd1895fe7b")
        assertThat(body.code()).contains("M")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(body.createdBy()).contains("some.user")
        assertThat(body.name()).contains("Remark name")
        assertThat(body.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(body.origNetwork()).contains("OPS1")
        assertThat(body.origRmkId()).contains("123456ABC")
        assertThat(body.type()).contains("Restriction")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SiteRemarkCreateParams.builder()
                .classificationMarking("U")
                .dataMode(SiteRemarkCreateParams.DataMode.TEST)
                .idSite("SITE-ID")
                .source("Bluestaq")
                .text("This is a remark")
                .build()

        val body = params._body()

        assertThat(body.classificationMarking()).isEqualTo("U")
        assertThat(body.dataMode()).isEqualTo(SiteRemarkCreateParams.DataMode.TEST)
        assertThat(body.idSite()).isEqualTo("SITE-ID")
        assertThat(body.source()).isEqualTo("Bluestaq")
        assertThat(body.text()).isEqualTo("This is a remark")
    }
}
