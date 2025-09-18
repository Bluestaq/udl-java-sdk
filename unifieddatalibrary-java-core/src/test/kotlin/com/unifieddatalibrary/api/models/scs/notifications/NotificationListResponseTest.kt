// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.scs.notifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.unifieddatalibrary.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotificationListResponseTest {

    @Test
    fun create() {
        val notificationListResponse =
            NotificationListResponse.builder()
                .addAction(NotificationListResponse.Action.ROOT_WRITE)
                .classificationMarking("classificationMarking")
                .crossDomainTo("crossDomainTo")
                .expires("expires")
                .overwrite(true)
                .path("path")
                .timestamp("timestamp")
                .user("user")
                .build()

        assertThat(notificationListResponse.actions().getOrNull())
            .containsExactly(NotificationListResponse.Action.ROOT_WRITE)
        assertThat(notificationListResponse.classificationMarking())
            .contains("classificationMarking")
        assertThat(notificationListResponse.crossDomainTo()).contains("crossDomainTo")
        assertThat(notificationListResponse.expires()).contains("expires")
        assertThat(notificationListResponse.overwrite()).contains(true)
        assertThat(notificationListResponse.path()).contains("path")
        assertThat(notificationListResponse.timestamp()).contains("timestamp")
        assertThat(notificationListResponse.user()).contains("user")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notificationListResponse =
            NotificationListResponse.builder()
                .addAction(NotificationListResponse.Action.ROOT_WRITE)
                .classificationMarking("classificationMarking")
                .crossDomainTo("crossDomainTo")
                .expires("expires")
                .overwrite(true)
                .path("path")
                .timestamp("timestamp")
                .user("user")
                .build()

        val roundtrippedNotificationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notificationListResponse),
                jacksonTypeRef<NotificationListResponse>(),
            )

        assertThat(roundtrippedNotificationListResponse).isEqualTo(notificationListResponse)
    }
}
