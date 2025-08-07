// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async.scs

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.scs.paths.PathCreateWithFileParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PathServiceAsyncTest {

    @Test
    fun createWithFile() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val pathServiceAsync = client.scs().paths()

        val responseFuture =
            pathServiceAsync.createWithFile(
                PathCreateWithFileParams.builder()
                    .id("id")
                    .classificationMarking("classificationMarking")
                    .deleteAfter("deleteAfter")
                    .description("description")
                    .overwrite(true)
                    .sendNotification(true)
                    .tags("tags")
                    .fileContent("some content")
                    .build()
            )

        val response = responseFuture.get()
    }
}
