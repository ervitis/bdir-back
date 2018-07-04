#!/usr/bin/env bash

sbt assembly
docker build -t bdir-back:latest .
docker run -p 8080:80 -P bdir-back:latest