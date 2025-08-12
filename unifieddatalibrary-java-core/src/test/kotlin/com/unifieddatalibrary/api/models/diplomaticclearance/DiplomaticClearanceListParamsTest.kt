// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.diplomaticclearance

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.diplomaticclearance.DiplomaticClearanceListParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiplomaticClearanceListParamsTest {

    @Test
    fun create() {
      DiplomaticClearanceListParams.builder()
          .firstDepDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = DiplomaticClearanceListParams.builder()
          .firstDepDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("firstDepDate", "2019-12-27T18:11:19.117Z")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = DiplomaticClearanceListParams.builder()
          .firstDepDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("firstDepDate", "2019-12-27T18:11:19.117Z")
          .build())
    }
}
