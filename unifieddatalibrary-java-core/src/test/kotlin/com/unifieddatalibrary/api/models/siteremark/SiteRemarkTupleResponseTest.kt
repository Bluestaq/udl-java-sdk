// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.siteremark

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiteRemarkTupleResponseTest {

    @Test
    fun create() {
        val siteRemarkTupleResponse =
            SiteRemarkTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SiteRemarkTupleResponse.DataMode.TEST)
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

        assertThat(siteRemarkTupleResponse.classificationMarking()).isEqualTo("U")
        assertThat(siteRemarkTupleResponse.dataMode())
            .isEqualTo(SiteRemarkTupleResponse.DataMode.TEST)
        assertThat(siteRemarkTupleResponse.idSite()).isEqualTo("SITE-ID")
        assertThat(siteRemarkTupleResponse.source()).isEqualTo("Bluestaq")
        assertThat(siteRemarkTupleResponse.text()).isEqualTo("This is a remark")
        assertThat(siteRemarkTupleResponse.id()).contains("5000a3ef-8e39-2551-80f1-b3cd1895fe7b")
        assertThat(siteRemarkTupleResponse.code()).contains("M")
        assertThat(siteRemarkTupleResponse.createdAt())
            .contains(OffsetDateTime.parse("2022-01-01T16:00:00.123Z"))
        assertThat(siteRemarkTupleResponse.createdBy()).contains("some.user")
        assertThat(siteRemarkTupleResponse.name()).contains("Remark name")
        assertThat(siteRemarkTupleResponse.origin()).contains("THIRD_PARTY_DATASOURCE")
        assertThat(siteRemarkTupleResponse.origNetwork()).contains("OPS1")
        assertThat(siteRemarkTupleResponse.origRmkId()).contains("123456ABC")
        assertThat(siteRemarkTupleResponse.type()).contains("Restriction")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val siteRemarkTupleResponse =
            SiteRemarkTupleResponse.builder()
                .classificationMarking("U")
                .dataMode(SiteRemarkTupleResponse.DataMode.TEST)
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

        val roundtrippedSiteRemarkTupleResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(siteRemarkTupleResponse),
                jacksonTypeRef<SiteRemarkTupleResponse>(),
            )

        assertThat(roundtrippedSiteRemarkTupleResponse).isEqualTo(siteRemarkTupleResponse)
    }
}
