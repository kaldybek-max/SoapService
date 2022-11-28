package com.example.SpringSoapService.endpoint;

import com.example.SpringSoapService.service.HashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.webservicesoap.hashcode.GetDealRequest;
import org.webservicesoap.hashcode.GetHashResponse;

@Endpoint
public class HashEndpoint {
    private static final String NAMESPACE = "http://www.webservicesoap.org/hashCode";

    @Autowired
    private HashService hashService;

    @PayloadRoot(localPart = "getHashCode", namespace = NAMESPACE)
    @ResponsePayload
    public GetHashResponse getHashCode(@RequestPayload GetDealRequest getDealRequest){
        return hashService.getHashCodeObject(getDealRequest);
    }



}
