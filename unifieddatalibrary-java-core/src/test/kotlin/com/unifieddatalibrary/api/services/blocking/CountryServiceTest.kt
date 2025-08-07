// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.countries.CountryCountParams
import com.unifieddatalibrary.api.models.countries.CountryCreateParams
import com.unifieddatalibrary.api.models.countries.CountryRetrieveParams
import com.unifieddatalibrary.api.models.countries.CountryTupleParams
import com.unifieddatalibrary.api.models.countries.CountryUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CountryServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val countryService = client.countries()

        countryService.create(
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
    }

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val countryService = client.countries()

        val countryFull =
            countryService.retrieve(
                CountryRetrieveParams.builder().code("code").firstResult(0L).maxResults(0L).build()
            )

        countryFull.validate()
    }

    @Test
    fun update() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val countryService = client.countries()

        countryService.update(
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
    }

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val countryService = client.countries()

        val page = countryService.list()

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
        val countryService = client.countries()

        countryService.delete("code")
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val countryService = client.countries()

        countryService.count(CountryCountParams.builder().firstResult(0L).maxResults(0L).build())
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val countryService = client.countries()

        val response = countryService.queryhelp()

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
        val countryService = client.countries()

        val countryFulls =
            countryService.tuple(
                CountryTupleParams.builder()
                    .columns("columns")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        countryFulls.forEach { it.validate() }
    }
}
