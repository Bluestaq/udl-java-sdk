// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.TestServerExtension
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClientAsync
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellCountParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellListParams
import com.unifieddatalibrary.api.models.h3geohexcell.H3GeoHexCellTupleParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class H3GeoHexCellServiceAsyncTest {

    @Test
    fun list() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val h3GeoHexCellServiceAsync = client.h3GeoHexCell()

        val pageFuture =
            h3GeoHexCellServiceAsync.list(
                H3GeoHexCellListParams.builder().idH3Geo("idH3Geo").build()
            )

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Test
    fun count() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val h3GeoHexCellServiceAsync = client.h3GeoHexCell()

        val responseFuture =
            h3GeoHexCellServiceAsync.count(
                H3GeoHexCellCountParams.builder()
                    .idH3Geo("idH3Geo")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
    }

    @Test
    fun queryhelp() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val h3GeoHexCellServiceAsync = client.h3GeoHexCell()

        val responseFuture = h3GeoHexCellServiceAsync.queryhelp()

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun tuple() {
        val client =
            UnifieddatalibraryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .password("My Password")
                .username("My Username")
                .build()
        val h3GeoHexCellServiceAsync = client.h3GeoHexCell()

        val responseFuture =
            h3GeoHexCellServiceAsync.tuple(
                H3GeoHexCellTupleParams.builder()
                    .columns("columns")
                    .idH3Geo("idH3Geo")
                    .firstResult(0L)
                    .maxResults(0L)
                    .build()
            )

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
