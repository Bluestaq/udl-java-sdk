// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.orbitdetermination

import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.models.orbitdetermination.OrbitdeterminationTupleParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrbitdeterminationTupleParamsTest {

    @Test
    fun create() {
      OrbitdeterminationTupleParams.builder()
          .columns("columns")
          .firstResult(0L)
          .idOnOrbit("idOnOrbit")
          .maxResults(0L)
          .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
    }

    @Test
    fun queryParams() {
      val params = OrbitdeterminationTupleParams.builder()
          .columns("columns")
          .firstResult(0L)
          .idOnOrbit("idOnOrbit")
          .maxResults(0L)
          .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .put("firstResult", "0")
          .put("idOnOrbit", "idOnOrbit")
          .put("maxResults", "0")
          .put("startTime", "2019-12-27T18:11:19.117Z")
          .build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
      val params = OrbitdeterminationTupleParams.builder()
          .columns("columns")
          .build()

      val queryParams = params._queryParams()

      assertThat(queryParams).isEqualTo(QueryParams.builder()
          .put("columns", "columns")
          .build())
    }
}
