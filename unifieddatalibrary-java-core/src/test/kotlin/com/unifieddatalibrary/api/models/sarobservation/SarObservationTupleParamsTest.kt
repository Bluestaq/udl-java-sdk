// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.sarobservation

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.sarobservation.SarObservationTupleParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SarObservationTupleParamsTest {

    @Test
    fun create() {
      SarObservationTupleParams.builder()
          .collectionStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .build()
    }

    @Test
    fun queryParams() {
      val params = SarObservationTupleParams.builder()
          .collectionStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .columns("columns")
          .firstResult(0L)
          .maxResults(0L)
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("collectionStart", "2019-12-27T18:11:19.117Z")
          .put("columns", "columns")
          .put("firstResult", "0")
          .put("maxResults", "0")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = SarObservationTupleParams.builder()
          .collectionStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .columns("columns")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("collectionStart", "2019-12-27T18:11:19.117Z")
          .put("columns", "columns")
          .build())
    }
}
