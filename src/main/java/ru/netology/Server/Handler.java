package ru.netology.Server;

import com.sun.net.httpserver.Request;

import java.io.BufferedOutputStream;

@FunctionalInterface
public interface Handler {
    void handle(Request request, BufferedOutputStream outputStream);
}