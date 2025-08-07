// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
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
internal class OrganizationServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationServiceAsync = client.organization()

        val future =
            organizationServiceAsync.create(
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

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationServiceAsync = client.organization()

        val future =
            organizationServiceAsync.update(
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

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationServiceAsync = client.organization()

        val pageFuture = organizationServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationServiceAsync = client.organization()

        val future = organizationServiceAsync.delete("id")

        val response = future.get()
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationServiceAsync = client.organization()

        val responseFuture =
            organizationServiceAsync.count(
                OrganizationCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationServiceAsync = client.organization()

        val organizationFullFuture =
            organizationServiceAsync.get(
                OrganizationGetParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val organizationFull = organizationFullFuture.get()
        organizationFull.validate()
    }

    @Test
    fun getOrganizationCategories() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationServiceAsync = client.organization()

        val responseFuture =
            organizationServiceAsync.getOrganizationCategories(
                OrganizationGetOrganizationCategoriesParams.builder()
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun getOrganizationTypes() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationServiceAsync = client.organization()

        val responseFuture =
            organizationServiceAsync.getOrganizationTypes(
                OrganizationGetOrganizationTypesParams.builder()
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationServiceAsync = client.organization()

        val responseFuture = organizationServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val organizationServiceAsync = client.organization()

        val organizationFullsFuture =
            organizationServiceAsync.tuple(
                OrganizationTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val organizationFulls = organizationFullsFuture.get()
        organizationFulls.forEach { it.validate() }
    }
}
