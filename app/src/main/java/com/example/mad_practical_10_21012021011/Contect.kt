package com.example.mad_practical_10_21012021011

import org.json.JSONObject
import java.io.Serializable

class Contect(val id:String, val name: String,val emailid: String,val phoneNo: String , val address: String , val latitude: Double , val longitude: Double):Serializable{

    /*
        * [
        * {"_id":"5f8d677c68d8ae7ceab6a732",
        * "name":{"first":"Lloyd","last":"York"},
        * "email":"lloyd.york@undefined.net",
        * "phone":"+1 (817) 545-3660",
        * "address":"311 Livonia Avenue, Belva, Ohio, 6019"}*/
    constructor(jsonObject: JSONObject):this("","","","","",0.0,0.0) {
        var id = jsonObject.getString("id")
        var emailid = jsonObject.getString("email")
        var phoneNo = jsonObject.getString("phone")
        val profileJson = jsonObject.getJSONObject("profile")
        var name = profileJson.getString("name")
        var address = profileJson.getString("address")
        val locationJson = profileJson.getJSONObject("location")
        var latitude = locationJson.getDouble("lat")
        var longitude = locationJson.getDouble("long")
    }

}