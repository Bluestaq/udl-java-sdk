// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.supportingdata

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.supportingdata.providermetadata.ProviderMetadataRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProviderMetadataServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val providerMetadataServiceAsync = client.supportingData().providerMetadata()

        val dataownerAbridgedsFuture =
            providerMetadataServiceAsync.retrieve(
                ProviderMetadataRetrieveParams.builder().firstResult(0L).maxResults(0L).build()
            )

        val dataownerAbridgeds = dataownerAbridgedsFuture.get()
        dataownerAbridgeds.forEach { it.validate() }
    }
}
