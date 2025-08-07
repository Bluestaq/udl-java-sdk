// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.attitudesets.AttitudesetRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AttitudesetServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val attitudesetServiceAsync = client.attitudesets()

        val attitudesetFullFuture =
            attitudesetServiceAsync.retrieve(
                AttitudesetRetrieveParams.builder().id("id").firstResult(0L).maxResults(0L).build()
            )

        val attitudesetFull = attitudesetFullFuture.get()
        attitudesetFull.validate()
    }
}
