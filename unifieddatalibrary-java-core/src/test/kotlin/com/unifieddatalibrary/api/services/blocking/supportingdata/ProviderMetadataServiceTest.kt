// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.supportingdata

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.supportingdata.providermetadata.ProviderMetadataRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProviderMetadataServiceTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val providerMetadataService = client.supportingData().providerMetadata()

        val dataownerAbridgeds =
            providerMetadataService.retrieve(
                ProviderMetadataRetrieveParams.builder().firstResult(0L).maxResults(0L).build()
            )

        dataownerAbridgeds.forEach { it.validate() }
    }
}
