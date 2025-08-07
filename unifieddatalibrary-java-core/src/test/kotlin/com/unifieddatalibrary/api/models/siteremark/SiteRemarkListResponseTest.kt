// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.siteremark

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiteRemarkListResponseTest {

    @Test
    fun create() {
        val siteRemarkListResponse =
            SiteRemarkListResponse.builder()
                .classificationMarking("U")
                .dataMode(SiteRemarkListResponse.DataMode.TEST)
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

        assertThat(siteRemarkListResponse.classificationMarking()).isEqualTo("U")
        assertThat(siteRemarkListResponse.dataMode())
            .isEqualTo(SiteRemarkListResponse.DataMode.TEST)
        assertThat(siteRemarkListResponse.idSite()).isEqualTo("SITE-ID")
        assertThat(siteRemarkListResponse.source()).isEqualTo("Bluestaq")
        assertThat(siteRemarkListResponse.text()).isEqualTo("This is a remark")
        assertThat(siteRemarkListResponse.id()).contains("5000a3ef-8e39-2551-80f1-b3cd1895fe7b")
        assertThat(siteRemarkListResponse.code()).contains("M")
        assertThat(siteRemarkListResponse.createdAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(siteRemarkListResponse.createdBy()).contains("some.user")
        assertThat(siteRemarkListResponse.name()).contains("Remark name")
        assertThat(siteRemarkListResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(siteRemarkListResponse.origNetwork()).contains("OPS1")
        assertThat(siteRemarkListResponse.origRmkId()).contains("123456ABC")
        assertThat(siteRemarkListResponse.type()).contains("Restriction")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val siteRemarkListResponse =
            SiteRemarkListResponse.builder()
                .classificationMarking("U")
                .dataMode(SiteRemarkListResponse.DataMode.TEST)
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

        val roundtrippedSiteRemarkListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(siteRemarkListResponse),
                jacksonTypeRef<SiteRemarkListResponse>(),
            )

        assertThat(roundtrippedSiteRemarkListResponse).isEqualTo(siteRemarkListResponse)
    }
}
