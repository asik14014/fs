package com.fourseasonsweb.fs.Network

import com.fourseasonsweb.fs.Data.BaseResponse
import com.fourseasonsweb.fs.Data.Journal.*
import com.fourseasonsweb.fs.Data.User.*
import retrofit2.Call
import retrofit2.http.*

interface AccountingApiService {

    //region User
    @POST("api/user/login")
    @FormUrlEncoded
    fun login(@Field("email") login: String, @Field("password") password: String): Call<LoginResponse>

    @POST("api/user/register")
    @FormUrlEncoded
    fun register(@Body param: RegistrationModel): Call<RegistrationResponse>

    @GET("api/user/logout")
    fun logout(): Call<Void>

    @POST("api/user/changepassword")
    @FormUrlEncoded
    fun changePassword(@Body param: ChangePasswordModel): Call<Void>

    @GET("api/user/ResetPassword")
    fun resetPassword(@Field("username") login: String): Call<Void>

    @GET("api/user/SetPassword")
    fun setPassword(@Field("password") password: String): Call<Void>
    //endregion

    //region Journal

    @POST("api/journal/add")
    @FormUrlEncoded
    fun addJournal(@Body param: JournalModel): Call<JournalModel>

    @GET("api/journal/delete")
    fun deleteJournal(@Field("journalId") journalId: Int): Call<Void>

    @POST("api/journal/update")
    @FormUrlEncoded
    fun updateJournal(@Body param: JournalModel): Call<JournalModel>


    //region Access
    @POST("api/journal/addAccess")
    @FormUrlEncoded
    fun addAccess(): Call<Void>

    @GET("api/journal/deleteAccess")
    fun deleteAccess(): Call<BaseResponse>

    @POST("api/journal/addFieldAccess")
    @FormUrlEncoded
    fun addFieldAccess(): Call<Void>

    @GET("api/journal/deleteFieldAccess")
    fun deleteFieldAccess(): Call<BaseResponse>
    //endregion

    //region Dictionary
    @POST("api/journal/addDictionary")
    @FormUrlEncoded
    fun addDictionary(@Body param: DictionaryModel): Call<DictionaryModel>

    @GET("api/journal/deleteDictionary")
    fun deleteDictionary(@Field("dictionaryId") dictionaryId: Int): Call<BaseResponse>

    @POST("api/journal/updateDictionary")
    @FormUrlEncoded
    fun updateDictionary(@Body param: DictionaryModel): Call<DictionaryModel>
    //endregion

    //region Record
    @POST("api/journal/addRecord")
    @FormUrlEncoded
    fun addRecord(@Body param: RecordModel): Call<RecordModel>

    @POST("api/journal/updateRecord")
    @FormUrlEncoded
    fun updateRecord(@Body param: RecordModel): Call<RecordModel>
    //endregion

    //region Data
    @POST("api/journal/addData")
    @FormUrlEncoded
    fun addData(@Body param: DataModel): Call<DataModel>

    @POST("api/journal/updateData")
    @FormUrlEncoded
    fun updateData(@Body param: DataModel): Call<DataModel>
    //endregion

    //region Field
    @POST("api/journal/addField")
    @FormUrlEncoded
    fun addField(@Body param: FieldModel): Call<FieldModel>

    @GET("api/journal/deleteField")
    fun deleteField(): Call<BaseResponse>

    @POST("api/journal/updateField")
    @FormUrlEncoded
    fun updateField(@Body param: FieldModel): Call<FieldModel>
    //endregion

    //endregion
}