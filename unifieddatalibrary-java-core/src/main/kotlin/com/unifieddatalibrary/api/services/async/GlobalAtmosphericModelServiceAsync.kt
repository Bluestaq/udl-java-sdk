// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.async

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelCountParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelGetFileParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryHelpParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryHelpResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelRetrieveParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelRetrieveResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelTupleParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelTupleResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.async.GlobalAtmosphericModelServiceAsync
import com.unifieddatalibrary.api.services.async.globalatmosphericmodel.HistoryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GlobalAtmosphericModelServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalAtmosphericModelServiceAsync

    fun history(): HistoryServiceAsync

    /** Service operation to get a single GlobalAtmosphericModel record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): CompletableFuture<GlobalAtmosphericModelRetrieveResponse> =
        retrieve(
          id, GlobalAtmosphericModelRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: GlobalAtmosphericModelRetrieveParams = GlobalAtmosphericModelRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<GlobalAtmosphericModelRetrieveResponse> =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: GlobalAtmosphericModelRetrieveParams = GlobalAtmosphericModelRetrieveParams.none()): CompletableFuture<GlobalAtmosphericModelRetrieveResponse> =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: GlobalAtmosphericModelRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<GlobalAtmosphericModelRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: GlobalAtmosphericModelRetrieveParams): CompletableFuture<GlobalAtmosphericModelRetrieveResponse> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<GlobalAtmosphericModelRetrieveResponse> =
        retrieve(
          id,
          GlobalAtmosphericModelRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: GlobalAtmosphericModelCountParams): CompletableFuture<String> =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: GlobalAtmosphericModelCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<String>

    /** Service operation to get a single GlobalAtmosphericModel compressed data file by its unique ID passed as a path parameter. The compressed data file is returned as an attachment Content-Disposition. */
    fun getFile(id: String): CompletableFuture<HttpResponse> =
        getFile(
          id, GlobalAtmosphericModelGetFileParams.none()
        )

    /** @see getFile */
    fun getFile(id: String, params: GlobalAtmosphericModelGetFileParams = GlobalAtmosphericModelGetFileParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
        getFile(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see getFile */
    fun getFile(id: String, params: GlobalAtmosphericModelGetFileParams = GlobalAtmosphericModelGetFileParams.none()): CompletableFuture<HttpResponse> =
        getFile(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see getFile */
    fun getFile(params: GlobalAtmosphericModelGetFileParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

    /** @see getFile */
    fun getFile(params: GlobalAtmosphericModelGetFileParams): CompletableFuture<HttpResponse> =
        getFile(
          params, RequestOptions.none()
        )

    /** @see getFile */
    fun getFile(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        getFile(
          id,
          GlobalAtmosphericModelGetFileParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun query(params: GlobalAtmosphericModelQueryParams): CompletableFuture<List<GlobalAtmosphericModelQueryResponse>> =
        query(
          params, RequestOptions.none()
        )

    /** @see query */
    fun query(params: GlobalAtmosphericModelQueryParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<GlobalAtmosphericModelQueryResponse>>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): CompletableFuture<GlobalAtmosphericModelQueryHelpResponse> = queryHelp(GlobalAtmosphericModelQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: GlobalAtmosphericModelQueryHelpParams = GlobalAtmosphericModelQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<GlobalAtmosphericModelQueryHelpResponse>

    /** @see queryHelp */
    fun queryHelp(params: GlobalAtmosphericModelQueryHelpParams = GlobalAtmosphericModelQueryHelpParams.none()): CompletableFuture<GlobalAtmosphericModelQueryHelpResponse> =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): CompletableFuture<GlobalAtmosphericModelQueryHelpResponse> =
        queryHelp(
          GlobalAtmosphericModelQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: GlobalAtmosphericModelTupleParams): CompletableFuture<List<GlobalAtmosphericModelTupleResponse>> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: GlobalAtmosphericModelTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<GlobalAtmosphericModelTupleResponse>>

    /**
     * Upload a file with its metadata.
     *
     * The request body requires a zip file containing exactly two files:\
     * 1\) A file with the `.json` file extension whose content conforms to the `GlobalAtmosphericModel_Ingest` schema.\
     * 2\) A file with the `.geojson` file extension.
     *
     * The JSON and GEOJSON files will be associated with each other other via the `id` field. Query the metadata via `GET /udl/globalatmosphericmodel` and use `GET /udl/globalatmosphericmodel/getFile/{id}` to retrieve the compressed GEOJSON file as `.gz` extension.
     *
     * This operation only accepts application/zip media. The application/json request body is documented to provide a convenient reference to the ingest schema.
     *
     * This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: GlobalAtmosphericModelUnvalidatedPublishParams): CompletableFuture<Void?> =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: GlobalAtmosphericModelUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [GlobalAtmosphericModelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalAtmosphericModelServiceAsync.WithRawResponse

        fun history(): HistoryServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/globalatmosphericmodel/{id}`, but is otherwise the same as [GlobalAtmosphericModelServiceAsync.retrieve]. */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<GlobalAtmosphericModelRetrieveResponse>> =
            retrieve(
              id, GlobalAtmosphericModelRetrieveParams.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, params: GlobalAtmosphericModelRetrieveParams = GlobalAtmosphericModelRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<GlobalAtmosphericModelRetrieveResponse>> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        fun retrieve(id: String, params: GlobalAtmosphericModelRetrieveParams = GlobalAtmosphericModelRetrieveParams.none()): CompletableFuture<HttpResponseFor<GlobalAtmosphericModelRetrieveResponse>> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        fun retrieve(params: GlobalAtmosphericModelRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<GlobalAtmosphericModelRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(params: GlobalAtmosphericModelRetrieveParams): CompletableFuture<HttpResponseFor<GlobalAtmosphericModelRetrieveResponse>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<GlobalAtmosphericModelRetrieveResponse>> =
            retrieve(
              id,
              GlobalAtmosphericModelRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/globalatmosphericmodel/count`, but is otherwise the same as [GlobalAtmosphericModelServiceAsync.count]. */
        fun count(params: GlobalAtmosphericModelCountParams): CompletableFuture<HttpResponseFor<String>> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        fun count(params: GlobalAtmosphericModelCountParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<String>>

        /** Returns a raw HTTP response for `get /udl/globalatmosphericmodel/getFile/{id}`, but is otherwise the same as [GlobalAtmosphericModelServiceAsync.getFile]. */
        fun getFile(id: String): CompletableFuture<HttpResponse> =
            getFile(
              id, GlobalAtmosphericModelGetFileParams.none()
            )

        /** @see getFile */
        fun getFile(id: String, params: GlobalAtmosphericModelGetFileParams = GlobalAtmosphericModelGetFileParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            getFile(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see getFile */
        fun getFile(id: String, params: GlobalAtmosphericModelGetFileParams = GlobalAtmosphericModelGetFileParams.none()): CompletableFuture<HttpResponse> =
            getFile(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see getFile */
        fun getFile(params: GlobalAtmosphericModelGetFileParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** @see getFile */
        fun getFile(params: GlobalAtmosphericModelGetFileParams): CompletableFuture<HttpResponse> =
            getFile(
              params, RequestOptions.none()
            )

        /** @see getFile */
        fun getFile(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getFile(
              id,
              GlobalAtmosphericModelGetFileParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/globalatmosphericmodel`, but is otherwise the same as [GlobalAtmosphericModelServiceAsync.query]. */
        fun query(params: GlobalAtmosphericModelQueryParams): CompletableFuture<HttpResponseFor<List<GlobalAtmosphericModelQueryResponse>>> =
            query(
              params, RequestOptions.none()
            )

        /** @see query */
        fun query(params: GlobalAtmosphericModelQueryParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<GlobalAtmosphericModelQueryResponse>>>

        /** Returns a raw HTTP response for `get /udl/globalatmosphericmodel/queryhelp`, but is otherwise the same as [GlobalAtmosphericModelServiceAsync.queryHelp]. */
        fun queryHelp(): CompletableFuture<HttpResponseFor<GlobalAtmosphericModelQueryHelpResponse>> = queryHelp(GlobalAtmosphericModelQueryHelpParams.none())

        /** @see queryHelp */
        fun queryHelp(params: GlobalAtmosphericModelQueryHelpParams = GlobalAtmosphericModelQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<GlobalAtmosphericModelQueryHelpResponse>>

        /** @see queryHelp */
        fun queryHelp(params: GlobalAtmosphericModelQueryHelpParams = GlobalAtmosphericModelQueryHelpParams.none()): CompletableFuture<HttpResponseFor<GlobalAtmosphericModelQueryHelpResponse>> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        fun queryHelp(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<GlobalAtmosphericModelQueryHelpResponse>> =
            queryHelp(
              GlobalAtmosphericModelQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/globalatmosphericmodel/tuple`, but is otherwise the same as [GlobalAtmosphericModelServiceAsync.tuple]. */
        fun tuple(params: GlobalAtmosphericModelTupleParams): CompletableFuture<HttpResponseFor<List<GlobalAtmosphericModelTupleResponse>>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        fun tuple(params: GlobalAtmosphericModelTupleParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<GlobalAtmosphericModelTupleResponse>>>

        /** Returns a raw HTTP response for `post /filedrop/udl-globalatmosphericmodel`, but is otherwise the same as [GlobalAtmosphericModelServiceAsync.unvalidatedPublish]. */
        fun unvalidatedPublish(params: GlobalAtmosphericModelUnvalidatedPublishParams): CompletableFuture<HttpResponse> =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        fun unvalidatedPublish(params: GlobalAtmosphericModelUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
