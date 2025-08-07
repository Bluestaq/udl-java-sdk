// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking.scs

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.scs.paths.PathCreateWithFileParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PathServiceTest {

    @Test
    fun createWithFile() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val pathService = client.scs().paths()

        pathService.createWithFile(
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
    }
}
