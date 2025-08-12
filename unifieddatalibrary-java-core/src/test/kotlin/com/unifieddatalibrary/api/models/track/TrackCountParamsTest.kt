// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.track

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.track.TrackCountParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrackCountParamsTest {

    @Test
    fun create() {
      TrackCountParams.builder()
          .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = TrackCountParams.builder()
          .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("ts", "2019-12-27T18:11:19.117Z")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = TrackCountParams.builder()
          .ts(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("ts", "2019-12-27T18:11:19.117Z")
          .build())
    }
}
