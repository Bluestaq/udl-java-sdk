// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.organizationdetails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrganizationdetailListResponseTest {

    @Test
    fun create() {
        val organizationdetailListResponse =
            OrganizationdetailListResponse.builder()
                .classificationMarking("U")
                .dataMode(OrganizationdetailListResponse.DataMode.TEST)
                .idOrganization("ORGANIZATION-ID")
                .name("some.user")
                .source("some.user")
                .id("ORGANIZATIONDETAILS-ID")
                .address1("123 Main Street")
                .address2("Apt 4B")
                .address3("Colorado Springs CO, 80903")
                .broker("some.user")
                .ceo("some.user")
                .cfo("some.user")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .cto("some.user")
                .description("Example description")
                .ebitda(123.4)
                .email("some_organization@organization.com")
                .financialNotes("Example notes")
                .financialYearEndDate(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .fleetPlanNotes("Example notes")
                .formerOrgId("FORMERORG-ID")
                .ftes(123)
                .geoAdminLevel1("Colorado")
                .geoAdminLevel2("El Paso County")
                .geoAdminLevel3("Colorado Springs")
                .massRanking(123)
                .origin("some.user")
                .origNetwork("OPS1")
                .parentOrgId("PARENTORG-ID")
                .postalCode("80903")
                .profit(123.4)
                .revenue(123.4)
                .revenueRanking(123)
                .riskManager("some.user")
                .servicesNotes("Example notes")
                .build()

        assertThat(organizationdetailListResponse.classificationMarking()).isEqualTo("U")
        assertThat(organizationdetailListResponse.dataMode())
            .isEqualTo(OrganizationdetailListResponse.DataMode.TEST)
        assertThat(organizationdetailListResponse.idOrganization()).isEqualTo("ORGANIZATION-ID")
        assertThat(organizationdetailListResponse.name()).isEqualTo("some.user")
        assertThat(organizationdetailListResponse.source()).isEqualTo("some.user")
        assertThat(organizationdetailListResponse.id()).contains("ORGANIZATIONDETAILS-ID")
        assertThat(organizationdetailListResponse.address1()).contains("123 Main Street")
        assertThat(organizationdetailListResponse.address2()).contains("Apt 4B")
        assertThat(organizationdetailListResponse.address3()).contains("Colorado Springs CO, 80903")
        assertThat(organizationdetailListResponse.broker()).contains("some.user")
        assertThat(organizationdetailListResponse.ceo()).contains("some.user")
        assertThat(organizationdetailListResponse.cfo()).contains("some.user")
        assertThat(organizationdetailListResponse.createdAt())
            .contains(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
        assertThat(organizationdetailListResponse.createdBy()).contains("some.user")
        assertThat(organizationdetailListResponse.cto()).contains("some.user")
        assertThat(organizationdetailListResponse.description()).contains("Example description")
        assertThat(organizationdetailListResponse.ebitda()).contains(123.4)
        assertThat(organizationdetailListResponse.email())
            .contains("some_organization@organization.com")
        assertThat(organizationdetailListResponse.financialNotes()).contains("Example notes")
        assertThat(organizationdetailListResponse.financialYearEndDate())
            .contains(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
        assertThat(organizationdetailListResponse.fleetPlanNotes()).contains("Example notes")
        assertThat(organizationdetailListResponse.formerOrgId()).contains("FORMERORG-ID")
        assertThat(organizationdetailListResponse.ftes()).contains(123)
        assertThat(organizationdetailListResponse.geoAdminLevel1()).contains("Colorado")
        assertThat(organizationdetailListResponse.geoAdminLevel2()).contains("El Paso County")
        assertThat(organizationdetailListResponse.geoAdminLevel3()).contains("Colorado Springs")
        assertThat(organizationdetailListResponse.massRanking()).contains(123)
        assertThat(organizationdetailListResponse.origin()).contains("some.user")
        assertThat(organizationdetailListResponse.origNetwork()).contains("OPS1")
        assertThat(organizationdetailListResponse.parentOrgId()).contains("PARENTORG-ID")
        assertThat(organizationdetailListResponse.postalCode()).contains("80903")
        assertThat(organizationdetailListResponse.profit()).contains(123.4)
        assertThat(organizationdetailListResponse.revenue()).contains(123.4)
        assertThat(organizationdetailListResponse.revenueRanking()).contains(123)
        assertThat(organizationdetailListResponse.riskManager()).contains("some.user")
        assertThat(organizationdetailListResponse.servicesNotes()).contains("Example notes")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val organizationdetailListResponse =
            OrganizationdetailListResponse.builder()
                .classificationMarking("U")
                .dataMode(OrganizationdetailListResponse.DataMode.TEST)
                .idOrganization("ORGANIZATION-ID")
                .name("some.user")
                .source("some.user")
                .id("ORGANIZATIONDETAILS-ID")
                .address1("123 Main Street")
                .address2("Apt 4B")
                .address3("Colorado Springs CO, 80903")
                .broker("some.user")
                .ceo("some.user")
                .cfo("some.user")
                .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                .createdBy("some.user")
                .cto("some.user")
                .description("Example description")
                .ebitda(123.4)
                .email("some_organization@organization.com")
                .financialNotes("Example notes")
                .financialYearEndDate(OffsetDateTime.parse("2021-01-01T01:01:01.123Z"))
                .fleetPlanNotes("Example notes")
                .formerOrgId("FORMERORG-ID")
                .ftes(123)
                .geoAdminLevel1("Colorado")
                .geoAdminLevel2("El Paso County")
                .geoAdminLevel3("Colorado Springs")
                .massRanking(123)
                .origin("some.user")
                .origNetwork("OPS1")
                .parentOrgId("PARENTORG-ID")
                .postalCode("80903")
                .profit(123.4)
                .revenue(123.4)
                .revenueRanking(123)
                .riskManager("some.user")
                .servicesNotes("Example notes")
                .build()

        val roundtrippedOrganizationdetailListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(organizationdetailListResponse),
                jacksonTypeRef<OrganizationdetailListResponse>(),
            )

        assertThat(roundtrippedOrganizationdetailListResponse)
            .isEqualTo(organizationdetailListResponse)
    }
}
