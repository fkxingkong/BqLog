#!/bin/sh

mkdir CMakeFiles;
cd CMakeFiles;
CC=gcc CXX=g++ cmake -DTARGET_PLATFORM:STRING=unix -DCMAKE_BUILD_TYPE=RelWithDebInfo ../../../../benchmark/cpp;
make;
cd ..;