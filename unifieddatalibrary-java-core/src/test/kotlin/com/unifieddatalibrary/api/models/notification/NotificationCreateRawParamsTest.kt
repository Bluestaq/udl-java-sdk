// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.notification

import com.unifieddatalibrary.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationCreateRawParamsTest {

    @Test
    fun create() {
        NotificationCreateRawParams.builder()
            .classificationMarking("classificationMarking")
            .dataMode("dataMode")
            .msgType("msgType")
            .origin("origin")
            .source("source")
            .msgId("msgId")
            .addTag("string")
            .body("{ \"Alert\": \"Warning\",  \"Code\": 12345 }")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NotificationCreateRawParams.builder()
                .classificationMarking("classificationMarking")
                .dataMode("dataMode")
                .msgType("msgType")
                .origin("origin")
                .source("source")
                .msgId("msgId")
                .addTag("string")
                .body("{ \"Alert\": \"Warning\",  \"Code\": 12345 }")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("classificationMarking", "classificationMarking")
                    .put("dataMode", "dataMode")
                    .put("msgType", "msgType")
                    .put("origin", "origin")
                    .put("source", "source")
                    .put("msgId", "msgId")
                    .put("tags", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            NotificationCreateRawParams.builder()
                .classificationMarking("classificationMarking")
                .dataMode("dataMode")
                .msgType("msgType")
                .origin("origin")
                .source("source")
                .body("{ \"Alert\": \"Warning\",  \"Code\": 12345 }")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("classificationMarking", "classificationMarking")
                    .put("dataMode", "dataMode")
                    .put("msgType", "msgType")
                    .put("origin", "origin")
                    .put("source", "source")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
            NotificationCreateRawParams.builder()
                .classificationMarking("classificationMarking")
                .dataMode("dataMode")
                .msgType("msgType")
                .origin("origin")
                .source("source")
                .msgId("msgId")
                .addTag("string")
                .body("{ \"Alert\": \"Warning\",  \"Code\": 12345 }")
                .build()

        val body = params._body()

        assertThat(body).isEqualTo("{ \"Alert\": \"Warning\",  \"Code\": 12345 }")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NotificationCreateRawParams.builder()
                .classificationMarking("classificationMarking")
                .dataMode("dataMode")
                .msgType("msgType")
                .origin("origin")
                .source("source")
                .body("{ \"Alert\": \"Warning\",  \"Code\": 12345 }")
                .build()

        val body = params._body()

        assertThat(body).isEqualTo("{ \"Alert\": \"Warning\",  \"Code\": 12345 }")
    }
}
