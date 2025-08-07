// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.siteremark

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiteRemarkGetResponseTest {

    @Test
    fun create() {
        val siteRemarkGetResponse =
            SiteRemarkGetResponse.builder()
                .classificationMarking("U")
                .dataMode(SiteRemarkGetResponse.DataMode.TEST)
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

        assertThat(siteRemarkGetResponse.classificationMarking()).isEqualTo("U")
        assertThat(siteRemarkGetResponse.dataMode()).isEqualTo(SiteRemarkGetResponse.DataMode.TEST)
        assertThat(siteRemarkGetResponse.idSite()).isEqualTo("SITE-ID")
        assertThat(siteRemarkGetResponse.source()).isEqualTo("Bluestaq")
        assertThat(siteRemarkGetResponse.text()).isEqualTo("This is a remark")
        assertThat(siteRemarkGetResponse.id()).contains("5000a3ef-8e39-2551-80f1-b3cd1895fe7b")
        assertThat(siteRemarkGetResponse.code()).contains("M")
        assertThat(siteRemarkGetResponse.createdAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(siteRemarkGetResponse.createdBy()).contains("some.user")
        assertThat(siteRemarkGetResponse.name()).contains("Remark name")
        assertThat(siteRemarkGetResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(siteRemarkGetResponse.origNetwork()).contains("OPS1")
        assertThat(siteRemarkGetResponse.origRmkId()).contains("123456ABC")
        assertThat(siteRemarkGetResponse.type()).contains("Restriction")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val siteRemarkGetResponse =
            SiteRemarkGetResponse.builder()
                .classificationMarking("U")
                .dataMode(SiteRemarkGetResponse.DataMode.TEST)
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

        val roundtrippedSiteRemarkGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(siteRemarkGetResponse),
                jacksonTypeRef<SiteRemarkGetResponse>(),
            )

        assertThat(roundtrippedSiteRemarkGetResponse).isEqualTo(siteRemarkGetResponse)
    }
}
