package com.wade.spring.homepage.nasa.service;

import com.wade.spring.homepage.nasa.service.data.Photos;

public interface NasaService {
    Object getApod();

    Object getNeos();

    Photos getMarsPics();
}