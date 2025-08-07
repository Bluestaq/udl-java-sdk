// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailCreateParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailFindBySourceParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailGetParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailListParams
import com.unifieddatalibrary.api.models.organizationdetails.OrganizationdetailUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrganizationdetailServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationdetailService = client.organizationdetails()

        organizationdetailService.create(
            OrganizationdetailCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OrganizationdetailCreateParams.DataMode.TEST)
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
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .build()
        )
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationdetailService = client.organizationdetails()

        organizationdetailService.update(
            OrganizationdetailUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(OrganizationdetailUpdateParams.DataMode.TEST)
                .idOrganization("ORGANIZATION-ID")
                .name("some.user")
                .source("some.user")
                .bodyId("ORGANIZATIONDETAILS-ID")
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
                .addTag("PROVIDER_TAG1")
                .addTag("PROVIDER_TAG2")
                .build()
        )
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationdetailService = client.organizationdetails()

        val page =
            organizationdetailService.list(
                OrganizationdetailListParams.builder().name("name").build()
            )

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationdetailService = client.organizationdetails()

        organizationdetailService.delete("id")
    }

    @Test
    fun findBySource() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationdetailService = client.organizationdetails()

        val response =
            organizationdetailService.findBySource(
                OrganizationdetailFindBySourceParams.builder()
                    .name("name")
                    .source("source")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        response.forEach { it.validate() }
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationdetailService = client.organizationdetails()

        val organizationDetailsFull =
            organizationdetailService.get(
                OrganizationdetailGetParams.builder()
                    .id("id")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        organizationDetailsFull.validate()
    }
}
