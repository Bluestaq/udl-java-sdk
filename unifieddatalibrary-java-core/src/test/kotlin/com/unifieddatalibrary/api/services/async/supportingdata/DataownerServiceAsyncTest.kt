// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.supportingdata

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerCountParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveDataOwnerTypesParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveProviderMetadataParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DataownerServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dataownerServiceAsync = client.supportingData().dataowner()

        val dataownerAbridgedsFuture =
            dataownerServiceAsync.retrieve(
                DataownerRetrieveParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val dataownerAbridgeds = dataownerAbridgedsFuture.get()
        dataownerAbridgeds.forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dataownerServiceAsync = client.supportingData().dataowner()

        val responseFuture =
            dataownerServiceAsync.count(
                DataownerCountParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dataownerServiceAsync = client.supportingData().dataowner()

        val responseFuture = dataownerServiceAsync.queryHelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun retrieveDataOwnerTypes() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dataownerServiceAsync = client.supportingData().dataowner()

        val responseFuture =
            dataownerServiceAsync.retrieveDataOwnerTypes(
                DataownerRetrieveDataOwnerTypesParams.builder()
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun retrieveProviderMetadata() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dataownerServiceAsync = client.supportingData().dataowner()

        val dataownerAbridgedsFuture =
            dataownerServiceAsync.retrieveProviderMetadata(
                DataownerRetrieveProviderMetadataParams.builder()
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val dataownerAbridgeds = dataownerAbridgedsFuture.get()
        dataownerAbridgeds.forEach { it.validate() }
    }
}
