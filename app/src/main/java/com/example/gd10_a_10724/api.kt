package com.example.gd10_a_10724
import retrofit2.http.*
import retrofit2.Response
import retrofit2.Call
import retrofit2.Callback

interface api {
    @GET("mahasiswa/{cari}")
    fun getData(@Path("cari") cari:String? = null): Call<ResponseDataMahasiswa>
    @FormUrlEncoded
    @POST("mahasiswa")
    fun createData(
        @Field("mhsnobp") mhsnobp:String?,
        @Field("mhsnama") mhsnama:String?,
        @Field("mhsalamat") mhsalamat:String?,
        @Field("prodinama") prodinama:String?,
        @Field("mhstgllhr") mhstgllhr:String?,
    ):Call<ResponseCreate>
    @DELETE("mahasiswa/{mhsnobp}")
    fun deleteData(@Path("mhsnobp")mhsnobp:
                   String?):Call<ResponseCreate>
    @FormUrlEncoded
    @PUT("mahasiswa/{mhsnobp}")
    fun updateData(
        @Path("mhsnobp") mhsnobp:String?,
        @Field("mhsnama") mhsnama:String?,
        @Field("mhsalamat") mhsalamat:String?,
        @Field("prodinama") prodinama:String?,
        @Field("mhstgllhr") mhstgllhr:String?,
    ):Call<ResponseCreate>
}
