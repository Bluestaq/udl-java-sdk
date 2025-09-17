// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs.notifications

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OffsetServiceAsyncTest {

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val offsetServiceAsync = client.scs().notifications().offset()

        val offsetFuture = offsetServiceAsync.get()

        val offset = offsetFuture.get()
        offset.validate()
    }

    @Test
    fun getLatest() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val offsetServiceAsync = client.scs().notifications().offset()

        val future = offsetServiceAsync.getLatest()

        val response = future.get()
    }
}
