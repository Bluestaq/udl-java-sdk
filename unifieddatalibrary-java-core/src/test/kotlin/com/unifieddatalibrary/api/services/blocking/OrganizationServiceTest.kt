// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.organization.OrganizationCountParams
import com.unifieddatalibrary.api.models.organization.OrganizationCreateParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetOrganizationCategoriesParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetOrganizationTypesParams
import com.unifieddatalibrary.api.models.organization.OrganizationGetParams
import com.unifieddatalibrary.api.models.organization.OrganizationTupleParams
import com.unifieddatalibrary.api.models.organization.OrganizationUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrganizationServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationService = client.organization()

        organizationService.create(
            OrganizationCreateParams.builder()
                .classificationMarking("U")
                .dataMode(OrganizationCreateParams.DataMode.TEST)
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
        val organizationService = client.organization()

        organizationService.update(
            OrganizationUpdateParams.builder()
                .pathId("id")
                .classificationMarking("U")
                .dataMode(OrganizationUpdateParams.DataMode.TEST)
                .name("some.user")
                .source("some.user")
                .type("GOVERNMENT")
                .bodyId("ORGANIZATION-ID")
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
        val organizationService = client.organization()

        val page = organizationService.list()

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
        val organizationService = client.organization()

        organizationService.delete("id")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationService = client.organization()

        organizationService.count(
            OrganizationCountParams.builder().firstResult(0L).maxResults(0L).build()
        )
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationService = client.organization()

        val organizationFull =
            organizationService.get(
                OrganizationGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        organizationFull.validate()
    }

    @Test
    fun getOrganizationCategories() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationService = client.organization()

        organizationService.getOrganizationCategories(
            OrganizationGetOrganizationCategoriesParams.builder()
                .firstResult(0L)
                .maxResults(0L)
                .build()
        )
    }

    @Test
    fun getOrganizationTypes() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationService = client.organization()

        organizationService.getOrganizationTypes(
            OrganizationGetOrganizationTypesParams.builder().firstResult(0L).maxResults(0L).build()
        )
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationService = client.organization()

        val response = organizationService.queryhelp()

        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationService = client.organization()

        val organizationFulls =
            organizationService.tuple(
                OrganizationTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        organizationFulls.forEach { it.validate() }
    }
}
