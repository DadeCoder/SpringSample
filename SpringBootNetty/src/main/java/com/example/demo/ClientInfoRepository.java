package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Dade on 2017/5/22.
 */
public interface ClientInfoRepository extends CrudRepository<ClientInfo, String> {
    ClientInfo findClientByclientid(String clientId);
}
