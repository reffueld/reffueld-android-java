/*
 * Reffueld API
 * **Reffueld's API** 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.reffueld.client.api;

import com.reffueld.client.ApiCallback;
import com.reffueld.client.ApiClient;
import com.reffueld.client.ApiException;
import com.reffueld.client.ApiResponse;
import com.reffueld.client.Configuration;
import com.reffueld.client.Pair;
import com.reffueld.client.ProgressRequestBody;
import com.reffueld.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.reffueld.client.model.CouponListResponse;
import com.reffueld.client.model.CouponResponse;
import org.joda.time.DateTime;
import com.reffueld.client.model.InlineResponse400;
import com.reffueld.client.model.InlineResponse401;
import com.reffueld.client.model.InlineResponse404;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CouponApi {
    private ApiClient apiClient;

    public CouponApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CouponApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for cancelCoupon */
    private com.squareup.okhttp.Call cancelCouponCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/coupon/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeySecurity" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cancelCouponValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling cancelCoupon(Async)");
        }
        
        
        com.squareup.okhttp.Call call = cancelCouponCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * coupon
     * @param id Unique ID of the user requested (required)
     * @return CouponResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CouponResponse cancelCoupon(String id) throws ApiException {
        ApiResponse<CouponResponse> resp = cancelCouponWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * 
     * coupon
     * @param id Unique ID of the user requested (required)
     * @return ApiResponse&lt;CouponResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CouponResponse> cancelCouponWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = cancelCouponValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<CouponResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * coupon
     * @param id Unique ID of the user requested (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelCouponAsync(String id, final ApiCallback<CouponResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = cancelCouponValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CouponResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCouponByCode */
    private com.squareup.okhttp.Call getCouponByCodeCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/coupon/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (code != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeySecurity" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCouponByCodeValidateBeforeCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getCouponByCode(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getCouponByCodeCall(code, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * coupon
     * @param code  (required)
     * @return CouponResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CouponResponse getCouponByCode(String code) throws ApiException {
        ApiResponse<CouponResponse> resp = getCouponByCodeWithHttpInfo(code);
        return resp.getData();
    }

    /**
     * 
     * coupon
     * @param code  (required)
     * @return ApiResponse&lt;CouponResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CouponResponse> getCouponByCodeWithHttpInfo(String code) throws ApiException {
        com.squareup.okhttp.Call call = getCouponByCodeValidateBeforeCall(code, null, null);
        Type localVarReturnType = new TypeToken<CouponResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * coupon
     * @param code  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCouponByCodeAsync(String code, final ApiCallback<CouponResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCouponByCodeValidateBeforeCall(code, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CouponResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCouponById */
    private com.squareup.okhttp.Call getCouponByIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/coupon/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeySecurity" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCouponByIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getCouponById(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getCouponByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * coupon
     * @param id Unique ID of the user requested (required)
     * @return CouponResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CouponResponse getCouponById(String id) throws ApiException {
        ApiResponse<CouponResponse> resp = getCouponByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * 
     * coupon
     * @param id Unique ID of the user requested (required)
     * @return ApiResponse&lt;CouponResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CouponResponse> getCouponByIdWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = getCouponByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<CouponResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * coupon
     * @param id Unique ID of the user requested (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCouponByIdAsync(String id, final ApiCallback<CouponResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCouponByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CouponResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCoupons */
    private com.squareup.okhttp.Call getCouponsCall(String tag, DateTime createdBefore, DateTime createdAfter, String typeId, String fromUserId, String toUserId, DateTime cancelledBefore, DateTime cancelledAfter, Integer limit, Integer offset, String cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/coupon".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
        if (createdBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_before", createdBefore));
        if (createdAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "created_after", createdAfter));
        if (typeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type_id", typeId));
        if (fromUserId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "from_user_id", fromUserId));
        if (toUserId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "to_user_id", toUserId));
        if (cancelledBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cancelled_before", cancelledBefore));
        if (cancelledAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cancelled_after", cancelledAfter));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeySecurity" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCouponsValidateBeforeCall(String tag, DateTime createdBefore, DateTime createdAfter, String typeId, String fromUserId, String toUserId, DateTime cancelledBefore, DateTime cancelledAfter, Integer limit, Integer offset, String cursor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getCouponsCall(tag, createdBefore, createdAfter, typeId, fromUserId, toUserId, cancelledBefore, cancelledAfter, limit, offset, cursor, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * coupon
     * @param tag  (optional)
     * @param createdBefore  (optional)
     * @param createdAfter  (optional)
     * @param typeId Coupon type ID (optional)
     * @param fromUserId  (optional)
     * @param toUserId  (optional)
     * @param cancelledBefore  (optional)
     * @param cancelledAfter  (optional)
     * @param limit Number of items returned in the list (optional, default to 10)
     * @param offset Points to the n-th object in the database to start the returned list with (optional)
     * @param cursor A pointer to the first item on the list, returned by the previous query (optional)
     * @return CouponListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CouponListResponse getCoupons(String tag, DateTime createdBefore, DateTime createdAfter, String typeId, String fromUserId, String toUserId, DateTime cancelledBefore, DateTime cancelledAfter, Integer limit, Integer offset, String cursor) throws ApiException {
        ApiResponse<CouponListResponse> resp = getCouponsWithHttpInfo(tag, createdBefore, createdAfter, typeId, fromUserId, toUserId, cancelledBefore, cancelledAfter, limit, offset, cursor);
        return resp.getData();
    }

    /**
     * 
     * coupon
     * @param tag  (optional)
     * @param createdBefore  (optional)
     * @param createdAfter  (optional)
     * @param typeId Coupon type ID (optional)
     * @param fromUserId  (optional)
     * @param toUserId  (optional)
     * @param cancelledBefore  (optional)
     * @param cancelledAfter  (optional)
     * @param limit Number of items returned in the list (optional, default to 10)
     * @param offset Points to the n-th object in the database to start the returned list with (optional)
     * @param cursor A pointer to the first item on the list, returned by the previous query (optional)
     * @return ApiResponse&lt;CouponListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CouponListResponse> getCouponsWithHttpInfo(String tag, DateTime createdBefore, DateTime createdAfter, String typeId, String fromUserId, String toUserId, DateTime cancelledBefore, DateTime cancelledAfter, Integer limit, Integer offset, String cursor) throws ApiException {
        com.squareup.okhttp.Call call = getCouponsValidateBeforeCall(tag, createdBefore, createdAfter, typeId, fromUserId, toUserId, cancelledBefore, cancelledAfter, limit, offset, cursor, null, null);
        Type localVarReturnType = new TypeToken<CouponListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * coupon
     * @param tag  (optional)
     * @param createdBefore  (optional)
     * @param createdAfter  (optional)
     * @param typeId Coupon type ID (optional)
     * @param fromUserId  (optional)
     * @param toUserId  (optional)
     * @param cancelledBefore  (optional)
     * @param cancelledAfter  (optional)
     * @param limit Number of items returned in the list (optional, default to 10)
     * @param offset Points to the n-th object in the database to start the returned list with (optional)
     * @param cursor A pointer to the first item on the list, returned by the previous query (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCouponsAsync(String tag, DateTime createdBefore, DateTime createdAfter, String typeId, String fromUserId, String toUserId, DateTime cancelledBefore, DateTime cancelledAfter, Integer limit, Integer offset, String cursor, final ApiCallback<CouponListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getCouponsValidateBeforeCall(tag, createdBefore, createdAfter, typeId, fromUserId, toUserId, cancelledBefore, cancelledAfter, limit, offset, cursor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CouponListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for validateCouponByCode */
    private com.squareup.okhttp.Call validateCouponByCodeCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/coupon/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (code != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKeySecurity" };
        return apiClient.buildCall(localVarPath, "HEAD", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call validateCouponByCodeValidateBeforeCall(String code, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling validateCouponByCode(Async)");
        }
        
        
        com.squareup.okhttp.Call call = validateCouponByCodeCall(code, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * coupon
     * @param code  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void validateCouponByCode(String code) throws ApiException {
        validateCouponByCodeWithHttpInfo(code);
    }

    /**
     * 
     * coupon
     * @param code  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> validateCouponByCodeWithHttpInfo(String code) throws ApiException {
        com.squareup.okhttp.Call call = validateCouponByCodeValidateBeforeCall(code, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * coupon
     * @param code  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call validateCouponByCodeAsync(String code, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = validateCouponByCodeValidateBeforeCall(code, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
