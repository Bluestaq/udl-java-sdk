// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.sensortype.SensorTypeGetParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SensorTypeServiceAsyncTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorTypeServiceAsync = client.sensorType()

        val pageFuture = sensorTypeServiceAsync.list()

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun get() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val sensorTypeServiceAsync = client.sensorType()

        val sensorTypeFuture =
            sensorTypeServiceAsync.get(
                SensorTypeGetParams.builder().id(0).firstResult(0L).maxResults(0L).build()
            )

        val sensorType = sensorTypeFuture.get()
        sensorType.validate()
    }
}
