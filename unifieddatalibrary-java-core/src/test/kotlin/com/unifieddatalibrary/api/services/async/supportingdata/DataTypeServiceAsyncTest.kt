// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.supportingdata

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DataTypeServiceAsyncTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val dataTypeServiceAsync = client.supportingData().dataTypes()

        val pageFuture = dataTypeServiceAsync.list()

        val page = pageFuture.get()
    }
}
