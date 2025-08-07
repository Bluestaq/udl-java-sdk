// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.countries.CountryCountParams
import com.unifieddatalibrary.api.models.countries.CountryCreateParams
import com.unifieddatalibrary.api.models.countries.CountryRetrieveParams
import com.unifieddatalibrary.api.models.countries.CountryTupleParams
import com.unifieddatalibrary.api.models.countries.CountryUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CountryServiceAsyncTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val countryServiceAsync = client.countries()

        val future =
            countryServiceAsync.create(
                CountryCreateParams.builder()
                    .code("US")
                    .dataMode(CountryCreateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .codeAlt("US")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .fipsCode("US")
                    .iso3Code("USA")
                    .name("UNITED STATES")
                    .origNetwork("OPS1")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val countryServiceAsync = client.countries()

        val countryFullFuture =
            countryServiceAsync.retrieve(
                CountryRetrieveParams.builder().code("code").firstResult(0L).maxResults(0L).build()
            )

        val countryFull = countryFullFuture.get()
        countryFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val countryServiceAsync = client.countries()

        val future =
            countryServiceAsync.update(
                CountryUpdateParams.builder()
                    .pathCode("code")
                    .bodyCode("US")
                    .dataMode(CountryUpdateParams.DataMode.TEST)
                    .source("Bluestaq")
                    .codeAlt("US")
                    .createdAt(OffsetDateTime.parse("2018-01-01T16:00:00.123Z"))
                    .createdBy("some.user")
                    .fipsCode("US")
                    .iso3Code("USA")
                    .name("UNITED STATES")
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
        val countryServiceAsync = client.countries()

        val pageFuture = countryServiceAsync.list()

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
        val countryServiceAsync = client.countries()

        val future = countryServiceAsync.delete("code")

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
        val countryServiceAsync = client.countries()

        val responseFuture =
            countryServiceAsync.count(
                CountryCountParams.builder().firstResult(0L).maxResults(0L).build()
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
        val countryServiceAsync = client.countries()

        val responseFuture = countryServiceAsync.queryhelp()

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
        val countryServiceAsync = client.countries()

        val countryFullsFuture =
            countryServiceAsync.tuple(
                CountryTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val countryFulls = countryFullsFuture.get()
        countryFulls.forEach { it.validate() }
    }
}
