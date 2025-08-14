// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.organization

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationListResponseTest {

    @Test
    fun create() {
        val organizationListResponse =
            OrganizationListResponse.builder()
                .classificationMarking("U")
                .dataMode(OrganizationListResponse.DataMode.TEST)
                .name("some.user")
                .source("some.user")
                .type("GOVERNMENT")
                .id("ORGANIZATION-ID")
                .active(false)
                .category("Private company")
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Example description")
                .externalId("EXTERNAL-ID")
                .nationality("US")
                .origin("some.user")
                .origNetwork("OPS1")
                .build()

        assertThat(organizationListResponse.classificationMarking()).isEqualTo("U")
        assertThat(organizationListResponse.dataMode())
            .isEqualTo(OrganizationListResponse.DataMode.TEST)
        assertThat(organizationListResponse.name()).isEqualTo("some.user")
        assertThat(organizationListResponse.source()).isEqualTo("some.user")
        assertThat(organizationListResponse.type()).isEqualTo("GOVERNMENT")
        assertThat(organizationListResponse.id()).contains("ORGANIZATION-ID")
        assertThat(organizationListResponse.active()).contains(false)
        assertThat(organizationListResponse.category()).contains("Private company")
        assertThat(organizationListResponse.countryCode()).contains("US")
        assertThat(organizationListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(organizationListResponse.createdBy()).contains("some.user")
        assertThat(organizationListResponse.description()).contains("Example description")
        assertThat(organizationListResponse.externalId()).contains("EXTERNAL-ID")
        assertThat(organizationListResponse.nationality()).contains("US")
        assertThat(organizationListResponse.origin()).contains("some.user")
        assertThat(organizationListResponse.origNetwork()).contains("OPS1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationListResponse =
            OrganizationListResponse.builder()
                .classificationMarking("U")
                .dataMode(OrganizationListResponse.DataMode.TEST)
                .name("some.user")
                .source("some.user")
                .type("GOVERNMENT")
                .id("ORGANIZATION-ID")
                .active(false)
                .category("Private company")
                .countryCode("US")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .description("Example description")
                .externalId("EXTERNAL-ID")
                .nationality("US")
                .origin("some.user")
                .origNetwork("OPS1")
                .build()

        val roundtrippedOrganizationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationListResponse),
                jacksonTypeRef<OrganizationListResponse>(),
            )

        assertThat(roundtrippedOrganizationListResponse).isEqualTo(organizationListResponse)
    }
}
