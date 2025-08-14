// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.supportingdata

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerCountParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveDataOwnerTypesParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveParams
import com.unifieddatalibrary.api.models.supportingdata.dataowner.DataownerRetrieveProviderMetadataParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DataownerServiceTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dataownerService = client.supportingData().dataowner()

        val dataownerAbridgeds =
            dataownerService.retrieve(
                DataownerRetrieveParams.builder().firstResult(0L).maxResults(0L).build()
            )

        dataownerAbridgeds.forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dataownerService = client.supportingData().dataowner()

        dataownerService.count(
            DataownerCountParams.builder().firstResult(0L).maxResults(0L).build()
        )
    }

    @Test
    fun queryHelp() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dataownerService = client.supportingData().dataowner()

        val response = dataownerService.queryHelp()

        response.validate()
    }

    @Test
    fun retrieveDataOwnerTypes() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dataownerService = client.supportingData().dataowner()

        dataownerService.retrieveDataOwnerTypes(
            DataownerRetrieveDataOwnerTypesParams.builder().firstResult(0L).maxResults(0L).build()
        )
    }

    @Test
    fun retrieveProviderMetadata() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dataownerService = client.supportingData().dataowner()

        val dataownerAbridgeds =
            dataownerService.retrieveProviderMetadata(
                DataownerRetrieveProviderMetadataParams.builder()
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        dataownerAbridgeds.forEach { it.validate() }
    }
}
