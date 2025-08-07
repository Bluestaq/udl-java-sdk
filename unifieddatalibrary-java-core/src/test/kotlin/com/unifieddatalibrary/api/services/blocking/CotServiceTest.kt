// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient
import com.unifieddatalibrary.api.models.cots.CotCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CotServiceTest {

    @Test
    fun create() {
        val client =
            UnifieddatalibraryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val cotService = client.cots()

        cotService.create(
            CotCreateParams.builder()
                .lat(45.23)
                .lon(45.23)
                .alt(5.23)
                .addCallSign("string")
                .ce(10.23)
                .cotChatData(
                    CotCreateParams.CotChatData.builder()
                        .chatMsg("Mission is go")
                        .chatRoom("All Chat Rooms")
                        .chatSenderCallSign("Pebble")
                        .build()
                )
                .cotPositionData(
                    CotCreateParams.CotPositionData.builder()
                        .callSign("POI_NAME")
                        .team("Description of the object")
                        .teamRole("Team Member")
                        .build()
                )
                .addGroup("string")
                .how("h-e")
                .le(10.23)
                .senderUid("POI-ID")
                .stale(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .start(OffsetDateTime.parse("2020-01-01T16:00:00.123456Z"))
                .type("a-h-G")
                .addUid("string")
                .build()
        )
    }
}
