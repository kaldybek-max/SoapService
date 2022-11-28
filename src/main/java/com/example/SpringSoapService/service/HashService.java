package com.example.SpringSoapService.service;


import org.springframework.stereotype.Service;
import org.webservicesoap.hashcode.GetDealRequest;
import org.webservicesoap.hashcode.GetHashResponse;

@Service
public class HashService {

    public GetHashResponse getHashCodeObject(GetDealRequest request){
        GetHashResponse getHashResponse = new GetHashResponse();
        getHashResponse.setHashCode(request.hashCode());

        return getHashResponse;
    }

}
