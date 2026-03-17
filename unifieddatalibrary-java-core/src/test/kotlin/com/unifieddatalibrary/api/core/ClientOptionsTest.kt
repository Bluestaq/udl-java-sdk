// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.core

import com.unifieddatalibrary.api.core.http.HttpClient
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.mock
import org.mockito.kotlin.never
import org.mockito.kotlin.verify

@ExtendWith(MockitoExtension::class)
internal class ClientOptionsTest {

    private val httpClient = mock<HttpClient>()

    @Test
    fun putHeader_canOverwriteDefaultHeader() {
        val clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .putHeader("User-Agent", "My User Agent")
                .password("My Password")
                .username("My Username")
                .build()

        assertThat(clientOptions.headers.values("User-Agent")).containsExactly("My User Agent")
    }

    @Test
    fun toBuilder_basicAuthCanBeUpdated() {
        var clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .username("My Username")
                .password("My Password")
                .build()

        clientOptions =
            clientOptions
                .toBuilder()
                .username("another My Username")
                .password("another My Password")
                .build()

        assertThat(clientOptions.headers.values("Authorization"))
            .containsExactly("Basic YW5vdGhlciBNeSBVc2VybmFtZTphbm90aGVyIE15IFBhc3N3b3Jk")
    }

    @Test
    fun toBuilder_whenOriginalClientOptionsGarbageCollected_doesNotCloseOriginalClient() {
        var clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .password("My Password")
                .username("My Username")
                .build()
        verify(httpClient, never()).close()

        // Overwrite the `clientOptions` variable so that the original `ClientOptions` is GC'd.
        clientOptions = clientOptions.toBuilder().build()
        System.gc()
        Thread.sleep(100)

        verify(httpClient, never()).close()
        // This exists so that `clientOptions` is still reachable.
        assertThat(clientOptions).isEqualTo(clientOptions)
    }
}
