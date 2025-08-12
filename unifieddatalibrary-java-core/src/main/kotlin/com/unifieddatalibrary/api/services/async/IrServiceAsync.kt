// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.ir.IrCountParams
import com.unifieddatalibrary.api.models.ir.IrCreateParams
import com.unifieddatalibrary.api.models.ir.IrDeleteParams
import com.unifieddatalibrary.api.models.ir.IrGetParams
import com.unifieddatalibrary.api.models.ir.IrGetResponse
import com.unifieddatalibrary.api.models.ir.IrListPageAsync
import com.unifieddatalibrary.api.models.ir.IrListParams
import com.unifieddatalibrary.api.models.ir.IrQueryhelpParams
import com.unifieddatalibrary.api.models.ir.IrQueryhelpResponse
import com.unifieddatalibrary.api.models.ir.IrTupleParams
import com.unifieddatalibrary.api.models.ir.IrTupleResponse
import com.unifieddatalibrary.api.models.ir.IrUpdateParams
import com.unifieddatalibrary.api.services.async.IrServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IrServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IrServiceAsync

    /** Service operation to take a single IR as a POST body and ingest into the database. An IR is an on-orbit infrared payload. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun create(params: IrCreateParams): CompletableFuture<Void?> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: IrCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to update a single IR. An IR is an on-orbit infrared payload. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun update(pathId: String, params: IrUpdateParams): CompletableFuture<Void?> =
        update(
          pathId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(pathId: String, params: IrUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .pathId(pathId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: IrUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: IrUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun list(): CompletableFuture<IrListPageAsync> = list(IrListParams.none())

    /** @see list */
    fun list(params: IrListParams = IrListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IrListPageAsync>

    /** @see list */
    fun list(params: IrListParams = IrListParams.none()): CompletableFuture<IrListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<IrListPageAsync> =
        list(
          IrListParams.none(), requestOptions
        )

    /** Service operation to delete a IR object specified by the passed ID path parameter. An IR is an on-orbit infrared payload. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
    fun delete(id: String): CompletableFuture<Void?> =
        delete(
          id, IrDeleteParams.none()
        )

    /** @see delete */
    fun delete(id: String, params: IrDeleteParams = IrDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(id: String, params: IrDeleteParams = IrDeleteParams.none()): CompletableFuture<Void?> =
        delete(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(params: IrDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: IrDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(
          id,
          IrDeleteParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(): CompletableFuture<String> = count(IrCountParams.none())

    /** @see count */
    fun count(params: IrCountParams = IrCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** @see count */
    fun count(params: IrCountParams = IrCountParams.none()): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(requestOptions: RequestOptions): CompletableFuture<String> =
        count(
          IrCountParams.none(), requestOptions
        )

    /** Service operation to get a single IR record by its unique ID passed as a path parameter. An IR is an on-orbit infrared payload. */
    fun get(id: String): CompletableFuture<IrGetResponse> =
        get(
          id, IrGetParams.none()
        )

    /** @see get */
    fun get(id: String, params: IrGetParams = IrGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IrGetResponse> =
        get(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see get */
    fun get(id: String, params: IrGetParams = IrGetParams.none()): CompletableFuture<IrGetResponse> =
        get(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see get */
    fun get(params: IrGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IrGetResponse>

    /** @see get */
    fun get(params: IrGetParams): CompletableFuture<IrGetResponse> =
        get(
          params, RequestOptions.none()
        )

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): CompletableFuture<IrGetResponse> =
        get(
          id,
          IrGetParams.none(),
          requestOptions,
        )

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryhelp(): CompletableFuture<IrQueryhelpResponse> = queryhelp(IrQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(params: IrQueryhelpParams = IrQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<IrQueryhelpResponse>

    /** @see queryhelp */
    fun queryhelp(params: IrQueryhelpParams = IrQueryhelpParams.none()): CompletableFuture<IrQueryhelpResponse> =
        queryhelp(
          params, RequestOptions.none()
        )

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): CompletableFuture<IrQueryhelpResponse> =
        queryhelp(
          IrQueryhelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: IrTupleParams): CompletableFuture<List<IrTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: IrTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<IrTupleResponse>>

    /** A view of [IrServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IrServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /udl/ir`, but is otherwise the same as [IrServiceAsync.create]. */
        fun create(params: IrCreateParams): CompletableFuture<HttpResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: IrCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `put /udl/ir/{id}`, but is otherwise the same as [IrServiceAsync.update]. */
        fun update(pathId: String, params: IrUpdateParams): CompletableFuture<HttpResponse> =
            update(
              pathId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(pathId: String, params: IrUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .pathId(pathId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: IrUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: IrUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `get /udl/ir`, but is otherwise the same as [IrServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<IrListPageAsync>> = list(IrListParams.none())

        /** @see list */
        fun list(params: IrListParams = IrListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IrListPageAsync>>

        /** @see list */
        fun list(params: IrListParams = IrListParams.none()): CompletableFuture<HttpResponseFor<IrListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<IrListPageAsync>> =
            list(
              IrListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `delete /udl/ir/{id}`, but is otherwise the same as [IrServiceAsync.delete]. */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(
              id, IrDeleteParams.none()
            )

        /** @see delete */
        fun delete(id: String, params: IrDeleteParams = IrDeleteParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(id: String, params: IrDeleteParams = IrDeleteParams.none()): CompletableFuture<HttpResponse> =
            delete(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(params: IrDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: IrDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(
              id,
              IrDeleteParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/ir/count`, but is otherwise the same as [IrServiceAsync.count]. */
        fun count(): CompletableFuture<HttpResponseFor<String>> = count(IrCountParams.none())

        /** @see count */
        fun count(params: IrCountParams = IrCountParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** @see count */
        fun count(params: IrCountParams = IrCountParams.none()): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            count(
              IrCountParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/ir/{id}`, but is otherwise the same as [IrServiceAsync.get]. */
        fun get(id: String): CompletableFuture<HttpResponseFor<IrGetResponse>> =
            get(
              id, IrGetParams.none()
            )

        /** @see get */
        fun get(id: String, params: IrGetParams = IrGetParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IrGetResponse>> =
            get(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see get */
        fun get(id: String, params: IrGetParams = IrGetParams.none()): CompletableFuture<HttpResponseFor<IrGetResponse>> =
            get(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see get */
        fun get(params: IrGetParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IrGetResponse>>

        /** @see get */
        fun get(params: IrGetParams): CompletableFuture<HttpResponseFor<IrGetResponse>> =
            get(
              params, RequestOptions.none()
            )

        /** @see get */
        fun get(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<IrGetResponse>> =
            get(
              id,
              IrGetParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/ir/queryhelp`, but is otherwise the same as [IrServiceAsync.queryhelp]. */
        fun queryhelp(): CompletableFuture<HttpResponseFor<IrQueryhelpResponse>> = queryhelp(IrQueryhelpParams.none())

        /** @see queryhelp */
        fun queryhelp(params: IrQueryhelpParams = IrQueryhelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<IrQueryhelpResponse>>

        /** @see queryhelp */
        fun queryhelp(params: IrQueryhelpParams = IrQueryhelpParams.none()): CompletableFuture<HttpResponseFor<IrQueryhelpResponse>> =
            queryhelp(
              params, RequestOptions.none()
            )

        /** @see queryhelp */
        fun queryhelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<IrQueryhelpResponse>> =
            queryhelp(
              IrQueryhelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/ir/tuple`, but is otherwise the same as [IrServiceAsync.tuple]. */
        fun tuple(params: IrTupleParams): CompletableFuture<HttpResponseFor<List<IrTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: IrTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<IrTupleResponse>>>
    }
}
